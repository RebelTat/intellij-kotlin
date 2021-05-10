/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.navigation;

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
@TestMetadata("testData/navigation/implementations")
public class KotlinGotoImplementationTestGenerated extends AbstractKotlinGotoImplementationTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("AbstractClassImplementorsWithDeclaration.kt")
    public void testAbstractClassImplementorsWithDeclaration() throws Exception {
        runTest("testData/navigation/implementations/AbstractClassImplementorsWithDeclaration.kt");
    }

    @TestMetadata("ClassImplementorsWithDeclaration.kt")
    public void testClassImplementorsWithDeclaration() throws Exception {
        runTest("testData/navigation/implementations/ClassImplementorsWithDeclaration.kt");
    }

    @TestMetadata("ClassNavigation.kt")
    public void testClassNavigation() throws Exception {
        runTest("testData/navigation/implementations/ClassNavigation.kt");
    }

    @TestMetadata("ConstructorPropertyOverriddenNavigation.kt")
    public void testConstructorPropertyOverriddenNavigation() throws Exception {
        runTest("testData/navigation/implementations/ConstructorPropertyOverriddenNavigation.kt");
    }

    @TestMetadata("DefaultImplFunction.kt")
    public void testDefaultImplFunction() throws Exception {
        runTest("testData/navigation/implementations/DefaultImplFunction.kt");
    }

    @TestMetadata("DefaultImplProperty.kt")
    public void testDefaultImplProperty() throws Exception {
        runTest("testData/navigation/implementations/DefaultImplProperty.kt");
    }

    @TestMetadata("DelegatedAndDefaultImplFunction.kt")
    public void testDelegatedAndDefaultImplFunction() throws Exception {
        runTest("testData/navigation/implementations/DelegatedAndDefaultImplFunction.kt");
    }

    @TestMetadata("DelegatedFunction.kt")
    public void testDelegatedFunction() throws Exception {
        runTest("testData/navigation/implementations/DelegatedFunction.kt");
    }

    @TestMetadata("DelegatedProperty.kt")
    public void testDelegatedProperty() throws Exception {
        runTest("testData/navigation/implementations/DelegatedProperty.kt");
    }

    @TestMetadata("EnumEntriesInheritance.kt")
    public void testEnumEntriesInheritance() throws Exception {
        runTest("testData/navigation/implementations/EnumEntriesInheritance.kt");
    }

    @TestMetadata("FakeOverride.kt")
    public void testFakeOverride() throws Exception {
        runTest("testData/navigation/implementations/FakeOverride.kt");
    }

    @TestMetadata("FunctionOverrideNavigation.kt")
    public void testFunctionOverrideNavigation() throws Exception {
        runTest("testData/navigation/implementations/FunctionOverrideNavigation.kt");
    }

    @TestMetadata("GenericDelegatedAndDefaultImplFunction.kt")
    public void testGenericDelegatedAndDefaultImplFunction() throws Exception {
        runTest("testData/navigation/implementations/GenericDelegatedAndDefaultImplFunction.kt");
    }

    @TestMetadata("GenericFakeOverride.kt")
    public void testGenericFakeOverride() throws Exception {
        runTest("testData/navigation/implementations/GenericFakeOverride.kt");
    }

    @TestMetadata("ImplementGenericWithPrimitives.kt")
    public void testImplementGenericWithPrimitives() throws Exception {
        runTest("testData/navigation/implementations/ImplementGenericWithPrimitives.kt");
    }

    @TestMetadata("ImplementsInInlineClass.kt")
    public void testImplementsInInlineClass() throws Exception {
        runTest("testData/navigation/implementations/ImplementsInInlineClass.kt");
    }

    @TestMetadata("ObjectImported.kt")
    public void testObjectImported() throws Exception {
        runTest("testData/navigation/implementations/ObjectImported.kt");
    }

    @TestMetadata("OverridesInEnumEntries.kt")
    public void testOverridesInEnumEntries() throws Exception {
        runTest("testData/navigation/implementations/OverridesInEnumEntries.kt");
    }

    @TestMetadata("OverridesInInlineClass.kt")
    public void testOverridesInInlineClass() throws Exception {
        runTest("testData/navigation/implementations/OverridesInInlineClass.kt");
    }

    @TestMetadata("PropertyOverriddenNavigation.kt")
    public void testPropertyOverriddenNavigation() throws Exception {
        runTest("testData/navigation/implementations/PropertyOverriddenNavigation.kt");
    }

    @TestMetadata("TraitImplementorsWithDeclaration.kt")
    public void testTraitImplementorsWithDeclaration() throws Exception {
        runTest("testData/navigation/implementations/TraitImplementorsWithDeclaration.kt");
    }
}
