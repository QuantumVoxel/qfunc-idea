package dev.ultreon.quantum.qfunc.reference

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.PsiReference
import com.intellij.psi.PsiReferenceProvider
import com.intellij.util.ProcessingContext
import dev.ultreon.quantum.qfunc.psi.QuantumPsiUtil

class QuantumVariableReferenceProvider : PsiReferenceProvider() {
    override fun getReferencesByElement(element: PsiElement, context: ProcessingContext): Array<PsiReference> {
        // Only provide references if it's NOT a declaration
        println("Element: $element")
        if (element is PsiNamedElement) {
            return arrayOf(QuantumGlobalReference(element))
        }

        return emptyArray()
    }
}