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
@TestMetadata("testData/incremental/multiModule/multiplatform/withGeneratedContent")
public abstract class MultiplatformJpsTestWithGeneratedContentGenerated extends AbstractMultiplatformJpsTestWithGeneratedContent {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/incremental/multiModule/multiplatform/withGeneratedContent/ignoreAndWarnAboutNative")
    public static class IgnoreAndWarnAboutNative extends AbstractMultiplatformJpsTestWithGeneratedContent {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("editingCKotlin")
        public void testEditingCKotlin() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/ignoreAndWarnAboutNative/editingCKotlin/");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/incremental/multiModule/multiplatform/withGeneratedContent/simple")
    public static class Simple extends AbstractMultiplatformJpsTestWithGeneratedContent {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("editingCKotlin")
        public void testEditingCKotlin() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/simple/editingCKotlin/");
        }

        @TestMetadata("editingPJsKotlin")
        public void testEditingPJsKotlin() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/simple/editingPJsKotlin/");
        }

        @TestMetadata("editingPJvmJava")
        public void testEditingPJvmJava() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/simple/editingPJvmJava/");
        }

        @TestMetadata("editingPJvmKotlin")
        public void testEditingPJvmKotlin() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/simple/editingPJvmKotlin/");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/incremental/multiModule/multiplatform/withGeneratedContent/simpleJsJvmProjectWithTests")
    public static class SimpleJsJvmProjectWithTests extends AbstractMultiplatformJpsTestWithGeneratedContent {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("editingCMainExpectActual")
        public void testEditingCMainExpectActual() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/simpleJsJvmProjectWithTests/editingCMainExpectActual/");
        }

        @TestMetadata("editingCTestsExpectActual")
        public void testEditingCTestsExpectActual() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/simpleJsJvmProjectWithTests/editingCTestsExpectActual/");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/incremental/multiModule/multiplatform/withGeneratedContent/simpleNewMpp")
    public static class SimpleNewMpp extends AbstractMultiplatformJpsTestWithGeneratedContent {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("editingCKotlin")
        public void testEditingCKotlin() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/simpleNewMpp/editingCKotlin/");
        }

        @TestMetadata("editingPJsKotlin")
        public void testEditingPJsKotlin() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/simpleNewMpp/editingPJsKotlin/");
        }

        @TestMetadata("editingPJvmJava")
        public void testEditingPJvmJava() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/simpleNewMpp/editingPJvmJava/");
        }

        @TestMetadata("editingPJvmKotlin")
        public void testEditingPJvmKotlin() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/simpleNewMpp/editingPJvmKotlin/");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/incremental/multiModule/multiplatform/withGeneratedContent/ultimate")
    public static class Ultimate extends AbstractMultiplatformJpsTestWithGeneratedContent {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("editingACommonExpectActual")
        public void testEditingACommonExpectActual() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/ultimate/editingACommonExpectActual/");
        }

        @TestMetadata("editingAJsClientKotlin")
        public void testEditingAJsClientKotlin() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/ultimate/editingAJsClientKotlin/");
        }

        @TestMetadata("editingAJvmClientJava")
        public void testEditingAJvmClientJava() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/ultimate/editingAJvmClientJava/");
        }

        @TestMetadata("editingAJvmClientKotlin")
        public void testEditingAJvmClientKotlin() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/ultimate/editingAJvmClientKotlin/");
        }

        @TestMetadata("editingBCommonExpectActual")
        public void testEditingBCommonExpectActual() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/ultimate/editingBCommonExpectActual/");
        }

        @TestMetadata("editingRJsKotlin")
        public void testEditingRJsKotlin() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/ultimate/editingRJsKotlin/");
        }

        @TestMetadata("editingRJvmKotlin")
        public void testEditingRJvmKotlin() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/ultimate/editingRJvmKotlin/");
        }

        @TestMetadata("editingRaJsKotlin")
        public void testEditingRaJsKotlin() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/ultimate/editingRaJsKotlin/");
        }

        @TestMetadata("editingRaJvmKotlin")
        public void testEditingRaJvmKotlin() throws Exception {
            runTest("testData/incremental/multiModule/multiplatform/withGeneratedContent/ultimate/editingRaJvmKotlin/");
        }
    }
}
