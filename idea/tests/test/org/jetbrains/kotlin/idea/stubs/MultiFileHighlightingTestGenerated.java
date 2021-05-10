/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.stubs;

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
@TestMetadata("testData/multiFileHighlighting")
public class MultiFileHighlightingTestGenerated extends AbstractMultiFileHighlightingTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("annotatedParameter.kt")
    public void testAnnotatedParameter() throws Exception {
        runTest("testData/multiFileHighlighting/annotatedParameter.kt");
    }

    @TestMetadata("copyResolveBeforeParams.kt")
    public void testCopyResolveBeforeParams() throws Exception {
        runTest("testData/multiFileHighlighting/copyResolveBeforeParams.kt");
    }

    @TestMetadata("delegatesReference.kt")
    public void testDelegatesReference() throws Exception {
        runTest("testData/multiFileHighlighting/delegatesReference.kt");
    }

    @TestMetadata("enumReference.kt")
    public void testEnumReference() throws Exception {
        runTest("testData/multiFileHighlighting/enumReference.kt");
    }

    @TestMetadata("missingDependencyClass.kt")
    public void testMissingDependencyClass() throws Exception {
        runTest("testData/multiFileHighlighting/missingDependencyClass.kt");
    }

    @TestMetadata("referencesFunWithUnspecifiedType.kt")
    public void testReferencesFunWithUnspecifiedType() throws Exception {
        runTest("testData/multiFileHighlighting/referencesFunWithUnspecifiedType.kt");
    }

    @TestMetadata("topLevelMembersReference.kt")
    public void testTopLevelMembersReference() throws Exception {
        runTest("testData/multiFileHighlighting/topLevelMembersReference.kt");
    }
}
