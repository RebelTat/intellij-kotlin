/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.frontend.api.fir;

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
@TestRoot("frontend-fir")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/analysisSession/resolveCall")
public class ResolveCallTestGenerated extends AbstractResolveCallTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("functionCallInTheSameFile.kt")
    public void testFunctionCallInTheSameFile() throws Exception {
        runTest("testData/analysisSession/resolveCall/functionCallInTheSameFile.kt");
    }

    @TestMetadata("functionWithReceiverCall.kt")
    public void testFunctionWithReceiverCall() throws Exception {
        runTest("testData/analysisSession/resolveCall/functionWithReceiverCall.kt");
    }

    @TestMetadata("functionWithReceiverSafeCall.kt")
    public void testFunctionWithReceiverSafeCall() throws Exception {
        runTest("testData/analysisSession/resolveCall/functionWithReceiverSafeCall.kt");
    }

    @TestMetadata("implicitConstuctorCall.kt")
    public void testImplicitConstuctorCall() throws Exception {
        runTest("testData/analysisSession/resolveCall/implicitConstuctorCall.kt");
    }

    @TestMetadata("implicitJavaConstuctorCall.kt")
    public void testImplicitJavaConstuctorCall() throws Exception {
        runTest("testData/analysisSession/resolveCall/implicitJavaConstuctorCall.kt");
    }

    @TestMetadata("javaFunctionCall.kt")
    public void testJavaFunctionCall() throws Exception {
        runTest("testData/analysisSession/resolveCall/javaFunctionCall.kt");
    }

    @TestMetadata("resolveCallInSuperConstructorParam.kt")
    public void testResolveCallInSuperConstructorParam() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/resolveCallInSuperConstructorParam.kt");
    }

    @TestMetadata("simpleCallWithNonMatchingArgs.kt")
    public void testSimpleCallWithNonMatchingArgs() throws Exception {
        runTest("idea/idea-frontend-fir/testData/analysisSession/resolveCall/simpleCallWithNonMatchingArgs.kt");
    }

    @TestMetadata("variableAsFunction.kt")
    public void testVariableAsFunction() throws Exception {
        runTest("testData/analysisSession/resolveCall/variableAsFunction.kt");
    }

    @TestMetadata("variableAsFunctionLikeCall.kt")
    public void testVariableAsFunctionLikeCall() throws Exception {
        runTest("testData/analysisSession/resolveCall/variableAsFunctionLikeCall.kt");
    }
}
