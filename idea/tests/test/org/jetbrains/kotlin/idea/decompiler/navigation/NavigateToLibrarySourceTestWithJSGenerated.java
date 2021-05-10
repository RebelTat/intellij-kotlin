/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.decompiler.navigation;

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
@TestMetadata("testData/decompiler/navigation/usercode")
public class NavigateToLibrarySourceTestWithJSGenerated extends AbstractNavigateToLibrarySourceTestWithJS {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("ClassObject.kt")
    public void testClassObject() throws Exception {
        runTest("testData/decompiler/navigation/usercode/ClassObject.kt");
    }

    @TestMetadata("Constructor.kt")
    public void testConstructor() throws Exception {
        runTest("testData/decompiler/navigation/usercode/Constructor.kt");
    }

    @TestMetadata("Enum.kt")
    public void testEnum() throws Exception {
        runTest("testData/decompiler/navigation/usercode/Enum.kt");
    }

    @TestMetadata("ExtensionFunction.kt")
    public void testExtensionFunction() throws Exception {
        runTest("testData/decompiler/navigation/usercode/ExtensionFunction.kt");
    }

    @TestMetadata("ExtensionProperty.kt")
    public void testExtensionProperty() throws Exception {
        runTest("testData/decompiler/navigation/usercode/ExtensionProperty.kt");
    }

    @TestMetadata("GenericFunctionWithExplicitlyDeclaredTypeArguments.kt")
    public void testGenericFunctionWithExplicitlyDeclaredTypeArguments() throws Exception {
        runTest("testData/decompiler/navigation/usercode/GenericFunctionWithExplicitlyDeclaredTypeArguments.kt");
    }

    @TestMetadata("GenericFunctionWithInferredTypeArguments.kt")
    public void testGenericFunctionWithInferredTypeArguments() throws Exception {
        runTest("testData/decompiler/navigation/usercode/GenericFunctionWithInferredTypeArguments.kt");
    }

    @TestMetadata("GlobalFunction.kt")
    public void testGlobalFunction() throws Exception {
        runTest("testData/decompiler/navigation/usercode/GlobalFunction.kt");
    }

    @TestMetadata("GlobalProperty.kt")
    public void testGlobalProperty() throws Exception {
        runTest("testData/decompiler/navigation/usercode/GlobalProperty.kt");
    }

    @TestMetadata("NamedObject.kt")
    public void testNamedObject() throws Exception {
        runTest("testData/decompiler/navigation/usercode/NamedObject.kt");
    }

    @TestMetadata("OverloadedFunWithTypeParam.kt")
    public void testOverloadedFunWithTypeParam() throws Exception {
        runTest("testData/decompiler/navigation/usercode/OverloadedFunWithTypeParam.kt");
    }

    @TestMetadata("Property.kt")
    public void testProperty() throws Exception {
        runTest("testData/decompiler/navigation/usercode/Property.kt");
    }

    @TestMetadata("SameNameInDifferentSources.kt")
    public void testSameNameInDifferentSources() throws Exception {
        runTest("testData/decompiler/navigation/usercode/SameNameInDifferentSources.kt");
    }

    @TestMetadata("TypeAlias.kt")
    public void testTypeAlias() throws Exception {
        runTest("testData/decompiler/navigation/usercode/TypeAlias.kt");
    }

    @TestMetadata("TypeWithSameShortName.kt")
    public void testTypeWithSameShortName() throws Exception {
        runTest("testData/decompiler/navigation/usercode/TypeWithSameShortName.kt");
    }
}
