package dev.ultreon.quantum.qfunc

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiErrorElement
import com.intellij.psi.util.elementType
import dev.ultreon.quantum.qfunc.psi.*

class QuantumAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        val elementType = element.node.elementType // Get the element type from the parsed node

        when (element) {
            is PsiErrorElement -> {
                return
            }

            is QuantumId -> {
                holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                    .textAttributes(DefaultLanguageHighlighterColors.CLASS_REFERENCE)
                    .range(element)
                    .create()
            }

            is QuantumPersistStatement -> {
                holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                    .textAttributes(DefaultLanguageHighlighterColors.KEYWORD)
                    .range(element)
                    .create()

                for (child in element.children) {
                    if (child is QuantumGlobalName) {
                        holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                            .textAttributes(DefaultLanguageHighlighterColors.INSTANCE_FIELD)
                            .range(child)
                            .create()
                    }
                }
            }

            is QuantumInputStatement -> {
                holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                    .textAttributes(DefaultLanguageHighlighterColors.KEYWORD)
                    .range(element)
                    .create()

                for (child in element.children) {
                    if (child is QuantumParamName) {
                        holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                            .textAttributes(DefaultLanguageHighlighterColors.CONSTANT)
                            .range(child)
                            .create()
                    }
                }
            }

            is QuantumDirectiveType -> {
                holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                    .textAttributes(DefaultLanguageHighlighterColors.CLASS_NAME)
                    .range(element)
                    .create()
            }

            is QuantumFuncName -> {
                holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                    .textAttributes(DefaultLanguageHighlighterColors.FUNCTION_CALL)
                    .range(element)
                    .create()
            }

            is QuantumPath -> {
                holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                    .textAttributes(DefaultLanguageHighlighterColors.STRING)
                    .range(element)
                    .create()
            }

            is QuantumNamespace -> {
                holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                    .textAttributes(DefaultLanguageHighlighterColors.CLASS_REFERENCE)
                    .range(element)
                    .create()
            }

            is QuantumGlobalExpr -> {
                holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                    .textAttributes(DefaultLanguageHighlighterColors.INSTANCE_FIELD)
                    .range(element)
                    .create()
            }

            is QuantumParameterExpr -> {
                holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                    .textAttributes(DefaultLanguageHighlighterColors.CONSTANT)
                    .range(element)
                    .create()
            }

            is QuantumParameterName -> {
                holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                    .textAttributes(DefaultLanguageHighlighterColors.PARAMETER)
                    .range(element)
                    .create()
            }

            is QuantumMember -> {
                for (child in element.children) {
                    when (child) {
                        is QuantumVariableName -> holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                            .textAttributes(DefaultLanguageHighlighterColors.INSTANCE_FIELD)
                            .range(child)
                            .create()

                        is QuantumFunctionCall -> for (child2 in child.children) {
                            if (child2 is QuantumFuncName)
                                holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                                    .textAttributes(DefaultLanguageHighlighterColors.FUNCTION_CALL)
                                    .range(child2)
                                    .create()
                        }

                        else -> holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                            .textAttributes(DefaultLanguageHighlighterColors.INSTANCE_FIELD)
                            .range(child)
                            .create()
                    }
                }
            }
        }

        for (child in element.children) {
            if (child != null) {
                if (child is PsiErrorElement) {
                    holder.newAnnotation(
                        HighlightSeverity.ERROR, """
                                Parsing error ${child.errorDescription}: ${child.text.prependIndent("  ")}
                            """.trimIndent()
                    )
                        .range(child)
                        .create()
                    continue
                }
                annotate(child, holder)
            }
        }
    }
}
