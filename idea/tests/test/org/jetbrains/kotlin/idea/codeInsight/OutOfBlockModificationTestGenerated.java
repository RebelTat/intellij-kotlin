/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight;

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
@TestMetadata("testData/codeInsight/outOfBlock")
public class OutOfBlockModificationTestGenerated extends AbstractOutOfBlockModificationTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("Comment.kt")
    public void testComment() throws Exception {
        runTest("testData/codeInsight/outOfBlock/Comment.kt");
    }

    @TestMetadata("FunBlock.kt")
    public void testFunBlock() throws Exception {
        runTest("testData/codeInsight/outOfBlock/FunBlock.kt");
    }

    @TestMetadata("FunInFun.kt")
    public void testFunInFun() throws Exception {
        runTest("testData/codeInsight/outOfBlock/FunInFun.kt");
    }

    @TestMetadata("FunInInitBlock.kt")
    public void testFunInInitBlock() throws Exception {
        runTest("testData/codeInsight/outOfBlock/FunInInitBlock.kt");
    }

    @TestMetadata("FunNoBody.kt")
    public void testFunNoBody() throws Exception {
        runTest("testData/codeInsight/outOfBlock/FunNoBody.kt");
    }

    @TestMetadata("FunNoType_Block.kt")
    public void testFunNoType_Block() throws Exception {
        runTest("testData/codeInsight/outOfBlock/FunNoType_Block.kt");
    }

    @TestMetadata("FunNoType_Block_Class.kt")
    public void testFunNoType_Block_Class() throws Exception {
        runTest("testData/codeInsight/outOfBlock/FunNoType_Block_Class.kt");
    }

    @TestMetadata("FunWithType_Initializer.kt")
    public void testFunWithType_Initializer() throws Exception {
        runTest("testData/codeInsight/outOfBlock/FunWithType_Initializer.kt");
    }

    @TestMetadata("FunWithType_Initializer_Expression.kt")
    public void testFunWithType_Initializer_Expression() throws Exception {
        runTest("testData/codeInsight/outOfBlock/FunWithType_Initializer_Expression.kt");
    }

    @TestMetadata("InAnonymousObjectDeclaration.kt")
    public void testInAnonymousObjectDeclaration() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InAnonymousObjectDeclaration.kt");
    }

    @TestMetadata("InClass.kt")
    public void testInClass() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InClass.kt");
    }

    @TestMetadata("InClassFunctionWithoutInference.kt")
    public void testInClassFunctionWithoutInference() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InClassFunctionWithoutInference.kt");
    }

    @TestMetadata("InClassInUninitializedPropertyAccessor.kt")
    public void testInClassInUninitializedPropertyAccessor() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InClassInUninitializedPropertyAccessor.kt");
    }

    @TestMetadata("InClassPrivateFunctionReturnType.kt")
    public void testInClassPrivateFunctionReturnType() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InClassPrivateFunctionReturnType.kt");
    }

    @TestMetadata("InClassPrivateFunctionWithoutInference.kt")
    public void testInClassPrivateFunctionWithoutInference() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InClassPrivateFunctionWithoutInference.kt");
    }

    @TestMetadata("InClassPrivatePropertyType.kt")
    public void testInClassPrivatePropertyType() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InClassPrivatePropertyType.kt");
    }

    @TestMetadata("InClassPropertyAccessor.kt")
    public void testInClassPropertyAccessor() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InClassPropertyAccessor.kt");
    }

    @TestMetadata("InClassPropertyInitializer.kt")
    public void testInClassPropertyInitializer() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InClassPropertyInitializer.kt");
    }

    @TestMetadata("InClassPropertyInitializer2.kt")
    public void testInClassPropertyInitializer2() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InClassPropertyInitializer2.kt");
    }

    @TestMetadata("InClassPropertyInitializerWithoutInference.kt")
    public void testInClassPropertyInitializerWithoutInference() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InClassPropertyInitializerWithoutInference.kt");
    }

    @TestMetadata("InClassPropertyInitializerWithoutInference2.kt")
    public void testInClassPropertyInitializerWithoutInference2() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InClassPropertyInitializerWithoutInference2.kt");
    }

    @TestMetadata("InComment.kt")
    public void testInComment() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InComment.kt");
    }

    @TestMetadata("InDelegateCallOfSecondaryConstructor.kt")
    public void testInDelegateCallOfSecondaryConstructor() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InDelegateCallOfSecondaryConstructor.kt");
    }

    @TestMetadata("InDelegateCallOfSecondaryConstructorInLocalClass.kt")
    public void testInDelegateCallOfSecondaryConstructorInLocalClass() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InDelegateCallOfSecondaryConstructorInLocalClass.kt");
    }

    @TestMetadata("InExtensionFunction.kt")
    public void testInExtensionFunction() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InExtensionFunction.kt");
    }

    @TestMetadata("InExtensionFunctionWithInference.kt")
    public void testInExtensionFunctionWithInference() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InExtensionFunctionWithInference.kt");
    }

    @TestMetadata("InExtensionFunctionWithoutInference.kt")
    public void testInExtensionFunctionWithoutInference() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InExtensionFunctionWithoutInference.kt");
    }

    @TestMetadata("InFunInFunctionInitializerInFun.kt")
    public void testInFunInFunctionInitializerInFun() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InFunInFunctionInitializerInFun.kt");
    }

    @TestMetadata("InFunInMultiDeclaration.kt")
    public void testInFunInMultiDeclaration() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InFunInMultiDeclaration.kt");
    }

    @TestMetadata("InFunInObject.kt")
    public void testInFunInObject() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InFunInObject.kt");
    }

    @TestMetadata("InFunInProperty.kt")
    public void testInFunInProperty() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InFunInProperty.kt");
    }

    @TestMetadata("InFunInPropertyInObjectLiteral.kt")
    public void testInFunInPropertyInObjectLiteral() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InFunInPropertyInObjectLiteral.kt");
    }

    @TestMetadata("InFunObjectLiteral.kt")
    public void testInFunObjectLiteral() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InFunObjectLiteral.kt");
    }

    @TestMetadata("InFunctionLiteral.kt")
    public void testInFunctionLiteral() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InFunctionLiteral.kt");
    }

    @TestMetadata("InGlobalPropertyWithGetter.kt")
    public void testInGlobalPropertyWithGetter() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InGlobalPropertyWithGetter.kt");
    }

    @TestMetadata("InKDocComment.kt")
    public void testInKDocComment() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InKDocComment.kt");
    }

    @TestMetadata("InLambdaFunction.kt")
    public void testInLambdaFunction() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InLambdaFunction.kt");
    }

    @TestMetadata("InMethod.kt")
    public void testInMethod() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InMethod.kt");
    }

    @TestMetadata("InMethodUnreacableCode.kt")
    public void testInMethodUnreacableCode() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InMethodUnreacableCode.kt");
    }

    @TestMetadata("InNestedClass.kt")
    public void testInNestedClass() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InNestedClass.kt");
    }

    @TestMetadata("InNestedClassFunNoTypeBlock.kt")
    public void testInNestedClassFunNoTypeBlock() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InNestedClassFunNoTypeBlock.kt");
    }

    @TestMetadata("InNestedClassFunNoTypeBlockExpression.kt")
    public void testInNestedClassFunNoTypeBlockExpression() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InNestedClassFunNoTypeBlockExpression.kt");
    }

    @TestMetadata("InObjectPrivateFunctionReturnType.kt")
    public void testInObjectPrivateFunctionReturnType() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InObjectPrivateFunctionReturnType.kt");
    }

    @TestMetadata("InObjectPrivateFunctionWithoutInference.kt")
    public void testInObjectPrivateFunctionWithoutInference() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InObjectPrivateFunctionWithoutInference.kt");
    }

    @TestMetadata("InObjectPrivatePropertyType.kt")
    public void testInObjectPrivatePropertyType() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InObjectPrivatePropertyType.kt");
    }

    @TestMetadata("InPrimaryConstructor.kt")
    public void testInPrimaryConstructor() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InPrimaryConstructor.kt");
    }

    @TestMetadata("InPropertyAccessorSpecifyType.kt")
    public void testInPropertyAccessorSpecifyType() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InPropertyAccessorSpecifyType.kt");
    }

    @TestMetadata("InPropertyAccessorWithAnnotation.kt")
    public void testInPropertyAccessorWithAnnotation() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InPropertyAccessorWithAnnotation.kt");
    }

    @TestMetadata("InPropertyAccessorWithInference.kt")
    public void testInPropertyAccessorWithInference() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InPropertyAccessorWithInference.kt");
    }

    @TestMetadata("InPropertyAccessorWithInferenceInClass.kt")
    public void testInPropertyAccessorWithInferenceInClass() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InPropertyAccessorWithInferenceInClass.kt");
    }

    @TestMetadata("InPropertyAccessorWithoutInferenceInClass.kt")
    public void testInPropertyAccessorWithoutInferenceInClass() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InPropertyAccessorWithoutInferenceInClass.kt");
    }

    @TestMetadata("InPropertyWithFunctionLiteral.kt")
    public void testInPropertyWithFunctionLiteral() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InPropertyWithFunctionLiteral.kt");
    }

    @TestMetadata("InPropertyWithInference.kt")
    public void testInPropertyWithInference() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InPropertyWithInference.kt");
    }

    @TestMetadata("InPropertyWithoutInference.kt")
    public void testInPropertyWithoutInference() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InPropertyWithoutInference.kt");
    }

    @TestMetadata("InSecondaryConstructorBody.kt")
    public void testInSecondaryConstructorBody() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InSecondaryConstructorBody.kt");
    }

    @TestMetadata("InSecondaryConstructorParameter.kt")
    public void testInSecondaryConstructorParameter() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InSecondaryConstructorParameter.kt");
    }

    @TestMetadata("InSuperCtorLambda.kt")
    public void testInSuperCtorLambda() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InSuperCtorLambda.kt");
    }

    @TestMetadata("InSuperTypeCallCallInLambdaInCall.kt")
    public void testInSuperTypeCallCallInLambdaInCall() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InSuperTypeCallCallInLambdaInCall.kt");
    }

    @TestMetadata("InSuperTypeCallInLambaInBody.kt")
    public void testInSuperTypeCallInLambaInBody() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InSuperTypeCallInLambaInBody.kt");
    }

    @TestMetadata("InSuperTypeCallInLambdaParameters.kt")
    public void testInSuperTypeCallInLambdaParameters() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InSuperTypeCallInLambdaParameters.kt");
    }

    @TestMetadata("InTopFun.kt")
    public void testInTopFun() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InTopFun.kt");
    }

    @TestMetadata("InUninitializedPropertyAccessor.kt")
    public void testInUninitializedPropertyAccessor() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InUninitializedPropertyAccessor.kt");
    }

    @TestMetadata("InfixFunWhitespace.kt")
    public void testInfixFunWhitespace() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InfixFunWhitespace.kt");
    }

    @TestMetadata("InitBlock.kt")
    public void testInitBlock() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InitBlock.kt");
    }

    @TestMetadata("InitBlockInLocalClass.kt")
    public void testInitBlockInLocalClass() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InitBlockInLocalClass.kt");
    }

    @TestMetadata("InitBlockInObject.kt")
    public void testInitBlockInObject() throws Exception {
        runTest("testData/codeInsight/outOfBlock/InitBlockInObject.kt");
    }

    @TestMetadata("LocalFunWithBody.kt")
    public void testLocalFunWithBody() throws Exception {
        runTest("testData/codeInsight/outOfBlock/LocalFunWithBody.kt");
    }

    @TestMetadata("LocalFunWithBodyInClass.kt")
    public void testLocalFunWithBodyInClass() throws Exception {
        runTest("testData/codeInsight/outOfBlock/LocalFunWithBodyInClass.kt");
    }

    @TestMetadata("Object_FunNoType_Block.kt")
    public void testObject_FunNoType_Block() throws Exception {
        runTest("testData/codeInsight/outOfBlock/Object_FunNoType_Block.kt");
    }

    @TestMetadata("Object_FunNoType_Block_Expression.kt")
    public void testObject_FunNoType_Block_Expression() throws Exception {
        runTest("testData/codeInsight/outOfBlock/Object_FunNoType_Block_Expression.kt");
    }

    @TestMetadata("PropNotNullType_Initializer_ObjectLiteral_Fun.kt")
    public void testPropNotNullType_Initializer_ObjectLiteral_Fun() throws Exception {
        runTest("testData/codeInsight/outOfBlock/PropNotNullType_Initializer_ObjectLiteral_Fun.kt");
    }

    @TestMetadata("PropNullType_Initializer_If_Fun.kt")
    public void testPropNullType_Initializer_If_Fun() throws Exception {
        runTest("testData/codeInsight/outOfBlock/PropNullType_Initializer_If_Fun.kt");
    }

    @TestMetadata("PropNullType_Initializer_ObjectLiteral_Fun.kt")
    public void testPropNullType_Initializer_ObjectLiteral_Fun() throws Exception {
        runTest("testData/codeInsight/outOfBlock/PropNullType_Initializer_ObjectLiteral_Fun.kt");
    }

    @TestMetadata("PropertyNoType_Initializer_String.kt")
    public void testPropertyNoType_Initializer_String() throws Exception {
        runTest("testData/codeInsight/outOfBlock/PropertyNoType_Initializer_String.kt");
    }

    @TestMetadata("PropertyWithType_Initializer_String.kt")
    public void testPropertyWithType_Initializer_String() throws Exception {
        runTest("testData/codeInsight/outOfBlock/PropertyWithType_Initializer_String.kt");
    }

    @TestMetadata("scriptInLambdaExpression.kts")
    public void testScriptInLambdaExpression() throws Exception {
        runTest("testData/codeInsight/outOfBlock/scriptInLambdaExpression.kts");
    }

    @TestMetadata("scriptTopLevelCallExpression.kts")
    public void testScriptTopLevelCallExpression() throws Exception {
        runTest("testData/codeInsight/outOfBlock/scriptTopLevelCallExpression.kts");
    }

    @TestMetadata("scriptTopLevelExpression.kts")
    public void testScriptTopLevelExpression() throws Exception {
        runTest("testData/codeInsight/outOfBlock/scriptTopLevelExpression.kts");
    }

    @TestMetadata("StringInSuperConstroctorCall.kt")
    public void testStringInSuperConstroctorCall() throws Exception {
        runTest("testData/codeInsight/outOfBlock/StringInSuperConstroctorCall.kt");
    }

    @TestMetadata("Uncomment.kt")
    public void testUncomment() throws Exception {
        runTest("testData/codeInsight/outOfBlock/Uncomment.kt");
    }

    @TestMetadata("WholeFileChanged.kt")
    public void testWholeFileChanged() throws Exception {
        runTest("testData/codeInsight/outOfBlock/WholeFileChanged.kt");
    }
}
