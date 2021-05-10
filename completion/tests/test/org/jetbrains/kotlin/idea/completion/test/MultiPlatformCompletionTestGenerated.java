/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.idea.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.idea.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.idea.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("completion/tests")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/multiPlatform")
public class MultiPlatformCompletionTestGenerated extends AbstractMultiPlatformCompletionTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("classInCommon")
    public void testClassInCommon() throws Exception {
        runTest("testData/multiPlatform/classInCommon/");
    }

    @TestMetadata("classInPlatform")
    public void testClassInPlatform() throws Exception {
        runTest("testData/multiPlatform/classInPlatform/");
    }

    @TestMetadata("functionInCommon")
    public void testFunctionInCommon() throws Exception {
        runTest("testData/multiPlatform/functionInCommon/");
    }

    @TestMetadata("functionInPlatform")
    public void testFunctionInPlatform() throws Exception {
        runTest("testData/multiPlatform/functionInPlatform/");
    }
}
