/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.slicer;

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
@TestMetadata("testData/slicer/inflow")
public class SlicerLeafGroupingTestGenerated extends AbstractSlicerLeafGroupingTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("abstractFun.kt")
    public void testAbstractFun() throws Exception {
        runTest("testData/slicer/inflow/abstractFun.kt");
    }

    @TestMetadata("anonymousFunBodyExpression.kt")
    public void testAnonymousFunBodyExpression() throws Exception {
        runTest("testData/slicer/inflow/anonymousFunBodyExpression.kt");
    }

    @TestMetadata("anonymousFunReturnExpression.kt")
    public void testAnonymousFunReturnExpression() throws Exception {
        runTest("testData/slicer/inflow/anonymousFunReturnExpression.kt");
    }

    @TestMetadata("anonymousFunctionParameter.kt")
    public void testAnonymousFunctionParameter() throws Exception {
        runTest("testData/slicer/inflow/anonymousFunctionParameter.kt");
    }

    @TestMetadata("cast.kt")
    public void testCast() throws Exception {
        runTest("testData/slicer/inflow/cast.kt");
    }

    @TestMetadata("compositeAssignments.kt")
    public void testCompositeAssignments() throws Exception {
        runTest("testData/slicer/inflow/compositeAssignments.kt");
    }

    @TestMetadata("dataClassCopy.kt")
    public void testDataClassCopy() throws Exception {
        runTest("testData/slicer/inflow/dataClassCopy.kt");
    }

    @TestMetadata("defaultGetterFieldInSetter.kt")
    public void testDefaultGetterFieldInSetter() throws Exception {
        runTest("testData/slicer/inflow/defaultGetterFieldInSetter.kt");
    }

    @TestMetadata("delegateGetter.kt")
    public void testDelegateGetter() throws Exception {
        runTest("testData/slicer/inflow/delegateGetter.kt");
    }

    @TestMetadata("delegateToJavaGetter.kt")
    public void testDelegateToJavaGetter() throws Exception {
        runTest("testData/slicer/inflow/delegateToJavaGetter.kt");
    }

    @TestMetadata("diamondHierarchyJKMiddleClassFun.kt")
    public void testDiamondHierarchyJKMiddleClassFun() throws Exception {
        runTest("testData/slicer/inflow/diamondHierarchyJKMiddleClassFun.kt");
    }

    @TestMetadata("diamondHierarchyJKMiddleInterfaceFun.kt")
    public void testDiamondHierarchyJKMiddleInterfaceFun() throws Exception {
        runTest("testData/slicer/inflow/diamondHierarchyJKMiddleInterfaceFun.kt");
    }

    @TestMetadata("diamondHierarchyJKRootInterfaceFun.kt")
    public void testDiamondHierarchyJKRootInterfaceFun() throws Exception {
        runTest("testData/slicer/inflow/diamondHierarchyJKRootInterfaceFun.kt");
    }

    @TestMetadata("diamondHierarchyMiddleClassFun.kt")
    public void testDiamondHierarchyMiddleClassFun() throws Exception {
        runTest("testData/slicer/inflow/diamondHierarchyMiddleClassFun.kt");
    }

    @TestMetadata("diamondHierarchyMiddleInterfaceFun.kt")
    public void testDiamondHierarchyMiddleInterfaceFun() throws Exception {
        runTest("testData/slicer/inflow/diamondHierarchyMiddleInterfaceFun.kt");
    }

    @TestMetadata("diamondHierarchyRootInterfaceFun.kt")
    public void testDiamondHierarchyRootInterfaceFun() throws Exception {
        runTest("testData/slicer/inflow/diamondHierarchyRootInterfaceFun.kt");
    }

    @TestMetadata("doubleLambdaResult.kt")
    public void testDoubleLambdaResult() throws Exception {
        runTest("testData/slicer/inflow/doubleLambdaResult.kt");
    }

    @TestMetadata("extensionLambdaImplicitParameter.kt")
    public void testExtensionLambdaImplicitParameter() throws Exception {
        runTest("testData/slicer/inflow/extensionLambdaImplicitParameter.kt");
    }

    @TestMetadata("extensionLambdaParameter.kt")
    public void testExtensionLambdaParameter() throws Exception {
        runTest("testData/slicer/inflow/extensionLambdaParameter.kt");
    }

    @TestMetadata("extensionLambdaReceiver.kt")
    public void testExtensionLambdaReceiver() throws Exception {
        runTest("testData/slicer/inflow/extensionLambdaReceiver.kt");
    }

    @TestMetadata("funParamerer.kt")
    public void testFunParamerer() throws Exception {
        runTest("testData/slicer/inflow/funParamerer.kt");
    }

    @TestMetadata("funParamererWithDefault.kt")
    public void testFunParamererWithDefault() throws Exception {
        runTest("testData/slicer/inflow/funParamererWithDefault.kt");
    }

    @TestMetadata("funResultViaCallableRef.kt")
    public void testFunResultViaCallableRef() throws Exception {
        runTest("testData/slicer/inflow/funResultViaCallableRef.kt");
    }

    @TestMetadata("funResultViaCallableRefWithAssignment.kt")
    public void testFunResultViaCallableRefWithAssignment() throws Exception {
        runTest("testData/slicer/inflow/funResultViaCallableRefWithAssignment.kt");
    }

    @TestMetadata("funResultViaCallableRefWithDirectCall.kt")
    public void testFunResultViaCallableRefWithDirectCall() throws Exception {
        runTest("testData/slicer/inflow/funResultViaCallableRefWithDirectCall.kt");
    }

    @TestMetadata("funWithExpressionBody.kt")
    public void testFunWithExpressionBody() throws Exception {
        runTest("testData/slicer/inflow/funWithExpressionBody.kt");
    }

    @TestMetadata("funWithReturnExpressions.kt")
    public void testFunWithReturnExpressions() throws Exception {
        runTest("testData/slicer/inflow/funWithReturnExpressions.kt");
    }

    @TestMetadata("getterAndSetterUsingField.kt")
    public void testGetterAndSetterUsingField() throws Exception {
        runTest("testData/slicer/inflow/getterAndSetterUsingField.kt");
    }

    @TestMetadata("getterExpressionBody.kt")
    public void testGetterExpressionBody() throws Exception {
        runTest("testData/slicer/inflow/getterExpressionBody.kt");
    }

    @TestMetadata("getterReturnExpression.kt")
    public void testGetterReturnExpression() throws Exception {
        runTest("testData/slicer/inflow/getterReturnExpression.kt");
    }

    @TestMetadata("ifExpression.kt")
    public void testIfExpression() throws Exception {
        runTest("testData/slicer/inflow/ifExpression.kt");
    }

    @TestMetadata("inlineExtensionImplicitReceiver.kt")
    public void testInlineExtensionImplicitReceiver() throws Exception {
        runTest("testData/slicer/inflow/inlineExtensionImplicitReceiver.kt");
    }

    @TestMetadata("inlineFunctionManyCalls.kt")
    public void testInlineFunctionManyCalls() throws Exception {
        runTest("testData/slicer/inflow/inlineFunctionManyCalls.kt");
    }

    @TestMetadata("lambdaImplicitParameter.kt")
    public void testLambdaImplicitParameter() throws Exception {
        runTest("testData/slicer/inflow/lambdaImplicitParameter.kt");
    }

    @TestMetadata("lambdaParameter.kt")
    public void testLambdaParameter() throws Exception {
        runTest("testData/slicer/inflow/lambdaParameter.kt");
    }

    @TestMetadata("lambdaResult.kt")
    public void testLambdaResult() throws Exception {
        runTest("testData/slicer/inflow/lambdaResult.kt");
    }

    @TestMetadata("lambdaResultWithAssignments.kt")
    public void testLambdaResultWithAssignments() throws Exception {
        runTest("testData/slicer/inflow/lambdaResultWithAssignments.kt");
    }

    @TestMetadata("lambdaResultWithDirectCall.kt")
    public void testLambdaResultWithDirectCall() throws Exception {
        runTest("testData/slicer/inflow/lambdaResultWithDirectCall.kt");
    }

    @TestMetadata("lambdaResultWithDirectCallViaAssignment.kt")
    public void testLambdaResultWithDirectCallViaAssignment() throws Exception {
        runTest("testData/slicer/inflow/lambdaResultWithDirectCallViaAssignment.kt");
    }

    @TestMetadata("localVal.kt")
    public void testLocalVal() throws Exception {
        runTest("testData/slicer/inflow/localVal.kt");
    }

    @TestMetadata("localVar.kt")
    public void testLocalVar() throws Exception {
        runTest("testData/slicer/inflow/localVar.kt");
    }

    @TestMetadata("memberValWithInitializer.kt")
    public void testMemberValWithInitializer() throws Exception {
        runTest("testData/slicer/inflow/memberValWithInitializer.kt");
    }

    @TestMetadata("memberValWithSplitInitializer.kt")
    public void testMemberValWithSplitInitializer() throws Exception {
        runTest("testData/slicer/inflow/memberValWithSplitInitializer.kt");
    }

    @TestMetadata("memberVarWithInitializer.kt")
    public void testMemberVarWithInitializer() throws Exception {
        runTest("testData/slicer/inflow/memberVarWithInitializer.kt");
    }

    @TestMetadata("memberVarWithSplitInitializer.kt")
    public void testMemberVarWithSplitInitializer() throws Exception {
        runTest("testData/slicer/inflow/memberVarWithSplitInitializer.kt");
    }

    @TestMetadata("noFieldInGetter.kt")
    public void testNoFieldInGetter() throws Exception {
        runTest("testData/slicer/inflow/noFieldInGetter.kt");
    }

    @TestMetadata("nonLocalReturn.kt")
    public void testNonLocalReturn() throws Exception {
        runTest("testData/slicer/inflow/nonLocalReturn.kt");
    }

    @TestMetadata("notNullAssertion.kt")
    public void testNotNullAssertion() throws Exception {
        runTest("testData/slicer/inflow/notNullAssertion.kt");
    }

    @TestMetadata("nullsAndNotNulls.kt")
    public void testNullsAndNotNulls() throws Exception {
        runTest("testData/slicer/inflow/nullsAndNotNulls.kt");
    }

    @TestMetadata("onFunctionReceiverType.kt")
    public void testOnFunctionReceiverType() throws Exception {
        runTest("testData/slicer/inflow/onFunctionReceiverType.kt");
    }

    @TestMetadata("onPropertyReceiverType.kt")
    public void testOnPropertyReceiverType() throws Exception {
        runTest("testData/slicer/inflow/onPropertyReceiverType.kt");
    }

    @TestMetadata("openFun.kt")
    public void testOpenFun() throws Exception {
        runTest("testData/slicer/inflow/openFun.kt");
    }

    @TestMetadata("openFunInvokeOnParameter.kt")
    public void testOpenFunInvokeOnParameter() throws Exception {
        runTest("testData/slicer/inflow/openFunInvokeOnParameter.kt");
    }

    @TestMetadata("overrideExtension1.kt")
    public void testOverrideExtension1() throws Exception {
        runTest("testData/slicer/inflow/overrideExtension1.kt");
    }

    @TestMetadata("overrideExtension2.kt")
    public void testOverrideExtension2() throws Exception {
        runTest("testData/slicer/inflow/overrideExtension2.kt");
    }

    @TestMetadata("overrideFun.kt")
    public void testOverrideFun() throws Exception {
        runTest("testData/slicer/inflow/overrideFun.kt");
    }

    @TestMetadata("overrideProperty.kt")
    public void testOverrideProperty() throws Exception {
        runTest("testData/slicer/inflow/overrideProperty.kt");
    }

    @TestMetadata("overridingFunctionResult.kt")
    public void testOverridingFunctionResult() throws Exception {
        runTest("testData/slicer/inflow/overridingFunctionResult.kt");
    }

    @TestMetadata("overridingParameter.kt")
    public void testOverridingParameter() throws Exception {
        runTest("testData/slicer/inflow/overridingParameter.kt");
    }

    @TestMetadata("overridingPropertyGetterResult.kt")
    public void testOverridingPropertyGetterResult() throws Exception {
        runTest("testData/slicer/inflow/overridingPropertyGetterResult.kt");
    }

    @TestMetadata("overridingPropertyResult.kt")
    public void testOverridingPropertyResult() throws Exception {
        runTest("testData/slicer/inflow/overridingPropertyResult.kt");
    }

    @TestMetadata("primaryConstructorParameter.kt")
    public void testPrimaryConstructorParameter() throws Exception {
        runTest("testData/slicer/inflow/primaryConstructorParameter.kt");
    }

    @TestMetadata("primaryConstructorParameterWithDefault.kt")
    public void testPrimaryConstructorParameterWithDefault() throws Exception {
        runTest("testData/slicer/inflow/primaryConstructorParameterWithDefault.kt");
    }

    @TestMetadata("propertyInInterface.kt")
    public void testPropertyInInterface() throws Exception {
        runTest("testData/slicer/inflow/propertyInInterface.kt");
    }

    @TestMetadata("qualifiedAssignmentsForQualifiedRef.kt")
    public void testQualifiedAssignmentsForQualifiedRef() throws Exception {
        runTest("testData/slicer/inflow/qualifiedAssignmentsForQualifiedRef.kt");
    }

    @TestMetadata("qualifiedAssignmentsForSimpleRef.kt")
    public void testQualifiedAssignmentsForSimpleRef() throws Exception {
        runTest("testData/slicer/inflow/qualifiedAssignmentsForSimpleRef.kt");
    }

    @TestMetadata("safeCast.kt")
    public void testSafeCast() throws Exception {
        runTest("testData/slicer/inflow/safeCast.kt");
    }

    @TestMetadata("secondaryConstructorParameter.kt")
    public void testSecondaryConstructorParameter() throws Exception {
        runTest("testData/slicer/inflow/secondaryConstructorParameter.kt");
    }

    @TestMetadata("secondaryConstructorParameterWithDefault.kt")
    public void testSecondaryConstructorParameterWithDefault() throws Exception {
        runTest("testData/slicer/inflow/secondaryConstructorParameterWithDefault.kt");
    }

    @TestMetadata("settersViaDelegateForQualifiedRef.kt")
    public void testSettersViaDelegateForQualifiedRef() throws Exception {
        runTest("testData/slicer/inflow/settersViaDelegateForQualifiedRef.kt");
    }

    @TestMetadata("settersViaDelegateForSimpleRef.kt")
    public void testSettersViaDelegateForSimpleRef() throws Exception {
        runTest("testData/slicer/inflow/settersViaDelegateForSimpleRef.kt");
    }

    @TestMetadata("settersViaJavaDelegate.kt")
    public void testSettersViaJavaDelegate() throws Exception {
        runTest("testData/slicer/inflow/settersViaJavaDelegate.kt");
    }

    @TestMetadata("thisInExtensionFunction.kt")
    public void testThisInExtensionFunction() throws Exception {
        runTest("testData/slicer/inflow/thisInExtensionFunction.kt");
    }

    @TestMetadata("thisInExtensionProperty.kt")
    public void testThisInExtensionProperty() throws Exception {
        runTest("testData/slicer/inflow/thisInExtensionProperty.kt");
    }

    @TestMetadata("topLevelVal.kt")
    public void testTopLevelVal() throws Exception {
        runTest("testData/slicer/inflow/topLevelVal.kt");
    }

    @TestMetadata("topLevelVar.kt")
    public void testTopLevelVar() throws Exception {
        runTest("testData/slicer/inflow/topLevelVar.kt");
    }

    @TestMetadata("valParameter.kt")
    public void testValParameter() throws Exception {
        runTest("testData/slicer/inflow/valParameter.kt");
    }

    @TestMetadata("varParameter.kt")
    public void testVarParameter() throws Exception {
        runTest("testData/slicer/inflow/varParameter.kt");
    }

    @TestMetadata("whenExpression.kt")
    public void testWhenExpression() throws Exception {
        runTest("testData/slicer/inflow/whenExpression.kt");
    }
}
