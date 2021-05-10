/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.fir.low.level.api;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.idea.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.idea.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/lazyResolve")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class FirLazyDeclarationResolveTestGenerated extends AbstractFirLazyDeclarationResolveTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInLazyResolve() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/lazyResolve"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("classMembers.kt")
    public void testClassMembers() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/lazyResolve/classMembers.kt");
    }

    @TestMetadata("delegates.kt")
    public void testDelegates() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/lazyResolve/delegates.kt");
    }

    @TestMetadata("propertyWithGetter.kt")
    public void testPropertyWithGetter() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/lazyResolve/propertyWithGetter.kt");
    }

    @TestMetadata("propertyWithGetterAndSetter.kt")
    public void testPropertyWithGetterAndSetter() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/lazyResolve/propertyWithGetterAndSetter.kt");
    }

    @TestMetadata("propertyWithInitializer.kt")
    public void testPropertyWithInitializer() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/lazyResolve/propertyWithInitializer.kt");
    }

    @TestMetadata("secondaryConstructor.kt")
    public void testSecondaryConstructor() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/lazyResolve/secondaryConstructor.kt");
    }

    @TestMetadata("topLevelFunctions.kt")
    public void testTopLevelFunctions() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/lazyResolve/topLevelFunctions.kt");
    }

    @TestMetadata("topLevelFunctionsWithExpressionBodyAndExplicitType.kt")
    public void testTopLevelFunctionsWithExpressionBodyAndExplicitType() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/lazyResolve/topLevelFunctionsWithExpressionBodyAndExplicitType.kt");
    }

    @TestMetadata("topLevelFunctionsWithImplicitType.kt")
    public void testTopLevelFunctionsWithImplicitType() throws Exception {
        runTest("idea/idea-frontend-fir/idea-fir-low-level-api/testdata/lazyResolve/topLevelFunctionsWithImplicitType.kt");
    }
}
