package dev.ultreon.quantum.qfunc

import com.intellij.lang.refactoring.RefactoringSupportProvider
import com.intellij.psi.PsiElement
import dev.ultreon.quantum.qfunc.psi.QuantumNamedElement

class QuantumRefactoringSupportProvider : RefactoringSupportProvider() {
    override fun isMemberInplaceRenameAvailable(element: PsiElement, context: PsiElement?): Boolean {
        return (element is QuantumNamedElement)
    }
}