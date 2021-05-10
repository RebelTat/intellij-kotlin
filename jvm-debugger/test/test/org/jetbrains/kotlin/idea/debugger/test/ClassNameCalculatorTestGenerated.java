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
@TestMetadata("testData/classNameCalculator")
public class ClassNameCalculatorTestGenerated extends AbstractClassNameCalculatorTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("callableReferences.kt")
    public void testCallableReferences() throws Exception {
        runTest("testData/classNameCalculator/callableReferences.kt");
    }

    @TestMetadata("delegates.kt")
    public void testDelegates() throws Exception {
        runTest("testData/classNameCalculator/delegates.kt");
    }

    @TestMetadata("inline.kt")
    public void testInline() throws Exception {
        runTest("testData/classNameCalculator/inline.kt");
    }

    @TestMetadata("nested.kt")
    public void testNested() throws Exception {
        runTest("testData/classNameCalculator/nested.kt");
    }

    @TestMetadata("objectLiterals.kt")
    public void testObjectLiterals() throws Exception {
        runTest("testData/classNameCalculator/objectLiterals.kt");
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("testData/classNameCalculator/simple.kt");
    }

    @TestMetadata("suspend.kt")
    public void testSuspend() throws Exception {
        runTest("testData/classNameCalculator/suspend.kt");
    }

    @TestMetadata("topLevel.kt")
    public void testTopLevel() throws Exception {
        runTest("testData/classNameCalculator/topLevel.kt");
    }
}
