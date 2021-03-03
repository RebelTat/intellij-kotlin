/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.low.level.api.file.structure;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FileStructureAndOutOfBlockModificationTrackerConsistencyTestGenerated extends AbstractFileStructureAndOutOfBlockModificationTrackerConsistencyTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("funInCompanionObject.kt")
    public void testFunInCompanionObject() throws Exception {
        runTest("testdata/outOfBlockProjectWide/funInCompanionObject.kt");
    }

    @TestMetadata("localFun.kt")
    public void testLocalFun() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/localFun.kt");
    }

    @TestMetadata("memberFunWithType.kt")
    public void testMemberFunWithType() throws Exception {
        runTest("testdata/outOfBlockProjectWide/memberFunWithType.kt");
    }

    @TestMetadata("memberPropertyWithType.kt")
    public void testMemberPropertyWithType() throws Exception {
        runTest("testdata/outOfBlockProjectWide/memberPropertyWithType.kt");
    }

    @TestMetadata("topLevelExpressionBodyFunWithType.kt")
    public void testTopLevelExpressionBodyFunWithType() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/topLevelExpressionBodyFunWithType.kt");
    }

    @TestMetadata("topLevelExpressionBodyFunWithoutType.kt")
    public void testTopLevelExpressionBodyFunWithoutType() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/topLevelExpressionBodyFunWithoutType.kt");
    }

    @TestMetadata("topLevelFunWithType.kt")
    public void testTopLevelFunWithType() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/topLevelFunWithType.kt");
    }

    @TestMetadata("topLevelUnitFun.kt")
    public void testTopLevelUnitFun() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/topLevelUnitFun.kt");
    }

    @TestMetadata("topPropertyWithTypeInGetter.kt")
    public void testTopPropertyWithTypeInGetter() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/topPropertyWithTypeInGetter.kt");
    }

    @TestMetadata("topPropertyWithTypeInGetterOnNextLine.kt")
    public void testTopPropertyWithTypeInGetterOnNextLine() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/topPropertyWithTypeInGetterOnNextLine.kt");
    }

    @TestMetadata("topPropertyWithTypeInInititalzer.kt")
    public void testTopPropertyWithTypeInInititalzer() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/topPropertyWithTypeInInititalzer.kt");
    }

    @TestMetadata("topPropertyWithTypeInSetter.kt")
    public void testTopPropertyWithTypeInSetter() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/topPropertyWithTypeInSetter.kt");
    }

    @TestMetadata("topPropertyWithoutTypeInGetter.kt")
    public void testTopPropertyWithoutTypeInGetter() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/topPropertyWithoutTypeInGetter.kt");
    }

    @TestMetadata("topPropertyWithoutTypeInInititalzer.kt")
    public void testTopPropertyWithoutTypeInInititalzer() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/topPropertyWithoutTypeInInititalzer.kt");
    }

    @TestMetadata("topPropertyWithoutTypeInSetter.kt")
    public void testTopPropertyWithoutTypeInSetter() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/topPropertyWithoutTypeInSetter.kt");
    }

    @TestMetadata("typeInFunctionAnnotation.kt")
    public void testTypeInFunctionAnnotation() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/typeInFunctionAnnotation.kt");
    }

    @TestMetadata("typeInFunctionAnnotationParameter.kt")
    public void testTypeInFunctionAnnotationParameter() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/typeInFunctionAnnotationParameter.kt");
    }

    @TestMetadata("typeInFunctionModifiers.kt")
    public void testTypeInFunctionModifiers() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/typeInFunctionModifiers.kt");
    }

    @TestMetadata("typeInFunctionName.kt")
    public void testTypeInFunctionName() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/typeInFunctionName.kt");
    }

    @TestMetadata("typeInFunctionParams.kt")
    public void testTypeInFunctionParams() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/typeInFunctionParams.kt");
    }

    @TestMetadata("typeInFunctionParamsType.kt")
    public void testTypeInFunctionParamsType() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/typeInFunctionParamsType.kt");
    }

    @TestMetadata("typeInFunctionReturnType.kt")
    public void testTypeInFunctionReturnType() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/typeInFunctionReturnType.kt");
    }

    @TestMetadata("typeInFunctionTypeParams.kt")
    public void testTypeInFunctionTypeParams() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/outOfBlockProjectWide/typeInFunctionTypeParams.kt");
    }
}
