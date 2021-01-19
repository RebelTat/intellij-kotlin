/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.shortenRefs;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/shortenRefsFir")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirShortenRefsTestGenerated extends AbstractFirShortenRefsTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTestWithMuting, this, testDataFilePath);
    }

    public void testAllFilesPresentInShortenRefsFir() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/shortenRefsFir"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @TestMetadata("idea/testData/shortenRefsFir/calls")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Calls extends AbstractFirShortenRefsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithMuting, this, testDataFilePath);
        }

        public void testAllFilesPresentInCalls() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/shortenRefsFir/calls"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("classInSameFile.kt")
        public void testClassInSameFile() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/classInSameFile.kt");
        }

        @TestMetadata("explicitlyImportedFunctionFromLocalObject.kt")
        public void testExplicitlyImportedFunctionFromLocalObject() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/explicitlyImportedFunctionFromLocalObject.kt");
        }

        @TestMetadata("extenstionFunctionOnCompanionObjectReceiverNotShortened.kt")
        public void testExtenstionFunctionOnCompanionObjectReceiverNotShortened() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/extenstionFunctionOnCompanionObjectReceiverNotShortened.kt");
        }

        @TestMetadata("extenstionFunctionOnObjectReceiverNotShortened.kt")
        public void testExtenstionFunctionOnObjectReceiverNotShortened() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/extenstionFunctionOnObjectReceiverNotShortened.kt");
        }

        @TestMetadata("extenstionFunctionReceiverNotShortened.kt")
        public void testExtenstionFunctionReceiverNotShortened() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/extenstionFunctionReceiverNotShortened.kt");
        }

        @TestMetadata("functionInSameFile.kt")
        public void testFunctionInSameFile() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/functionInSameFile.kt");
        }

        @TestMetadata("functionInSameFile2.kt")
        public void testFunctionInSameFile2() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/functionInSameFile2.kt");
        }

        @TestMetadata("functionInSameFileAmbiguous.kt")
        public void testFunctionInSameFileAmbiguous() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/functionInSameFileAmbiguous.kt");
        }

        @TestMetadata("notImportedTopLevelFunctionAmbiguous.kt")
        public void testNotImportedTopLevelFunctionAmbiguous() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/notImportedTopLevelFunctionAmbiguous.kt");
        }

        @TestMetadata("notImportedTopLevelFunctionConflictsWithImported.kt")
        public void testNotImportedTopLevelFunctionConflictsWithImported() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/notImportedTopLevelFunctionConflictsWithImported.kt");
        }

        @TestMetadata("notImportedTopLevelFunctionMissingArg.kt")
        public void testNotImportedTopLevelFunctionMissingArg() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/notImportedTopLevelFunctionMissingArg.kt");
        }

        @TestMetadata("notImportedTopLevelFunctionNoArgs.kt")
        public void testNotImportedTopLevelFunctionNoArgs() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/notImportedTopLevelFunctionNoArgs.kt");
        }

        @TestMetadata("notImportedTopLevelTypeConstructorNoArgs.kt")
        public void testNotImportedTopLevelTypeConstructorNoArgs() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/notImportedTopLevelTypeConstructorNoArgs.kt");
        }

        @TestMetadata("propertyChainCall.kt")
        public void testPropertyChainCall() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/propertyChainCall.kt");
        }

        @TestMetadata("propertyInSameFile.kt")
        public void testPropertyInSameFile() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/propertyInSameFile.kt");
        }

        @TestMetadata("propertyInSameFile2.kt")
        public void testPropertyInSameFile2() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/propertyInSameFile2.kt");
        }

        @TestMetadata("rootPackage.kt")
        public void testRootPackage() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/rootPackage.kt");
        }

        @TestMetadata("selfReferencingFunction.kt")
        public void testSelfReferencingFunction() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/selfReferencingFunction.kt");
        }

        @TestMetadata("variableNotShortened.kt")
        public void testVariableNotShortened() throws Exception {
            runTest("idea/testData/shortenRefsFir/calls/variableNotShortened.kt");
        }
    }

    @TestMetadata("idea/testData/shortenRefsFir/fakeRootPackage")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class FakeRootPackage extends AbstractFirShortenRefsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithMuting, this, testDataFilePath);
        }

        public void testAllFilesPresentInFakeRootPackage() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/shortenRefsFir/fakeRootPackage"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("rootPackageShortenFakeRootPackage.kt")
        public void testRootPackageShortenFakeRootPackage() throws Exception {
            runTest("idea/testData/shortenRefsFir/fakeRootPackage/rootPackageShortenFakeRootPackage.kt");
        }
    }

    @TestMetadata("idea/testData/shortenRefsFir/quailfiers")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Quailfiers extends AbstractFirShortenRefsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithMuting, this, testDataFilePath);
        }

        public void testAllFilesPresentInQuailfiers() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/shortenRefsFir/quailfiers"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("AlreadyImportedNestedType.kt")
        public void testAlreadyImportedNestedType() throws Exception {
            runTest("idea/testData/shortenRefsFir/quailfiers/AlreadyImportedNestedType.kt");
        }

        @TestMetadata("NestedTypeInSameFile.kt")
        public void testNestedTypeInSameFile() throws Exception {
            runTest("idea/testData/shortenRefsFir/quailfiers/NestedTypeInSameFile.kt");
        }

        @TestMetadata("NotImportedNestedType.kt")
        public void testNotImportedNestedType() throws Exception {
            runTest("idea/testData/shortenRefsFir/quailfiers/NotImportedNestedType.kt");
        }

        @TestMetadata("NotImportedTopLevelType.kt")
        public void testNotImportedTopLevelType() throws Exception {
            runTest("idea/testData/shortenRefsFir/quailfiers/NotImportedTopLevelType.kt");
        }

        @TestMetadata("TopLevelTypeInSameFile.kt")
        public void testTopLevelTypeInSameFile() throws Exception {
            runTest("idea/testData/shortenRefsFir/quailfiers/TopLevelTypeInSameFile.kt");
        }
    }

    @TestMetadata("idea/testData/shortenRefsFir/types")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Types extends AbstractFirShortenRefsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestWithMuting, this, testDataFilePath);
        }

        public void testAllFilesPresentInTypes() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/shortenRefsFir/types"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @TestMetadata("ParameterType.kt")
        public void testParameterType() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterType.kt");
        }

        @TestMetadata("ParameterTypeConflictingTopLevelClassNotUsed.kt")
        public void testParameterTypeConflictingTopLevelClassNotUsed() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeConflictingTopLevelClassNotUsed.kt");
        }

        @TestMetadata("ParameterTypeConflictingTopLevelClassUsed.kt")
        public void testParameterTypeConflictingTopLevelClassUsed() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeConflictingTopLevelClassUsed.kt");
        }

        @TestMetadata("ParameterTypeFunctionalType.kt")
        public void testParameterTypeFunctionalType() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeFunctionalType.kt");
        }

        @TestMetadata("ParameterTypeGenericTypes.kt")
        public void testParameterTypeGenericTypes() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeGenericTypes.kt");
        }

        @TestMetadata("ParameterTypeImplicitImportBeatsStarImport.kt")
        public void testParameterTypeImplicitImportBeatsStarImport() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeImplicitImportBeatsStarImport.kt");
        }

        @TestMetadata("ParameterTypeImportedNestedClass.kt")
        public void testParameterTypeImportedNestedClass() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeImportedNestedClass.kt");
        }

        @TestMetadata("ParameterTypeImportedTypeWins.kt")
        public void testParameterTypeImportedTypeWins() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeImportedTypeWins.kt");
        }

        @TestMetadata("ParameterTypeNestedType.kt")
        public void testParameterTypeNestedType() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeNestedType.kt");
        }

        @TestMetadata("ParameterTypeNestedTypeWithoutPackageNotShorten.kt")
        public void testParameterTypeNestedTypeWithoutPackageNotShorten() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeNestedTypeWithoutPackageNotShorten.kt");
        }

        @TestMetadata("ParameterTypeNonImportedClass.kt")
        public void testParameterTypeNonImportedClass() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeNonImportedClass.kt");
        }

        @TestMetadata("ParameterTypeNonImportedClassTwice.kt")
        public void testParameterTypeNonImportedClassTwice() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeNonImportedClassTwice.kt");
        }

        @TestMetadata("ParameterTypeNotImportedNestedClass.kt")
        public void testParameterTypeNotImportedNestedClass() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeNotImportedNestedClass.kt");
        }

        @TestMetadata("ParameterTypeNullableType.kt")
        public void testParameterTypeNullableType() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeNullableType.kt");
        }

        @TestMetadata("ParameterTypeStarImportedTypeLoses.kt")
        public void testParameterTypeStarImportedTypeLoses() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeStarImportedTypeLoses.kt");
        }

        @TestMetadata("ParameterTypeTopLevelTypeLoses.kt")
        public void testParameterTypeTopLevelTypeLoses() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeTopLevelTypeLoses.kt");
        }

        @TestMetadata("ParameterTypeTopLevelTypeWins.kt")
        public void testParameterTypeTopLevelTypeWins() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeTopLevelTypeWins.kt");
        }

        @TestMetadata("ParameterTypeTwoNonImportedClassesConflict.kt")
        public void testParameterTypeTwoNonImportedClassesConflict() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/ParameterTypeTwoNonImportedClassesConflict.kt");
        }

        @TestMetadata("VariableType.kt")
        public void testVariableType() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/VariableType.kt");
        }

        @TestMetadata("VariableTypeConflictWithLocalType.kt")
        public void testVariableTypeConflictWithLocalType() throws Exception {
            runTest("idea/testData/shortenRefsFir/types/VariableTypeConflictWithLocalType.kt");
        }
    }
}
