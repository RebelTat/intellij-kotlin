/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test.handlers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.idea.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.idea.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-completion/testData/handlers/keywords")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirKeywordCompletionHandlerTestGenerated extends AbstractFirKeywordCompletionHandlerTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("AddCompanionToObject.kt")
    public void testAddCompanionToObject() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/AddCompanionToObject.kt");
    }

    public void testAllFilesPresentInKeywords() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/idea-completion/testData/handlers/keywords"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @TestMetadata("Break.kt")
    public void testBreak() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/Break.kt");
    }

    @TestMetadata("Catch.kt")
    public void testCatch() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/Catch.kt");
    }

    @TestMetadata("CompanionObject.kt")
    public void testCompanionObject() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/CompanionObject.kt");
    }

    @TestMetadata("Constructor.kt")
    public void testConstructor() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/Constructor.kt");
    }

    @TestMetadata("ConstructorPrimary.kt")
    public void testConstructorPrimary() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/ConstructorPrimary.kt");
    }

    @TestMetadata("Do.kt")
    public void testDo() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/Do.kt");
    }

    @TestMetadata("FileKeyword.kt")
    public void testFileKeyword() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/FileKeyword.kt");
    }

    @TestMetadata("Finally.kt")
    public void testFinally() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/Finally.kt");
    }

    @TestMetadata("For.kt")
    public void testFor() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/For.kt");
    }

    @TestMetadata("Getter1.kt")
    public void testGetter1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/Getter1.kt");
    }

    @TestMetadata("Getter2.kt")
    public void testGetter2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/Getter2.kt");
    }

    @TestMetadata("If.kt")
    public void testIf() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/If.kt");
    }

    @TestMetadata("IfLParenth.kt")
    public void testIfLParenth() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/IfLParenth.kt");
    }

    @TestMetadata("IfParansOnNextLine.kt")
    public void testIfParansOnNextLine() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/IfParansOnNextLine.kt");
    }

    @TestMetadata("IfSpace.kt")
    public void testIfSpace() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/IfSpace.kt");
    }

    @TestMetadata("Init.kt")
    public void testInit() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/Init.kt");
    }

    @TestMetadata("NoSpaceAfterNull.kt")
    public void testNoSpaceAfterNull() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/NoSpaceAfterNull.kt");
    }

    @TestMetadata("QualifiedReturnNonUnit.kt")
    public void testQualifiedReturnNonUnit() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/QualifiedReturnNonUnit.kt");
    }

    @TestMetadata("QualifiedReturnNonUnitExplicit.kt")
    public void testQualifiedReturnNonUnitExplicit() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/QualifiedReturnNonUnitExplicit.kt");
    }

    @TestMetadata("QualifiedReturnUnit.kt")
    public void testQualifiedReturnUnit() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/QualifiedReturnUnit.kt");
    }

    @TestMetadata("ReturnEmptyList.kt")
    public void testReturnEmptyList() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/ReturnEmptyList.kt");
    }

    @TestMetadata("ReturnInEmptyType.kt")
    public void testReturnInEmptyType() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/ReturnInEmptyType.kt");
    }

    @TestMetadata("ReturnInProperty.kt")
    public void testReturnInProperty() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/ReturnInProperty.kt");
    }

    @TestMetadata("ReturnInTypeFunction.kt")
    public void testReturnInTypeFunction() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/ReturnInTypeFunction.kt");
    }

    @TestMetadata("ReturnInUnit.kt")
    public void testReturnInUnit() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/ReturnInUnit.kt");
    }

    @TestMetadata("ReturnNull.kt")
    public void testReturnNull() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/ReturnNull.kt");
    }

    @TestMetadata("Setter1.kt")
    public void testSetter1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/Setter1.kt");
    }

    @TestMetadata("Setter2.kt")
    public void testSetter2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/Setter2.kt");
    }

    @TestMetadata("SpaceAfterImport.kt")
    public void testSpaceAfterImport() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/SpaceAfterImport.kt");
    }

    @TestMetadata("Try.kt")
    public void testTry() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/Try.kt");
    }

    @TestMetadata("UseSiteAnnotationTarget1.kt")
    public void testUseSiteAnnotationTarget1() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/UseSiteAnnotationTarget1.kt");
    }

    @TestMetadata("UseSiteAnnotationTarget2.kt")
    public void testUseSiteAnnotationTarget2() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/UseSiteAnnotationTarget2.kt");
    }

    @TestMetadata("UseSiteAnnotationTarget3.kt")
    public void testUseSiteAnnotationTarget3() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/UseSiteAnnotationTarget3.kt");
    }

    @TestMetadata("While.kt")
    public void testWhile() throws Exception {
        runTest("idea/idea-completion/testData/handlers/keywords/While.kt");
    }
}
