/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jps.build;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.idea.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.idea.test.KotlinTestUtils;
import org.jetbrains.kotlin.idea.test.TestMetadata;
import org.jetbrains.kotlin.idea.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("jps/jps-plugin")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/incremental/cacheVersionChanged")
public class DataContainerVersionChangedTestGenerated extends AbstractDataContainerVersionChangedTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("clearedHasKotlin")
    public void testClearedHasKotlin() throws Exception {
        runTest("testData/incremental/cacheVersionChanged/clearedHasKotlin/");
    }

    @TestMetadata("exportedModule")
    public void testExportedModule() throws Exception {
        runTest("testData/incremental/cacheVersionChanged/exportedModule/");
    }

    @TestMetadata("javaOnlyModulesAreNotAffected")
    public void testJavaOnlyModulesAreNotAffected() throws Exception {
        runTest("testData/incremental/cacheVersionChanged/javaOnlyModulesAreNotAffected/");
    }

    @TestMetadata("module1Modified")
    public void testModule1Modified() throws Exception {
        runTest("testData/incremental/cacheVersionChanged/module1Modified/");
    }

    @TestMetadata("module2Modified")
    public void testModule2Modified() throws Exception {
        runTest("testData/incremental/cacheVersionChanged/module2Modified/");
    }

    @TestMetadata("moduleWithConstantModified")
    public void testModuleWithConstantModified() throws Exception {
        runTest("testData/incremental/cacheVersionChanged/moduleWithConstantModified/");
    }

    @TestMetadata("moduleWithInlineModified")
    public void testModuleWithInlineModified() throws Exception {
        runTest("testData/incremental/cacheVersionChanged/moduleWithInlineModified/");
    }

    @TestMetadata("touchedFile")
    public void testTouchedFile() throws Exception {
        runTest("testData/incremental/cacheVersionChanged/touchedFile/");
    }

    @TestMetadata("touchedOnlyJavaFile")
    public void testTouchedOnlyJavaFile() throws Exception {
        runTest("testData/incremental/cacheVersionChanged/touchedOnlyJavaFile/");
    }

    @TestMetadata("untouchedFiles")
    public void testUntouchedFiles() throws Exception {
        runTest("testData/incremental/cacheVersionChanged/untouchedFiles/");
    }

    @TestMetadata("withError")
    public void testWithError() throws Exception {
        runTest("testData/incremental/cacheVersionChanged/withError/");
    }
}
