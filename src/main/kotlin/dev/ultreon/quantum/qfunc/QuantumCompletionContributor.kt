package dev.ultreon.quantum.qfunc

import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.icons.AllIcons
import com.intellij.patterns.PlatformPatterns
import com.intellij.platform.uast.testFramework.env.findUElementByTextFromPsi
import com.intellij.psi.PsiComment
import com.intellij.psi.util.childrenOfType
import com.intellij.psi.util.descendantsOfType
import com.intellij.psi.util.elementType
import com.intellij.util.ProcessingContext
import dev.ultreon.quantum.qfunc.psi.QuantumGlobalName
import dev.ultreon.quantum.qfunc.psi.QuantumId
import dev.ultreon.quantum.qfunc.psi.QuantumNamespace
import dev.ultreon.quantum.qfunc.psi.QuantumParamName
import dev.ultreon.quantum.qfunc.psi.QuantumParameterExpr
import dev.ultreon.quantum.qfunc.psi.QuantumTypes

class QuantumCompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(QuantumTypes.IDENTIFIER),
            QuantumCompletionProvider()
        )
    }

    private class QuantumCompletionProvider : CompletionProvider<CompletionParameters>() {
        override fun addCompletions(
            parameters: CompletionParameters,
            context: ProcessingContext,
            result: CompletionResultSet
        ) {
            val prefix = parameters.position.text
            val scope = parameters.originalFile

            println("Prefix: $prefix")
            println("PSI Element: ${parameters.position::class.java}")
            println("Text: ${parameters.position.text}")

            if (parameters.position.prevSibling.elementType == QuantumTypes.DOLLAR) {
                for (param in scope.descendantsOfType<QuantumGlobalName>()) {
                    if (param.textRange.intersects(parameters.position.textRange)) continue
                    result.addElement(LookupElementBuilder.create(param.text).withIcon(AllIcons.Nodes.Field).withTypeText("Global"))
                }
            } else if (parameters.position.prevSibling.elementType == QuantumTypes.AT) {
                for (id in scope.descendantsOfType<QuantumParamName>()) {
                    if (id.textRange.intersects(parameters.position.textRange)) continue
                    result.addElement(
                        LookupElementBuilder.create(id.text).withIcon(AllIcons.Nodes.Constant).withTypeText("Input")
                    )
                }
            } else if (parameters.position.parent.elementType == QuantumTypes.NAMESPACE) {
                if (scope.parent?.name == "scripts") {
                    scope.parent?.parent?.parent?.subdirectories?.forEach {
                        result.addElement(LookupElementBuilder.create(it.name).withIcon(AllIcons.Nodes.Package).withTypeText("Namespace"))
                    }
                }
            } else if (parameters.position.parent.elementType == QuantumTypes.PATH) {
                // TODO
            } else if (parameters.position.parent.elementType == QuantumTypes.DIRECTIVE_TYPE) {
                for (param in listOf(
                    "string", "int", "float", "binary", "id"
                ).sorted()) {
                    if (parameters.position.text.startsWith(prefix)) {
                        result.addElement(LookupElementBuilder.create(param).withIcon(AllIcons.Nodes.Type).withTypeText("Game Object"))
                    }
                }
                for (param in listOf(
                    "block-entity", "block", "item", "entity", "entity-template", "dimension", "player",
                    "vector", "grid-point", "type", "condition", "block-state", "direction", "axis",
                    "item-stack", "mat4", "mat3", "json", "component-map", "component-type-list", "component",
                    "function"
                ).sorted()) {
                    if (parameters.position.text.startsWith(prefix)) {
                        result.addElement(LookupElementBuilder.create(param).withIcon(AllIcons.Nodes.Class).withTypeText("Game Object"))
                    }
                }
            } else {
                for (id in scope.descendantsOfType<QuantumParamName>().sortedBy { it.text }) {
                    result.addElement(LookupElementBuilder.create("@${id.text}").withIcon(AllIcons.Nodes.Parameter).withTypeText("Input Parameter"))
                }

                for (param in scope.descendantsOfType<QuantumGlobalName>().sortedBy { it.text }) {
                    result.addElement(LookupElementBuilder.create("\$${param.text}").withIcon(AllIcons.Nodes.Field).withTypeText("Global"))
                }

                for (param in listOf(
                    "if", "else", "stop", "continue", "break", "for", "while", "loop"
                ).sorted()) {
                    if (parameters.position.text.startsWith(prefix)) {
                        result.addElement(LookupElementBuilder.create(param).withTypeText("Keyword"))
                    }
                }
            }
        }
    }
}
