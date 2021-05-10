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
public abstract class InsertImportOnPasteTestGenerated extends AbstractInsertImportOnPasteTest {
    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/copyPaste/imports")
    public static class Copy extends AbstractInsertImportOnPasteTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestCopy, this, testDataFilePath);
        }

        @TestMetadata("AlreadyImportedExtensions.kt")
        public void testAlreadyImportedExtensions() throws Exception {
            runTest("testData/copyPaste/imports/AlreadyImportedExtensions.kt");
        }

        @TestMetadata("AlreadyImportedViaStar.kt")
        public void testAlreadyImportedViaStar() throws Exception {
            runTest("testData/copyPaste/imports/AlreadyImportedViaStar.kt");
        }

        @TestMetadata("ClassAlreadyImported.kt")
        public void testClassAlreadyImported() throws Exception {
            runTest("testData/copyPaste/imports/ClassAlreadyImported.kt");
        }

        @TestMetadata("ClassMember.kt")
        public void testClassMember() throws Exception {
            runTest("testData/copyPaste/imports/ClassMember.kt");
        }

        @TestMetadata("ClassObject.kt")
        public void testClassObject() throws Exception {
            runTest("testData/copyPaste/imports/ClassObject.kt");
        }

        @TestMetadata("ClassObjectAndDropImports.kt")
        public void testClassObjectAndDropImports() throws Exception {
            runTest("testData/copyPaste/imports/ClassObjectAndDropImports.kt");
        }

        @TestMetadata("ClassObjectFunInsideClass.kt")
        public void testClassObjectFunInsideClass() throws Exception {
            runTest("testData/copyPaste/imports/ClassObjectFunInsideClass.kt");
        }

        @TestMetadata("ClassObjectInner.kt")
        public void testClassObjectInner() throws Exception {
            runTest("testData/copyPaste/imports/ClassObjectInner.kt");
        }

        @TestMetadata("ClassResolvedToPackage.kt")
        public void testClassResolvedToPackage() throws Exception {
            runTest("testData/copyPaste/imports/ClassResolvedToPackage.kt");
        }

        @TestMetadata("ClassType.kt")
        public void testClassType() throws Exception {
            runTest("testData/copyPaste/imports/ClassType.kt");
        }

        @TestMetadata("ClassWithDoc.kt")
        public void testClassWithDoc() throws Exception {
            runTest("testData/copyPaste/imports/ClassWithDoc.kt");
        }

        @TestMetadata("ConflictForTypeWithTypeParameter.kt")
        public void testConflictForTypeWithTypeParameter() throws Exception {
            runTest("testData/copyPaste/imports/ConflictForTypeWithTypeParameter.kt");
        }

        @TestMetadata("ConflictWithClass.kt")
        public void testConflictWithClass() throws Exception {
            runTest("testData/copyPaste/imports/ConflictWithClass.kt");
        }

        @TestMetadata("Constructor.kt")
        public void testConstructor() throws Exception {
            runTest("testData/copyPaste/imports/Constructor.kt");
        }

        @TestMetadata("DeepInnerClasses.kt")
        public void testDeepInnerClasses() throws Exception {
            runTest("testData/copyPaste/imports/DeepInnerClasses.kt");
        }

        @TestMetadata("DefaultPackage.kt")
        public void testDefaultPackage() throws Exception {
            runTest("testData/copyPaste/imports/DefaultPackage.kt");
        }

        @TestMetadata("DelegatedProperty.kt")
        public void testDelegatedProperty() throws Exception {
            runTest("testData/copyPaste/imports/DelegatedProperty.kt");
        }

        @TestMetadata("DependenciesNotAccessibleOnPaste.kt")
        public void testDependenciesNotAccessibleOnPaste() throws Exception {
            runTest("testData/copyPaste/imports/DependenciesNotAccessibleOnPaste.kt");
        }

        @TestMetadata("DependencyOnJava.kt")
        public void testDependencyOnJava() throws Exception {
            runTest("testData/copyPaste/imports/DependencyOnJava.kt");
        }

        @TestMetadata("DependencyOnKotlinLibrary.kt")
        public void testDependencyOnKotlinLibrary() throws Exception {
            runTest("testData/copyPaste/imports/DependencyOnKotlinLibrary.kt");
        }

        @TestMetadata("DependencyOnStdLib.kt")
        public void testDependencyOnStdLib() throws Exception {
            runTest("testData/copyPaste/imports/DependencyOnStdLib.kt");
        }

        @TestMetadata("EntireFile.kt")
        public void testEntireFile() throws Exception {
            runTest("testData/copyPaste/imports/EntireFile.kt");
        }

        @TestMetadata("EnumEntries.kt")
        public void testEnumEntries() throws Exception {
            runTest("testData/copyPaste/imports/EnumEntries.kt");
        }

        @TestMetadata("Extension.kt")
        public void testExtension() throws Exception {
            runTest("testData/copyPaste/imports/Extension.kt");
        }

        @TestMetadata("ExtensionAsInfixOrOperator.kt")
        public void testExtensionAsInfixOrOperator() throws Exception {
            runTest("testData/copyPaste/imports/ExtensionAsInfixOrOperator.kt");
        }

        @TestMetadata("ExtensionCannotBeImportedOrLengthened.kt")
        public void testExtensionCannotBeImportedOrLengthened() throws Exception {
            runTest("testData/copyPaste/imports/ExtensionCannotBeImportedOrLengthened.kt");
        }

        @TestMetadata("ExtensionConflict.kt")
        public void testExtensionConflict() throws Exception {
            runTest("testData/copyPaste/imports/ExtensionConflict.kt");
        }

        @TestMetadata("ForLoop.kt")
        public void testForLoop() throws Exception {
            runTest("testData/copyPaste/imports/ForLoop.kt");
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("testData/copyPaste/imports/FullyQualified.kt");
        }

        @TestMetadata("Function.kt")
        public void testFunction() throws Exception {
            runTest("testData/copyPaste/imports/Function.kt");
        }

        @TestMetadata("FunctionAlreadyImported.kt")
        public void testFunctionAlreadyImported() throws Exception {
            runTest("testData/copyPaste/imports/FunctionAlreadyImported.kt");
        }

        @TestMetadata("FunctionParameter.kt")
        public void testFunctionParameter() throws Exception {
            runTest("testData/copyPaste/imports/FunctionParameter.kt");
        }

        @TestMetadata("GetExpression.kt")
        public void testGetExpression() throws Exception {
            runTest("testData/copyPaste/imports/GetExpression.kt");
        }

        @TestMetadata("ImportDependency.kt")
        public void testImportDependency() throws Exception {
            runTest("testData/copyPaste/imports/ImportDependency.kt");
        }

        @TestMetadata("ImportDirective.kt")
        public void testImportDirective() throws Exception {
            runTest("testData/copyPaste/imports/ImportDirective.kt");
        }

        @TestMetadata("ImportDirectiveAndClassBody.kt")
        public void testImportDirectiveAndClassBody() throws Exception {
            runTest("testData/copyPaste/imports/ImportDirectiveAndClassBody.kt");
        }

        @TestMetadata("ImportableEntityInExtensionLiteral.kt")
        public void testImportableEntityInExtensionLiteral() throws Exception {
            runTest("testData/copyPaste/imports/ImportableEntityInExtensionLiteral.kt");
        }

        @TestMetadata("ImportedElementCopied.kt")
        public void testImportedElementCopied() throws Exception {
            runTest("testData/copyPaste/imports/ImportedElementCopied.kt");
        }

        @TestMetadata("Inner.kt")
        public void testInner() throws Exception {
            runTest("testData/copyPaste/imports/Inner.kt");
        }

        @TestMetadata("Invoke.kt")
        public void testInvoke() throws Exception {
            runTest("testData/copyPaste/imports/Invoke.kt");
        }

        @TestMetadata("JavaStaticViaClass.kt")
        public void testJavaStaticViaClass() throws Exception {
            runTest("testData/copyPaste/imports/JavaStaticViaClass.kt");
        }

        @TestMetadata("KT10433.kt")
        public void testKT10433() throws Exception {
            runTest("testData/copyPaste/imports/KT10433.kt");
        }

        @TestMetadata("KeywordClassName.kt")
        public void testKeywordClassName() throws Exception {
            runTest("testData/copyPaste/imports/KeywordClassName.kt");
        }

        @TestMetadata("Local.kt")
        public void testLocal() throws Exception {
            runTest("testData/copyPaste/imports/Local.kt");
        }

        @TestMetadata("MultiCaretSelectionEntireFile.kt")
        public void testMultiCaretSelectionEntireFile() throws Exception {
            runTest("testData/copyPaste/imports/MultiCaretSelectionEntireFile.kt");
        }

        @TestMetadata("MultiDeclaration.kt")
        public void testMultiDeclaration() throws Exception {
            runTest("testData/copyPaste/imports/MultiDeclaration.kt");
        }

        @TestMetadata("MultiReferencePartiallyCopied.kt")
        public void testMultiReferencePartiallyCopied() throws Exception {
            runTest("testData/copyPaste/imports/MultiReferencePartiallyCopied.kt");
        }

        @TestMetadata("NoImportForBuiltIns.kt")
        public void testNoImportForBuiltIns() throws Exception {
            runTest("testData/copyPaste/imports/NoImportForBuiltIns.kt");
        }

        @TestMetadata("NoImportForSamePackage.kt")
        public void testNoImportForSamePackage() throws Exception {
            runTest("testData/copyPaste/imports/NoImportForSamePackage.kt");
        }

        @TestMetadata("NotReferencePosition.kt")
        public void testNotReferencePosition() throws Exception {
            runTest("testData/copyPaste/imports/NotReferencePosition.kt");
        }

        @TestMetadata("NotReferencePosition2.kt")
        public void testNotReferencePosition2() throws Exception {
            runTest("testData/copyPaste/imports/NotReferencePosition2.kt");
        }

        @TestMetadata("Object.kt")
        public void testObject() throws Exception {
            runTest("testData/copyPaste/imports/Object.kt");
        }

        @TestMetadata("OnlyKDocReferenced.kt")
        public void testOnlyKDocReferenced() throws Exception {
            runTest("testData/copyPaste/imports/OnlyKDocReferenced.kt");
        }

        @TestMetadata("OverloadedExtensionFunction.kt")
        public void testOverloadedExtensionFunction() throws Exception {
            runTest("testData/copyPaste/imports/OverloadedExtensionFunction.kt");
        }

        @TestMetadata("PackageView.kt")
        public void testPackageView() throws Exception {
            runTest("testData/copyPaste/imports/PackageView.kt");
        }

        @TestMetadata("PartiallyQualified.kt")
        public void testPartiallyQualified() throws Exception {
            runTest("testData/copyPaste/imports/PartiallyQualified.kt");
        }

        @TestMetadata("QualifiedTypeConflict.kt")
        public void testQualifiedTypeConflict() throws Exception {
            runTest("testData/copyPaste/imports/QualifiedTypeConflict.kt");
        }

        @TestMetadata("ReferencedElementAlsoCopied.kt")
        public void testReferencedElementAlsoCopied() throws Exception {
            runTest("testData/copyPaste/imports/ReferencedElementAlsoCopied.kt");
        }

        @TestMetadata("Super.kt")
        public void testSuper() throws Exception {
            runTest("testData/copyPaste/imports/Super.kt");
        }

        @TestMetadata("ThisReference.kt")
        public void testThisReference() throws Exception {
            runTest("testData/copyPaste/imports/ThisReference.kt");
        }

        @TestMetadata("TopLevelCallableRef.kt")
        public void testTopLevelCallableRef() throws Exception {
            runTest("testData/copyPaste/imports/TopLevelCallableRef.kt");
        }

        @TestMetadata("TopLevelExtensionCallableRefWithExpressionLHS.kt")
        public void testTopLevelExtensionCallableRefWithExpressionLHS() throws Exception {
            runTest("testData/copyPaste/imports/TopLevelExtensionCallableRefWithExpressionLHS.kt");
        }

        @TestMetadata("TopLevelExtensionCallableRefWithTypeLHS.kt")
        public void testTopLevelExtensionCallableRefWithTypeLHS() throws Exception {
            runTest("testData/copyPaste/imports/TopLevelExtensionCallableRefWithTypeLHS.kt");
        }

        @TestMetadata("TopLevelMemberCallableRefWithExpressionLHS.kt")
        public void testTopLevelMemberCallableRefWithExpressionLHS() throws Exception {
            runTest("testData/copyPaste/imports/TopLevelMemberCallableRefWithExpressionLHS.kt");
        }

        @TestMetadata("TopLevelMemberCallableRefWithTypeLHS.kt")
        public void testTopLevelMemberCallableRefWithTypeLHS() throws Exception {
            runTest("testData/copyPaste/imports/TopLevelMemberCallableRefWithTypeLHS.kt");
        }

        @TestMetadata("TopLevelProperty.kt")
        public void testTopLevelProperty() throws Exception {
            runTest("testData/copyPaste/imports/TopLevelProperty.kt");
        }

        @TestMetadata("Trait.kt")
        public void testTrait() throws Exception {
            runTest("testData/copyPaste/imports/Trait.kt");
        }

        @TestMetadata("TypeArgForUnresolvedCall.kt")
        public void testTypeArgForUnresolvedCall() throws Exception {
            runTest("testData/copyPaste/imports/TypeArgForUnresolvedCall.kt");
        }

        @TestMetadata("TypeParameter.kt")
        public void testTypeParameter() throws Exception {
            runTest("testData/copyPaste/imports/TypeParameter.kt");
        }

        @TestMetadata("UnresolvedOverload.kt")
        public void testUnresolvedOverload() throws Exception {
            runTest("testData/copyPaste/imports/UnresolvedOverload.kt");
        }
    }

    @RunWith(JUnit3RunnerWithInners.class)
    @TestMetadata("testData/copyPaste/imports")
    public static class Cut extends AbstractInsertImportOnPasteTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestCut, this, testDataFilePath);
        }

        @TestMetadata("AlreadyImportedExtensions.kt")
        public void testAlreadyImportedExtensions() throws Exception {
            runTest("testData/copyPaste/imports/AlreadyImportedExtensions.kt");
        }

        @TestMetadata("AlreadyImportedViaStar.kt")
        public void testAlreadyImportedViaStar() throws Exception {
            runTest("testData/copyPaste/imports/AlreadyImportedViaStar.kt");
        }

        @TestMetadata("ClassAlreadyImported.kt")
        public void testClassAlreadyImported() throws Exception {
            runTest("testData/copyPaste/imports/ClassAlreadyImported.kt");
        }

        @TestMetadata("ClassMember.kt")
        public void testClassMember() throws Exception {
            runTest("testData/copyPaste/imports/ClassMember.kt");
        }

        @TestMetadata("ClassObject.kt")
        public void testClassObject() throws Exception {
            runTest("testData/copyPaste/imports/ClassObject.kt");
        }

        @TestMetadata("ClassObjectAndDropImports.kt")
        public void testClassObjectAndDropImports() throws Exception {
            runTest("testData/copyPaste/imports/ClassObjectAndDropImports.kt");
        }

        @TestMetadata("ClassObjectFunInsideClass.kt")
        public void testClassObjectFunInsideClass() throws Exception {
            runTest("testData/copyPaste/imports/ClassObjectFunInsideClass.kt");
        }

        @TestMetadata("ClassObjectInner.kt")
        public void testClassObjectInner() throws Exception {
            runTest("testData/copyPaste/imports/ClassObjectInner.kt");
        }

        @TestMetadata("ClassResolvedToPackage.kt")
        public void testClassResolvedToPackage() throws Exception {
            runTest("testData/copyPaste/imports/ClassResolvedToPackage.kt");
        }

        @TestMetadata("ClassType.kt")
        public void testClassType() throws Exception {
            runTest("testData/copyPaste/imports/ClassType.kt");
        }

        @TestMetadata("ClassWithDoc.kt")
        public void testClassWithDoc() throws Exception {
            runTest("testData/copyPaste/imports/ClassWithDoc.kt");
        }

        @TestMetadata("ConflictForTypeWithTypeParameter.kt")
        public void testConflictForTypeWithTypeParameter() throws Exception {
            runTest("testData/copyPaste/imports/ConflictForTypeWithTypeParameter.kt");
        }

        @TestMetadata("ConflictWithClass.kt")
        public void testConflictWithClass() throws Exception {
            runTest("testData/copyPaste/imports/ConflictWithClass.kt");
        }

        @TestMetadata("Constructor.kt")
        public void testConstructor() throws Exception {
            runTest("testData/copyPaste/imports/Constructor.kt");
        }

        @TestMetadata("DeepInnerClasses.kt")
        public void testDeepInnerClasses() throws Exception {
            runTest("testData/copyPaste/imports/DeepInnerClasses.kt");
        }

        @TestMetadata("DefaultPackage.kt")
        public void testDefaultPackage() throws Exception {
            runTest("testData/copyPaste/imports/DefaultPackage.kt");
        }

        @TestMetadata("DelegatedProperty.kt")
        public void testDelegatedProperty() throws Exception {
            runTest("testData/copyPaste/imports/DelegatedProperty.kt");
        }

        @TestMetadata("DependenciesNotAccessibleOnPaste.kt")
        public void testDependenciesNotAccessibleOnPaste() throws Exception {
            runTest("testData/copyPaste/imports/DependenciesNotAccessibleOnPaste.kt");
        }

        @TestMetadata("DependencyOnJava.kt")
        public void testDependencyOnJava() throws Exception {
            runTest("testData/copyPaste/imports/DependencyOnJava.kt");
        }

        @TestMetadata("DependencyOnKotlinLibrary.kt")
        public void testDependencyOnKotlinLibrary() throws Exception {
            runTest("testData/copyPaste/imports/DependencyOnKotlinLibrary.kt");
        }

        @TestMetadata("DependencyOnStdLib.kt")
        public void testDependencyOnStdLib() throws Exception {
            runTest("testData/copyPaste/imports/DependencyOnStdLib.kt");
        }

        @TestMetadata("EntireFile.kt")
        public void testEntireFile() throws Exception {
            runTest("testData/copyPaste/imports/EntireFile.kt");
        }

        @TestMetadata("EnumEntries.kt")
        public void testEnumEntries() throws Exception {
            runTest("testData/copyPaste/imports/EnumEntries.kt");
        }

        @TestMetadata("Extension.kt")
        public void testExtension() throws Exception {
            runTest("testData/copyPaste/imports/Extension.kt");
        }

        @TestMetadata("ExtensionAsInfixOrOperator.kt")
        public void testExtensionAsInfixOrOperator() throws Exception {
            runTest("testData/copyPaste/imports/ExtensionAsInfixOrOperator.kt");
        }

        @TestMetadata("ExtensionCannotBeImportedOrLengthened.kt")
        public void testExtensionCannotBeImportedOrLengthened() throws Exception {
            runTest("testData/copyPaste/imports/ExtensionCannotBeImportedOrLengthened.kt");
        }

        @TestMetadata("ExtensionConflict.kt")
        public void testExtensionConflict() throws Exception {
            runTest("testData/copyPaste/imports/ExtensionConflict.kt");
        }

        @TestMetadata("ForLoop.kt")
        public void testForLoop() throws Exception {
            runTest("testData/copyPaste/imports/ForLoop.kt");
        }

        @TestMetadata("FullyQualified.kt")
        public void testFullyQualified() throws Exception {
            runTest("testData/copyPaste/imports/FullyQualified.kt");
        }

        @TestMetadata("Function.kt")
        public void testFunction() throws Exception {
            runTest("testData/copyPaste/imports/Function.kt");
        }

        @TestMetadata("FunctionAlreadyImported.kt")
        public void testFunctionAlreadyImported() throws Exception {
            runTest("testData/copyPaste/imports/FunctionAlreadyImported.kt");
        }

        @TestMetadata("FunctionParameter.kt")
        public void testFunctionParameter() throws Exception {
            runTest("testData/copyPaste/imports/FunctionParameter.kt");
        }

        @TestMetadata("GetExpression.kt")
        public void testGetExpression() throws Exception {
            runTest("testData/copyPaste/imports/GetExpression.kt");
        }

        @TestMetadata("ImportDependency.kt")
        public void testImportDependency() throws Exception {
            runTest("testData/copyPaste/imports/ImportDependency.kt");
        }

        @TestMetadata("ImportDirective.kt")
        public void testImportDirective() throws Exception {
            runTest("testData/copyPaste/imports/ImportDirective.kt");
        }

        @TestMetadata("ImportDirectiveAndClassBody.kt")
        public void testImportDirectiveAndClassBody() throws Exception {
            runTest("testData/copyPaste/imports/ImportDirectiveAndClassBody.kt");
        }

        @TestMetadata("ImportableEntityInExtensionLiteral.kt")
        public void testImportableEntityInExtensionLiteral() throws Exception {
            runTest("testData/copyPaste/imports/ImportableEntityInExtensionLiteral.kt");
        }

        @TestMetadata("ImportedElementCopied.kt")
        public void testImportedElementCopied() throws Exception {
            runTest("testData/copyPaste/imports/ImportedElementCopied.kt");
        }

        @TestMetadata("Inner.kt")
        public void testInner() throws Exception {
            runTest("testData/copyPaste/imports/Inner.kt");
        }

        @TestMetadata("Invoke.kt")
        public void testInvoke() throws Exception {
            runTest("testData/copyPaste/imports/Invoke.kt");
        }

        @TestMetadata("JavaStaticViaClass.kt")
        public void testJavaStaticViaClass() throws Exception {
            runTest("testData/copyPaste/imports/JavaStaticViaClass.kt");
        }

        @TestMetadata("KT10433.kt")
        public void testKT10433() throws Exception {
            runTest("testData/copyPaste/imports/KT10433.kt");
        }

        @TestMetadata("KeywordClassName.kt")
        public void testKeywordClassName() throws Exception {
            runTest("testData/copyPaste/imports/KeywordClassName.kt");
        }

        @TestMetadata("Local.kt")
        public void testLocal() throws Exception {
            runTest("testData/copyPaste/imports/Local.kt");
        }

        @TestMetadata("MultiCaretSelectionEntireFile.kt")
        public void testMultiCaretSelectionEntireFile() throws Exception {
            runTest("testData/copyPaste/imports/MultiCaretSelectionEntireFile.kt");
        }

        @TestMetadata("MultiDeclaration.kt")
        public void testMultiDeclaration() throws Exception {
            runTest("testData/copyPaste/imports/MultiDeclaration.kt");
        }

        @TestMetadata("MultiReferencePartiallyCopied.kt")
        public void testMultiReferencePartiallyCopied() throws Exception {
            runTest("testData/copyPaste/imports/MultiReferencePartiallyCopied.kt");
        }

        @TestMetadata("NoImportForBuiltIns.kt")
        public void testNoImportForBuiltIns() throws Exception {
            runTest("testData/copyPaste/imports/NoImportForBuiltIns.kt");
        }

        @TestMetadata("NoImportForSamePackage.kt")
        public void testNoImportForSamePackage() throws Exception {
            runTest("testData/copyPaste/imports/NoImportForSamePackage.kt");
        }

        @TestMetadata("NotReferencePosition.kt")
        public void testNotReferencePosition() throws Exception {
            runTest("testData/copyPaste/imports/NotReferencePosition.kt");
        }

        @TestMetadata("NotReferencePosition2.kt")
        public void testNotReferencePosition2() throws Exception {
            runTest("testData/copyPaste/imports/NotReferencePosition2.kt");
        }

        @TestMetadata("Object.kt")
        public void testObject() throws Exception {
            runTest("testData/copyPaste/imports/Object.kt");
        }

        @TestMetadata("OnlyKDocReferenced.kt")
        public void testOnlyKDocReferenced() throws Exception {
            runTest("testData/copyPaste/imports/OnlyKDocReferenced.kt");
        }

        @TestMetadata("OverloadedExtensionFunction.kt")
        public void testOverloadedExtensionFunction() throws Exception {
            runTest("testData/copyPaste/imports/OverloadedExtensionFunction.kt");
        }

        @TestMetadata("PackageView.kt")
        public void testPackageView() throws Exception {
            runTest("testData/copyPaste/imports/PackageView.kt");
        }

        @TestMetadata("PartiallyQualified.kt")
        public void testPartiallyQualified() throws Exception {
            runTest("testData/copyPaste/imports/PartiallyQualified.kt");
        }

        @TestMetadata("QualifiedTypeConflict.kt")
        public void testQualifiedTypeConflict() throws Exception {
            runTest("testData/copyPaste/imports/QualifiedTypeConflict.kt");
        }

        @TestMetadata("ReferencedElementAlsoCopied.kt")
        public void testReferencedElementAlsoCopied() throws Exception {
            runTest("testData/copyPaste/imports/ReferencedElementAlsoCopied.kt");
        }

        @TestMetadata("Super.kt")
        public void testSuper() throws Exception {
            runTest("testData/copyPaste/imports/Super.kt");
        }

        @TestMetadata("ThisReference.kt")
        public void testThisReference() throws Exception {
            runTest("testData/copyPaste/imports/ThisReference.kt");
        }

        @TestMetadata("TopLevelCallableRef.kt")
        public void testTopLevelCallableRef() throws Exception {
            runTest("testData/copyPaste/imports/TopLevelCallableRef.kt");
        }

        @TestMetadata("TopLevelExtensionCallableRefWithExpressionLHS.kt")
        public void testTopLevelExtensionCallableRefWithExpressionLHS() throws Exception {
            runTest("testData/copyPaste/imports/TopLevelExtensionCallableRefWithExpressionLHS.kt");
        }

        @TestMetadata("TopLevelExtensionCallableRefWithTypeLHS.kt")
        public void testTopLevelExtensionCallableRefWithTypeLHS() throws Exception {
            runTest("testData/copyPaste/imports/TopLevelExtensionCallableRefWithTypeLHS.kt");
        }

        @TestMetadata("TopLevelMemberCallableRefWithExpressionLHS.kt")
        public void testTopLevelMemberCallableRefWithExpressionLHS() throws Exception {
            runTest("testData/copyPaste/imports/TopLevelMemberCallableRefWithExpressionLHS.kt");
        }

        @TestMetadata("TopLevelMemberCallableRefWithTypeLHS.kt")
        public void testTopLevelMemberCallableRefWithTypeLHS() throws Exception {
            runTest("testData/copyPaste/imports/TopLevelMemberCallableRefWithTypeLHS.kt");
        }

        @TestMetadata("TopLevelProperty.kt")
        public void testTopLevelProperty() throws Exception {
            runTest("testData/copyPaste/imports/TopLevelProperty.kt");
        }

        @TestMetadata("Trait.kt")
        public void testTrait() throws Exception {
            runTest("testData/copyPaste/imports/Trait.kt");
        }

        @TestMetadata("TypeArgForUnresolvedCall.kt")
        public void testTypeArgForUnresolvedCall() throws Exception {
            runTest("testData/copyPaste/imports/TypeArgForUnresolvedCall.kt");
        }

        @TestMetadata("TypeParameter.kt")
        public void testTypeParameter() throws Exception {
            runTest("testData/copyPaste/imports/TypeParameter.kt");
        }

        @TestMetadata("UnresolvedOverload.kt")
        public void testUnresolvedOverload() throws Exception {
            runTest("testData/copyPaste/imports/UnresolvedOverload.kt");
        }
    }
}
