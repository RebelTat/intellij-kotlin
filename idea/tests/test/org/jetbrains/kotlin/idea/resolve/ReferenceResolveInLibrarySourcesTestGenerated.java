/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.resolve;

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
@TestMetadata("testData/resolve/referenceInLib")
public class ReferenceResolveInLibrarySourcesTestGenerated extends AbstractReferenceResolveInLibrarySourcesTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("builtInNumber.kt")
    public void testBuiltInNumber() throws Exception {
        runTest("testData/resolve/referenceInLib/builtInNumber.kt");
    }

    @TestMetadata("inLibrarySource.kt")
    public void testInLibrarySource() throws Exception {
        runTest("testData/resolve/referenceInLib/inLibrarySource.kt");
    }

    @TestMetadata("toFunParameter.kt")
    public void testToFunParameter() throws Exception {
        runTest("testData/resolve/referenceInLib/toFunParameter.kt");
    }

    @TestMetadata("toLocalFun.kt")
    public void testToLocalFun() throws Exception {
        runTest("testData/resolve/referenceInLib/toLocalFun.kt");
    }
}
