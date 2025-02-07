package dev.ultreon.quantum.qfunc.parser

import com.intellij.lang.parser.GeneratedParserUtilBase
import com.intellij.psi.PsiElement
import com.intellij.psi.util.descendantsOfType
import dev.ultreon.quantum.qfunc.QuantumElementFactory
import dev.ultreon.quantum.qfunc.psi.QuantumGlobalName
import dev.ultreon.quantum.qfunc.psi.QuantumNamedElement
import dev.ultreon.quantum.qfunc.psi.QuantumParamName
import dev.ultreon.quantum.qfunc.psi.QuantumTypes

object QuantumParserUtil : GeneratedParserUtilBase() {
    fun getName(element: QuantumNamedElement): String {
        return element.text
    }

    fun setName(element: QuantumNamedElement, newName: String): PsiElement {
        if (element is QuantumGlobalName) {
            element.containingFile.descendantsOfType<QuantumGlobalName>().forEach {
                if (it.text == element.getText()) {
                    it.parent.node.replaceChild(it.node, QuantumElementFactory.createGlobalName(element.project, newName).node)
                }
            }
        }
        if (element is QuantumParamName) {
            element.containingFile.descendantsOfType<QuantumParamName>().forEach {
                if (it.text == element.getText()) {
                    it.parent.node.replaceChild(it.node, QuantumElementFactory.createParamName(element.project, newName).node)
                }
            }
        }
        return element
    }

    fun getNameIdentifier(element: QuantumNamedElement): PsiElement {
        val paramNode = element.parent.node.findChildByType(QuantumTypes.PARAM_NAME)
        val globName = element.parent.node.findChildByType(QuantumTypes.GLOBAL_NAME)
        return if (paramNode != null) paramNode.psi else globName?.psi ?: element
    }
}
