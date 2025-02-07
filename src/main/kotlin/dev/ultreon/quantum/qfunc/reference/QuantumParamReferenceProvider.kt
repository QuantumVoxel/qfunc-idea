package dev.ultreon.quantum.qfunc.reference

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReference
import com.intellij.psi.PsiReferenceProvider
import com.intellij.psi.util.descendantsOfType
import com.intellij.util.ProcessingContext
import dev.ultreon.quantum.qfunc.psi.QuantumParamName
import dev.ultreon.quantum.qfunc.psi.QuantumPsiUtil

class QuantumParamReferenceProvider : PsiReferenceProvider() {
    override fun getReferencesByElement(element: PsiElement, context: ProcessingContext): Array<PsiReference> {
        return element.containingFile.descendantsOfType<QuantumParamName>().map { QuantumParamReference(it) }.toList().toTypedArray()
    }
}