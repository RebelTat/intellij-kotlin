package org.jetbrains.kotlin.idea.debugger.evaluate

import com.intellij.openapi.diagnostic.Logger
import com.intellij.testFramework.runInEdtAndWait
import org.jetbrains.kotlin.idea.util.application.executeWriteCommand
import org.jetbrains.kotlin.idea.util.application.runReadAction
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.resolve.BindingContext

internal class KotlinCodeFragmentEditor(val codeFragment: KtCodeFragment) {
    companion object {
        private val LOG = Logger.getInstance(KotlinCodeFragmentEditor::class.java)
    }

    private val expressionWrappers = mutableListOf<KotlinExpressionWrapper>()

    fun addWrapper(wrapper: KotlinExpressionWrapper): KotlinCodeFragmentEditor {
        expressionWrappers.add(wrapper)
        return this
    }

    fun editCodeFragment(): Boolean {
        val (expression, expressionText) = extractExpressionWithText() ?: return false

        var expressionWasWrapped = false
        var newExpressionText = expressionText
        for (wrapper in expressionWrappers) {
            if (wrapper.isApplicable(expression)) {
                expressionWasWrapped = true
                newExpressionText = wrapper.createWrappedExpressionText(newExpressionText)
            }
        }

        if (expressionWasWrapped) {
            replaceExpression(expression, newExpressionText)
        }
        return expressionWasWrapped
    }

    private fun replaceExpression(expression: KtExpression, newExpressionText: String) {
        val newExpression = runReadAction {
            KtPsiFactory(expression.project).createExpression(newExpressionText)
        }

        runInEdtAndWait {
            expression.project.executeWriteCommand(
                KotlinDebuggerEvaluationBundle.message("wrap.expression")
            ) {
                expression.replace(newExpression)
            }
        }
    }

    private fun extractExpressionWithText(): Pair<KtExpression, String>? =
        runReadAction {
            val expression = when (codeFragment) {
                is KtExpressionCodeFragment -> codeFragment.getContentElement()
                is KtBlockCodeFragment -> codeFragment.getContentElement().statements.lastOrNull()
                else -> {
                    LOG.error("Invalid code fragment type: ${this.javaClass}")
                    null
                }
            }

            if (expression == null) {
                null
            } else {
                Pair(expression, expression.text)
            }
        }
}

internal fun KotlinCodeFragmentEditor.withToStringWrapper(bindingContext: BindingContext) =
    addWrapper(KotlinToStringWrapper(bindingContext))

internal fun KotlinCodeFragmentEditor.withSuspendFunctionWrapper(
    bindingContext: BindingContext,
    executionContext: ExecutionContext,
    isCoroutineScopeAvailable: Boolean
) =
    addWrapper(
        KotlinSuspendFunctionWrapper(
            bindingContext,
            executionContext,
            codeFragment.context,
            isCoroutineScopeAvailable
        )
    )
