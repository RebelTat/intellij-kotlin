/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.debugger.test;

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
@TestRoot("jvm-debugger/test")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/continuation")
public class ContinuationStackTraceTestGenerated extends AbstractContinuationStackTraceTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("suspendFun.kt")
    public void testSuspendFun() throws Exception {
        runTest("testData/continuation/suspendFun.kt");
    }

    @TestMetadata("suspendFunWithInner.kt")
    public void testSuspendFunWithInner() throws Exception {
        runTest("testData/continuation/suspendFunWithInner.kt");
    }

    @TestMetadata("suspendLambda.kt")
    public void testSuspendLambda() throws Exception {
        runTest("testData/continuation/suspendLambda.kt");
    }
}
