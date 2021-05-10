/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.scratch;

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
@TestRoot("scripting-support")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/scratch/lineMarker")
public class ScratchLineMarkersTestGenerated extends AbstractScratchLineMarkersTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doScratchTest, this, testDataFilePath);
    }

    @TestMetadata("binaryExpression.kts")
    public void testBinaryExpression() throws Exception {
        runTest("testData/scratch/lineMarker/binaryExpression.kts");
    }

    @TestMetadata("binaryExpression2.kts")
    public void testBinaryExpression2() throws Exception {
        runTest("testData/scratch/lineMarker/binaryExpression2.kts");
    }

    @TestMetadata("constantExpression.kts")
    public void testConstantExpression() throws Exception {
        runTest("testData/scratch/lineMarker/constantExpression.kts");
    }

    @TestMetadata("for.kts")
    public void testFor() throws Exception {
        runTest("testData/scratch/lineMarker/for.kts");
    }

    @TestMetadata("function.kts")
    public void testFunction() throws Exception {
        runTest("testData/scratch/lineMarker/function.kts");
    }

    @TestMetadata("lambda.kts")
    public void testLambda() throws Exception {
        runTest("testData/scratch/lineMarker/lambda.kts");
    }

    @TestMetadata("lambda2.kts")
    public void testLambda2() throws Exception {
        runTest("testData/scratch/lineMarker/lambda2.kts");
    }

    @TestMetadata("object.kts")
    public void testObject() throws Exception {
        runTest("testData/scratch/lineMarker/object.kts");
    }

    @TestMetadata("parentesized.kts")
    public void testParentesized() throws Exception {
        runTest("testData/scratch/lineMarker/parentesized.kts");
    }

    @TestMetadata("qualified.kts")
    public void testQualified() throws Exception {
        runTest("testData/scratch/lineMarker/qualified.kts");
    }

    @TestMetadata("qualifiedMultiLine.kts")
    public void testQualifiedMultiLine() throws Exception {
        runTest("testData/scratch/lineMarker/qualifiedMultiLine.kts");
    }

    @TestMetadata("referenceExpression.kts")
    public void testReferenceExpression() throws Exception {
        runTest("testData/scratch/lineMarker/referenceExpression.kts");
    }

    @TestMetadata("val.kts")
    public void testVal() throws Exception {
        runTest("testData/scratch/lineMarker/val.kts");
    }
}
