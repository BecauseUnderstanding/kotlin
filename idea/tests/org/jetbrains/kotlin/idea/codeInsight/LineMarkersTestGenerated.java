/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.codeInsight;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/codeInsight/lineMarker")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class LineMarkersTestGenerated extends AbstractLineMarkersTest {
    public void testAllFilesPresentInLineMarker() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/lineMarker"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("idea/testData/codeInsight/lineMarker/overrideImplement")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class OverrideImplement extends AbstractLineMarkersTest {
        public void testAllFilesPresentInOverrideImplement() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/lineMarker/overrideImplement"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("BadCodeNoExceptions.kt")
        public void testBadCodeNoExceptions() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/BadCodeNoExceptions.kt");
            doTest(fileName);
        }

        @TestMetadata("Class.kt")
        public void testClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/Class.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassObjectInStaticNestedClass.kt")
        public void testClassObjectInStaticNestedClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/ClassObjectInStaticNestedClass.kt");
            doTest(fileName);
        }

        @TestMetadata("DelegatedFun.kt")
        public void testDelegatedFun() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/DelegatedFun.kt");
            doTest(fileName);
        }

        @TestMetadata("DelegatedProperty.kt")
        public void testDelegatedProperty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/DelegatedProperty.kt");
            doTest(fileName);
        }

        @TestMetadata("EnumEntry.kt")
        public void testEnumEntry() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/EnumEntry.kt");
            doTest(fileName);
        }

        @TestMetadata("FakeOverrideForClasses.kt")
        public void testFakeOverrideForClasses() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/FakeOverrideForClasses.kt");
            doTest(fileName);
        }

        @TestMetadata("FakeOverrideFun.kt")
        public void testFakeOverrideFun() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/FakeOverrideFun.kt");
            doTest(fileName);
        }

        @TestMetadata("FakeOverrideFunWithMostRelevantImplementation.kt")
        public void testFakeOverrideFunWithMostRelevantImplementation() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/FakeOverrideFunWithMostRelevantImplementation.kt");
            doTest(fileName);
        }

        @TestMetadata("FakeOverrideProperty.kt")
        public void testFakeOverrideProperty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/FakeOverrideProperty.kt");
            doTest(fileName);
        }

        @TestMetadata("FakeOverrideToStringInTrait.kt")
        public void testFakeOverrideToStringInTrait() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/FakeOverrideToStringInTrait.kt");
            doTest(fileName);
        }

        @TestMetadata("FakeOverridesForTraitFunWithImpl.kt")
        public void testFakeOverridesForTraitFunWithImpl() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/FakeOverridesForTraitFunWithImpl.kt");
            doTest(fileName);
        }

        @TestMetadata("NavigateToSeveralSuperElements.kt")
        public void testNavigateToSeveralSuperElements() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/NavigateToSeveralSuperElements.kt");
            doTest(fileName);
        }

        @TestMetadata("NoOverridingMarkerOnDefaultTraitImpl.kt")
        public void testNoOverridingMarkerOnDefaultTraitImpl() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/NoOverridingMarkerOnDefaultTraitImpl.kt");
            doTest(fileName);
        }

        @TestMetadata("Overloads.kt")
        public void testOverloads() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/Overloads.kt");
            doTest(fileName);
        }

        @TestMetadata("OverrideFunction.kt")
        public void testOverrideFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/OverrideFunction.kt");
            doTest(fileName);
        }

        @TestMetadata("OverrideIconForOverloadMethodBug.kt")
        public void testOverrideIconForOverloadMethodBug() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/OverrideIconForOverloadMethodBug.kt");
            doTest(fileName);
        }

        @TestMetadata("OverrideMemberOfAbstractClass.kt")
        public void testOverrideMemberOfAbstractClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/OverrideMemberOfAbstractClass.kt");
            doTest(fileName);
        }

        @TestMetadata("OverridenTraitDeclarations.kt")
        public void testOverridenTraitDeclarations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/OverridenTraitDeclarations.kt");
            doTest(fileName);
        }

        @TestMetadata("OverridingTooltipOnDefaultTraitImpl.kt")
        public void testOverridingTooltipOnDefaultTraitImpl() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/OverridingTooltipOnDefaultTraitImpl.kt");
            doTest(fileName);
        }

        @TestMetadata("PrimaryConstructorOpen.kt")
        public void testPrimaryConstructorOpen() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/PrimaryConstructorOpen.kt");
            doTest(fileName);
        }

        @TestMetadata("PrimaryConstructorOverride.kt")
        public void testPrimaryConstructorOverride() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/PrimaryConstructorOverride.kt");
            doTest(fileName);
        }

        @TestMetadata("PropertyOverride.kt")
        public void testPropertyOverride() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/PropertyOverride.kt");
            doTest(fileName);
        }

        @TestMetadata("SealedClass.kt")
        public void testSealedClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/SealedClass.kt");
            doTest(fileName);
        }

        @TestMetadata("ToStringInTrait.kt")
        public void testToStringInTrait() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/ToStringInTrait.kt");
            doTest(fileName);
        }

        @TestMetadata("Trait.kt")
        public void testTrait() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/overrideImplement/Trait.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/lineMarker/recursiveCall")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class RecursiveCall extends AbstractLineMarkersTest {
        public void testAllFilesPresentInRecursiveCall() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/lineMarker/recursiveCall"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("companionInvoke.kt")
        public void testCompanionInvoke() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/companionInvoke.kt");
            doTest(fileName);
        }

        @TestMetadata("conventionCall.kt")
        public void testConventionCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/conventionCall.kt");
            doTest(fileName);
        }

        @TestMetadata("differentImplicitReceiver.kt")
        public void testDifferentImplicitReceiver() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/differentImplicitReceiver.kt");
            doTest(fileName);
        }

        @TestMetadata("extension.kt")
        public void testExtension() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/extension.kt");
            doTest(fileName);
        }

        @TestMetadata("generic.kt")
        public void testGeneric() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/generic.kt");
            doTest(fileName);
        }

        @TestMetadata("inInlinedFunctionExpression.kt")
        public void testInInlinedFunctionExpression() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/inInlinedFunctionExpression.kt");
            doTest(fileName);
        }

        @TestMetadata("inInlinedLambda.kt")
        public void testInInlinedLambda() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/inInlinedLambda.kt");
            doTest(fileName);
        }

        @TestMetadata("inLambda.kt")
        public void testInLambda() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/inLambda.kt");
            doTest(fileName);
        }

        @TestMetadata("localClass.kt")
        public void testLocalClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/localClass.kt");
            doTest(fileName);
        }

        @TestMetadata("localFun.kt")
        public void testLocalFun() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/localFun.kt");
            doTest(fileName);
        }

        @TestMetadata("methodReference.kt")
        public void testMethodReference() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/methodReference.kt");
            doTest(fileName);
        }

        @TestMetadata("nested.kt")
        public void testNested() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/nested.kt");
            doTest(fileName);
        }

        @TestMetadata("otherQualifier.kt")
        public void testOtherQualifier() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/otherQualifier.kt");
            doTest(fileName);
        }

        @TestMetadata("propertyAccessors.kt")
        public void testPropertyAccessors() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/propertyAccessors.kt");
            doTest(fileName);
        }

        @TestMetadata("severalCallsInOneLine.kt")
        public void testSeveralCallsInOneLine() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/severalCallsInOneLine.kt");
            doTest(fileName);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/simple.kt");
            doTest(fileName);
        }

        @TestMetadata("superQualifier.kt")
        public void testSuperQualifier() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/superQualifier.kt");
            doTest(fileName);
        }

        @TestMetadata("thisQualifier.kt")
        public void testThisQualifier() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/recursiveCall/thisQualifier.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/lineMarker/runMarkers")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class RunMarkers extends AbstractLineMarkersTest {
        public void testAllFilesPresentInRunMarkers() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/lineMarker/runMarkers"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("jUnitTestClassWithSubclasses.kt")
        public void testJUnitTestClassWithSubclasses() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/runMarkers/jUnitTestClassWithSubclasses.kt");
            doTest(fileName);
        }

        @TestMetadata("testNGTestClassWithSubclasses.kt")
        public void testTestNGTestClassWithSubclasses() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/runMarkers/testNGTestClassWithSubclasses.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/codeInsight/lineMarker/suspendCall")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SuspendCall extends AbstractLineMarkersTest {
        public void testAllFilesPresentInSuspendCall() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/codeInsight/lineMarker/suspendCall"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("suspendCall.kt")
        public void testSuspendCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/suspendCall/suspendCall.kt");
            doTest(fileName);
        }

        @TestMetadata("suspendIteration.kt")
        public void testSuspendIteration() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/codeInsight/lineMarker/suspendCall/suspendIteration.kt");
            doTest(fileName);
        }
    }
}
