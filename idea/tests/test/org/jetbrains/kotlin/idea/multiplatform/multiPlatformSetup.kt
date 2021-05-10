/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.multiplatform

import com.intellij.openapi.module.Module
import com.intellij.openapi.module.StdModuleTypes
import com.intellij.openapi.roots.CompilerModuleExtension
import com.intellij.openapi.roots.ModuleRootModificationUtil
import com.intellij.openapi.util.io.FileUtil
import com.intellij.openapi.vfs.LocalFileSystem
import org.jetbrains.kotlin.checkers.utils.clearFileFromDiagnosticMarkup
import org.jetbrains.kotlin.idea.artifacts.AdditionalKotlinArtifacts
import org.jetbrains.kotlin.idea.artifacts.KotlinArtifacts
import org.jetbrains.kotlin.idea.framework.CommonLibraryKind
import org.jetbrains.kotlin.idea.framework.JSLibraryKind
import org.jetbrains.kotlin.idea.framework.KotlinSdkType
import org.jetbrains.kotlin.idea.stubs.AbstractMultiModuleTest
import org.jetbrains.kotlin.idea.stubs.createMultiplatformFacetM1
import org.jetbrains.kotlin.idea.stubs.createMultiplatformFacetM3
import org.jetbrains.kotlin.idea.test.ConfigLibraryUtil
import org.jetbrains.kotlin.idea.test.PluginTestCaseBase
import org.jetbrains.kotlin.idea.util.application.executeWriteCommand
import org.jetbrains.kotlin.idea.util.getProjectJdkTableSafe
import org.jetbrains.kotlin.idea.util.sourceRoots
import org.jetbrains.kotlin.platform.CommonPlatforms
import org.jetbrains.kotlin.platform.TargetPlatform
import org.jetbrains.kotlin.platform.isCommon
import org.jetbrains.kotlin.platform.js.JsPlatforms
import org.jetbrains.kotlin.platform.js.isJs
import org.jetbrains.kotlin.platform.jvm.JvmPlatforms
import org.jetbrains.kotlin.platform.jvm.isJvm
import org.jetbrains.kotlin.platform.konan.NativePlatforms
import org.jetbrains.kotlin.platform.konan.isNative
import org.jetbrains.kotlin.projectModel.*
import org.jetbrains.kotlin.idea.test.KotlinTestUtils
import org.jetbrains.kotlin.idea.test.TestJdkKind
import org.jetbrains.kotlin.types.typeUtil.closure
import java.io.File

// allows to configure a test mpp project
// testRoot is supposed to contain several directories which contain module sources roots
// configuration is based on those directories names
fun AbstractMultiModuleTest.setupMppProjectFromDirStructure(testRoot: File) {
    assert(testRoot.isDirectory) { testRoot.absolutePath + " must be a directory" }
    val dependencies = dependenciesFile(testRoot)
    if (dependencies.exists()) {
        setupMppProjectFromDependenciesFile(dependencies, testRoot)
        return
    }

    val dirs = testRoot.listFiles().filter { it.isDirectory }
    val rootInfos = dirs.map { parseDirName(it) }
    doSetupProject(rootInfos)
}

fun AbstractMultiModuleTest.setupMppProjectFromTextFile(testRoot: File) {
    assert(testRoot.isDirectory) { testRoot.absolutePath + " must be a directory" }
    val dependencies = dependenciesFile(testRoot)
    setupMppProjectFromDependenciesFile(dependencies, testRoot)
}

private fun dependenciesFile(testRoot: File) = File(testRoot, "dependencies.txt")

fun AbstractMultiModuleTest.setupMppProjectFromDependenciesFile(dependencies: File, testRoot: File) {
    val projectModel = ProjectStructureParser(testRoot).parse(FileUtil.loadFile(dependencies))

    check(projectModel.modules.isNotEmpty()) { "No modules were parsed from dependencies.txt" }

    doSetup(projectModel)
}

fun AbstractMultiModuleTest.doSetup(projectModel: ProjectResolveModel) {
    val resolveModulesToIdeaModules = projectModel.modules.map { resolveModule ->
        val ideaModule = createModule(resolveModule.name)

        addRoot(
            ideaModule,
            resolveModule.root,
            isTestRoot = false,
            transformContainedFiles = { if (it.extension == "kt") clearFileFromDiagnosticMarkup(it) }
        )

        if (resolveModule.testRoot != null) {
            addRoot(
                ideaModule,
                resolveModule.testRoot,
                isTestRoot = true,
                transformContainedFiles = { if (it.extension == "kt") clearFileFromDiagnosticMarkup(it) }
            )
        }

        resolveModule to ideaModule
    }.toMap()

    for ((resolveModule, ideaModule) in resolveModulesToIdeaModules.entries) {
        val directDependencies: Set<ResolveModule> = resolveModule.dependencies.mapTo(mutableSetOf()) { it.to }

        resolveModule.dependencies.closure(preserveOrder = true) { it.to.dependencies }.forEach {
            when (val dependency = it.to) {
                is ResolveSdk -> {
                    // Only set module SDK if it is specified in module's dependencies explicitly.
                    // Otherwise the last transitive SDK dependency will be written as Module's SDK, which doesn't happen in the real IDE
                    // This check is not lifted to capture an SDK dependency and avoid configuring it as a library or module one
                    if (dependency in directDependencies)
                        setUpSdkForModule(ideaModule, dependency)
                }

                is ResolveLibrary -> ideaModule.addLibrary(dependency.root, dependency.name, dependency.kind)

                else -> ideaModule.addDependency(resolveModulesToIdeaModules[dependency]!!)
            }
        }
    }

    for ((resolveModule, ideaModule) in resolveModulesToIdeaModules.entries) {
        val platform = resolveModule.platform
        val pureKotlinSourceFolders = ideaModule.collectSourceFolders()
        ideaModule.createMultiplatformFacetM3(
            platform,
            dependsOnModuleNames = resolveModule.dependencies.filter { it.kind == ResolveDependency.Kind.DEPENDS_ON }.map { it.to.name },
            pureKotlinSourceFolders = pureKotlinSourceFolders
        )
        // New inference is enabled here as these tests are using type refinement feature that is working only along with NI
        ideaModule.enableMultiPlatform(additionalCompilerArguments = "-Xnew-inference " + (resolveModule.additionalCompilerArgs ?: ""))
    }
}

private fun AbstractMultiModuleTest.setUpSdkForModule(ideaModule: Module, sdk: ResolveSdk) {
    when (sdk) {
        FullJdk -> ConfigLibraryUtil.configureSdk(ideaModule, PluginTestCaseBase.addJdk(testRootDisposable) {
            PluginTestCaseBase.jdk(TestJdkKind.FULL_JDK)
        })

        MockJdk -> ConfigLibraryUtil.configureSdk(ideaModule, PluginTestCaseBase.addJdk(testRootDisposable) {
            PluginTestCaseBase.jdk(TestJdkKind.MOCK_JDK)
        })

        KotlinSdk -> {
            KotlinSdkType.setUpIfNeeded(testRootDisposable)
            ConfigLibraryUtil.configureSdk(
                ideaModule,
                getProjectJdkTableSafe().findMostRecentSdkOfType(KotlinSdkType.INSTANCE) ?: error("Kotlin SDK wasn't created")
            )
        }

        else -> error("Don't know how to set up SDK of type: ${sdk::class}")
    }
}

private fun Module.collectSourceFolders(): List<String> = sourceRoots.map { it.path }

private fun AbstractMultiModuleTest.doSetupProject(rootInfos: List<RootInfo>) {
    val infosByModuleId = rootInfos.groupBy { it.moduleId }
    val modulesById = infosByModuleId.mapValues { (moduleId, infos) ->
        createModuleWithRoots(moduleId, infos)
    }

    infosByModuleId.entries.forEach { (id, rootInfos) ->
        val module = modulesById[id]!!
        rootInfos.flatMap { it.dependencies }.forEach {
            val platform = id.platform
            when (it) {
                is ModuleDependency -> module.addDependency(modulesById[it.moduleId]!!)
                is StdlibDependency -> {
                    when {
                        platform.isCommon() -> module.addLibrary(AdditionalKotlinArtifacts.kotlinStdlibCommon, kind = CommonLibraryKind)
                        platform.isJvm() -> module.addLibrary(KotlinArtifacts.instance.kotlinStdlib)
                        platform.isJs() -> module.addLibrary(KotlinArtifacts.instance.kotlinStdlibJs, kind = JSLibraryKind)
                        else -> error("Unknown platform $this")
                    }
                }
                is FullJdkDependency -> {
                    ConfigLibraryUtil.configureSdk(module, PluginTestCaseBase.addJdk(testRootDisposable) {
                        PluginTestCaseBase.jdk(TestJdkKind.FULL_JDK)
                    })
                }
                is CoroutinesDependency -> module.enableCoroutines()
                is KotlinTestDependency -> when {
                    platform.isJvm() -> module.addLibrary(KotlinArtifacts.instance.kotlinTestJunit)
                    platform.isJs() -> module.addLibrary(KotlinArtifacts.instance.kotlinTestJs, kind = JSLibraryKind)
                }
            }
        }
    }

    modulesById.forEach { (nameAndPlatform, module) ->
        val (name, platform) = nameAndPlatform
        val pureKotlinSourceFolders = module.collectSourceFolders()
        when {
            platform.isCommon() -> {
                module.createMultiplatformFacetM1(
                    platform,
                    useProjectSettings = false,
                    implementedModuleNames = emptyList(),
                    pureKotlinSourceFolders = pureKotlinSourceFolders
                )
            }

            else -> {
                val commonModuleId = ModuleId(name, CommonPlatforms.defaultCommonPlatform)

                module.createMultiplatformFacetM1(
                    platform,
                    implementedModuleNames = listOf(commonModuleId.ideaModuleName()),
                    pureKotlinSourceFolders = pureKotlinSourceFolders
                )
                module.enableMultiPlatform()

                modulesById[commonModuleId]?.let { commonModule ->
                    module.addDependency(commonModule)
                }
            }
        }
    }
}

private fun AbstractMultiModuleTest.createModuleWithRoots(
    moduleId: ModuleId,
    infos: List<RootInfo>
): Module {
    val module = createModule(moduleId.ideaModuleName())
    for ((_, isTestRoot, moduleRoot) in infos) {
        addRoot(module, moduleRoot, isTestRoot)

        if (moduleId.platform.isJs() && isTestRoot) {
            setupJsTestOutput(module)
        }
    }
    return module
}

// test line markers for JS do not work without additional setup
private fun setupJsTestOutput(module: Module) {
    ModuleRootModificationUtil.updateModel(module) {
        with(it.getModuleExtension(CompilerModuleExtension::class.java)!!) {
            inheritCompilerOutputPath(false)
            setCompilerOutputPathForTests("js_out")
        }
    }
}

private fun AbstractMultiModuleTest.createModule(name: String): Module {
    val moduleDir = KotlinTestUtils.tmpDirForReusableFolder("kotlinTest")
    val module = createModule("$moduleDir/$name", StdModuleTypes.JAVA)
    val root = LocalFileSystem.getInstance().refreshAndFindFileByIoFile(moduleDir)
    checkNotNull(root)
    module.project.executeWriteCommand("refresh") {
        root.refresh(false, true)
    }

    return module
}

private val testSuffixes = setOf("test", "tests")
private val platformNames = mapOf(
    listOf("header", "common", "expect") to CommonPlatforms.defaultCommonPlatform,
    listOf("java", "jvm") to JvmPlatforms.defaultJvmPlatform,
    listOf("java8", "jvm8") to JvmPlatforms.jvm18,
    listOf("java6", "jvm6") to JvmPlatforms.jvm16,
    listOf("js", "javascript") to JsPlatforms.defaultJsPlatform,
    listOf("native") to NativePlatforms.unspecifiedNativePlatform
)

private fun parseDirName(dir: File): RootInfo {
    val parts = dir.name.split("_")
    return RootInfo(parseModuleId(parts), parseIsTestRoot(parts), dir, parseDependencies(parts))
}

private fun parseDependencies(parts: List<String>) =
    parts.filter { it.startsWith("dep(") && it.endsWith(")") }.map {
        parseDependency(it)
    }

private fun parseDependency(it: String): Dependency {
    val dependencyString = it.removePrefix("dep(").removeSuffix(")")

    return when {
        dependencyString.equals("stdlib", ignoreCase = true) -> StdlibDependency
        dependencyString.equals("fulljdk", ignoreCase = true) -> FullJdkDependency
        dependencyString.equals("coroutines", ignoreCase = true) -> CoroutinesDependency
        dependencyString.equals("kotlin-test", ignoreCase = true) -> KotlinTestDependency
        else -> ModuleDependency(parseModuleId(dependencyString.split("-")))
    }
}

private fun parseModuleId(parts: List<String>): ModuleId {
    val platform = parsePlatform(parts)
    val name = parseModuleName(parts)
    val id = parseIndex(parts) ?: 0
    assert(id == 0 || !platform.isCommon())
    return ModuleId(name, platform, id)
}

private fun parsePlatform(parts: List<String>) =
    platformNames.entries.single { (names, _) ->
        names.any { name -> parts.any { part -> part.equals(name, ignoreCase = true) } }
    }.value

private fun parseModuleName(parts: List<String>) = when {
    parts.size > 1 -> parts.first()
    else -> "testModule"
}

private fun parseIsTestRoot(parts: List<String>) =
    testSuffixes.any { suffix -> parts.any { it.equals(suffix, ignoreCase = true) } }

private fun parseIndex(parts: List<String>): Int? {
    return parts.singleOrNull() { it.startsWith("id") }?.substringAfter("id")?.toInt()
}

private data class ModuleId(
    val groupName: String,
    val platform: TargetPlatform,
    val index: Int = 0
) {
    fun ideaModuleName(): String {
        val suffix = "_$index".takeIf { index != 0 } ?: ""
        return "${groupName}_${platform.presentableName}$suffix"
    }
}

private val TargetPlatform.presentableName: String
    get() = when {
        isCommon() -> "Common"
        isJvm() -> "JVM"
        isJs() -> "JS"
        isNative() -> "Native"
        else -> error("Unknown platform $this")
    }

private data class RootInfo(
    val moduleId: ModuleId,
    val isTestRoot: Boolean,
    val moduleRoot: File,
    val dependencies: List<Dependency>
)

private sealed class Dependency
private class ModuleDependency(val moduleId: ModuleId) : Dependency()
private object StdlibDependency : Dependency()
private object FullJdkDependency : Dependency()
private object CoroutinesDependency : Dependency()
private object KotlinTestDependency : Dependency()
