/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.refactoring.safeDelete;

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
@TestRoot("idea/tests")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/refactoring/safeDeleteMultiModule")
public class MultiModuleSafeDeleteTestGenerated extends AbstractMultiModuleSafeDeleteTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("byActualClassMemberFunParameterLiftingToExpect/byActualClassMemberFunParameterLiftingToExpect.test")
    public void testByActualClassMemberFunParameterLiftingToExpect_ByActualClassMemberFunParameterLiftingToExpect() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byActualClassMemberFunParameterLiftingToExpect/byActualClassMemberFunParameterLiftingToExpect.test");
    }

    @TestMetadata("byActualClassMemberFun/byActualClassMemberFun.test")
    public void testByActualClassMemberFun_ByActualClassMemberFun() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byActualClassMemberFun/byActualClassMemberFun.test");
    }

    @TestMetadata("byActualClassMemberVal/byActualClassMemberVal.test")
    public void testByActualClassMemberVal_ByActualClassMemberVal() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byActualClassMemberVal/byActualClassMemberVal.test");
    }

    @TestMetadata("byActualClassPrimaryConstructorParameterLiftingToExpect/expectsAndActualsByActualClassPrimaryConstructorParameter.test")
    public void testByActualClassPrimaryConstructorParameterLiftingToExpect_ExpectsAndActualsByActualClassPrimaryConstructorParameter() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byActualClassPrimaryConstructorParameterLiftingToExpect/expectsAndActualsByActualClassPrimaryConstructorParameter.test");
    }

    @TestMetadata("byActualClassPrimaryConstructorPropertyLiftingToExpect/expectsAndActualsByActualClassPrimaryConstructorProperty.test")
    public void testByActualClassPrimaryConstructorPropertyLiftingToExpect_ExpectsAndActualsByActualClassPrimaryConstructorProperty() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byActualClassPrimaryConstructorPropertyLiftingToExpect/expectsAndActualsByActualClassPrimaryConstructorProperty.test");
    }

    @TestMetadata("byActualClassSecondaryConstructorParameterLiftingToExpect/expectsAndActualsByActualClassSecondaryConstructorParameter.test")
    public void testByActualClassSecondaryConstructorParameterLiftingToExpect_ExpectsAndActualsByActualClassSecondaryConstructorParameter() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byActualClassSecondaryConstructorParameterLiftingToExpect/expectsAndActualsByActualClassSecondaryConstructorParameter.test");
    }

    @TestMetadata("byActualClassSecondaryConstructor/byActualClassSecondaryConstructor.test")
    public void testByActualClassSecondaryConstructor_ByActualClassSecondaryConstructor() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byActualClassSecondaryConstructor/byActualClassSecondaryConstructor.test");
    }

    @TestMetadata("byActualClass/byActualClass.test")
    public void testByActualClass_ByActualClass() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byActualClass/byActualClass.test");
    }

    @TestMetadata("byActualFunParamererLiftingToExpect/byActualFunParameterLiftingToExpect.test")
    public void testByActualFunParamererLiftingToExpect_ByActualFunParameterLiftingToExpect() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byActualFunParamererLiftingToExpect/byActualFunParameterLiftingToExpect.test");
    }

    @TestMetadata("byActualFunParamererNoLiftingToExpect/byActualFunParameterNoLiftingToExpect.test")
    public void testByActualFunParamererNoLiftingToExpect_ByActualFunParameterNoLiftingToExpect() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byActualFunParamererNoLiftingToExpect/byActualFunParameterNoLiftingToExpect.test");
    }

    @TestMetadata("byActualFun/byActualFun.test")
    public void testByActualFun_ByActualFun() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byActualFun/byActualFun.test");
    }

    @TestMetadata("byActualVal/byActualVal.test")
    public void testByActualVal_ByActualVal() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byActualVal/byActualVal.test");
    }

    @TestMetadata("byExpectClassMemberFunParameter/byExpectClassMemberFunParameter.test")
    public void testByExpectClassMemberFunParameter_ByExpectClassMemberFunParameter() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byExpectClassMemberFunParameter/byExpectClassMemberFunParameter.test");
    }

    @TestMetadata("byExpectClassMemberFun/byExpectClassMemberFun.test")
    public void testByExpectClassMemberFun_ByExpectClassMemberFun() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byExpectClassMemberFun/byExpectClassMemberFun.test");
    }

    @TestMetadata("byExpectClassMemberVal/byExpectClassMemberVal.test")
    public void testByExpectClassMemberVal_ByExpectClassMemberVal() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byExpectClassMemberVal/byExpectClassMemberVal.test");
    }

    @TestMetadata("byExpectClassPrimaryConstructorParameter/expectsAndActualsByExpectClassPrimaryConstructorParameter.test")
    public void testByExpectClassPrimaryConstructorParameter_ExpectsAndActualsByExpectClassPrimaryConstructorParameter() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byExpectClassPrimaryConstructorParameter/expectsAndActualsByExpectClassPrimaryConstructorParameter.test");
    }

    @TestMetadata("byExpectClassSecondaryConstructorParameter/expectsAndActualsByExpectClassSecondaryConstructorParameter.test")
    public void testByExpectClassSecondaryConstructorParameter_ExpectsAndActualsByExpectClassSecondaryConstructorParameter() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byExpectClassSecondaryConstructorParameter/expectsAndActualsByExpectClassSecondaryConstructorParameter.test");
    }

    @TestMetadata("byExpectClassSecondaryConstructor/byExpectClassSecondaryConstructor.test")
    public void testByExpectClassSecondaryConstructor_ByExpectClassSecondaryConstructor() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byExpectClassSecondaryConstructor/byExpectClassSecondaryConstructor.test");
    }

    @TestMetadata("byExpectClass/byExpectClass.test")
    public void testByExpectClass_ByExpectClass() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byExpectClass/byExpectClass.test");
    }

    @TestMetadata("byExpectCompanion/byExpectCompanion.test")
    public void testByExpectCompanion_ByExpectCompanion() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byExpectCompanion/byExpectCompanion.test");
    }

    @TestMetadata("byExpectFunParamerer/byExpectFunParameter.test")
    public void testByExpectFunParamerer_ByExpectFunParameter() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byExpectFunParamerer/byExpectFunParameter.test");
    }

    @TestMetadata("byExpectFunVarargParamerer/byExpectFunVarargParameter.test")
    public void testByExpectFunVarargParamerer_ByExpectFunVarargParameter() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byExpectFunVarargParamerer/byExpectFunVarargParameter.test");
    }

    @TestMetadata("byExpectFun/byExpectFun.test")
    public void testByExpectFun_ByExpectFun() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byExpectFun/byExpectFun.test");
    }

    @TestMetadata("byExpectObject/byExpectObject.test")
    public void testByExpectObject_ByExpectObject() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byExpectObject/byExpectObject.test");
    }

    @TestMetadata("byExpectVal/byExpectVal.test")
    public void testByExpectVal_ByExpectVal() throws Exception {
        runTest("testData/refactoring/safeDeleteMultiModule/byExpectVal/byExpectVal.test");
    }
}
