/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test;

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
@TestRoot("completion/tests")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/smartMultiFile")
public class MultiFileSmartCompletionTestGenerated extends AbstractMultiFileSmartCompletionTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("AnonymousObjectGenericJava")
    public void testAnonymousObjectGenericJava() throws Exception {
        runTest("testData/smartMultiFile/AnonymousObjectGenericJava/");
    }

    @TestMetadata("CallableReferenceNotImported")
    public void testCallableReferenceNotImported() throws Exception {
        runTest("testData/smartMultiFile/CallableReferenceNotImported/");
    }

    @TestMetadata("CallablesInExcludedPackage")
    public void testCallablesInExcludedPackage() throws Exception {
        runTest("testData/smartMultiFile/CallablesInExcludedPackage/");
    }

    @TestMetadata("FunctionFromAnotherPackage")
    public void testFunctionFromAnotherPackage() throws Exception {
        runTest("testData/smartMultiFile/FunctionFromAnotherPackage/");
    }

    @TestMetadata("GenericInheritors1")
    public void testGenericInheritors1() throws Exception {
        runTest("testData/smartMultiFile/GenericInheritors1/");
    }

    @TestMetadata("GenericInheritors2")
    public void testGenericInheritors2() throws Exception {
        runTest("testData/smartMultiFile/GenericInheritors2/");
    }

    @TestMetadata("GenericInheritors3")
    public void testGenericInheritors3() throws Exception {
        runTest("testData/smartMultiFile/GenericInheritors3/");
    }

    @TestMetadata("GenericInheritors4")
    public void testGenericInheritors4() throws Exception {
        runTest("testData/smartMultiFile/GenericInheritors4/");
    }

    @TestMetadata("InheritorInTheSameFile")
    public void testInheritorInTheSameFile() throws Exception {
        runTest("testData/smartMultiFile/InheritorInTheSameFile/");
    }

    @TestMetadata("Inheritors")
    public void testInheritors() throws Exception {
        runTest("testData/smartMultiFile/Inheritors/");
    }

    @TestMetadata("InheritorsAndMultipleExpectedTypes")
    public void testInheritorsAndMultipleExpectedTypes() throws Exception {
        runTest("testData/smartMultiFile/InheritorsAndMultipleExpectedTypes/");
    }

    @TestMetadata("JavaStaticMethodArgument")
    public void testJavaStaticMethodArgument() throws Exception {
        runTest("testData/smartMultiFile/JavaStaticMethodArgument/");
    }

    @TestMetadata("JavaStaticMethodArgument2")
    public void testJavaStaticMethodArgument2() throws Exception {
        runTest("testData/smartMultiFile/JavaStaticMethodArgument2/");
    }

    @TestMetadata("KT_8751")
    public void testKT_8751() throws Exception {
        runTest("testData/smartMultiFile/KT_8751/");
    }

    @TestMetadata("KT_8751_2")
    public void testKT_8751_2() throws Exception {
        runTest("testData/smartMultiFile/KT_8751_2/");
    }

    @TestMetadata("NestedClassAfterAs")
    public void testNestedClassAfterAs() throws Exception {
        runTest("testData/smartMultiFile/NestedClassAfterAs/");
    }

    @TestMetadata("NoObjectDuplication")
    public void testNoObjectDuplication() throws Exception {
        runTest("testData/smartMultiFile/NoObjectDuplication/");
    }

    @TestMetadata("NotImportedContains")
    public void testNotImportedContains() throws Exception {
        runTest("testData/smartMultiFile/NotImportedContains/");
    }

    @TestMetadata("NotImportedGetValue")
    public void testNotImportedGetValue() throws Exception {
        runTest("testData/smartMultiFile/NotImportedGetValue/");
    }

    @TestMetadata("StaticMembers1")
    public void testStaticMembers1() throws Exception {
        runTest("testData/smartMultiFile/StaticMembers1/");
    }

    @TestMetadata("StaticMembers2")
    public void testStaticMembers2() throws Exception {
        runTest("testData/smartMultiFile/StaticMembers2/");
    }
}
