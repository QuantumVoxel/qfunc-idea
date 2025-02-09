package dev.ultreon.quantum.qfunc.reference

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.util.PsiTreeUtil
import dev.ultreon.quantum.qfunc.psi.QuantumPsiUtil
import dev.ultreon.quantum.qfunc.psi.QuantumVariableName

class QuantumVariableReference(element: PsiElement) : PsiReferenceBase<PsiElement>(element) {

  override fun resolve(): PsiElement? {
    val root = element.containingFile
    return PsiTreeUtil.findChildrenOfType(root, QuantumVariableName::class.java)
      .firstOrNull { QuantumPsiUtil.isDeclaration(it) && it.text == element.text }
  }

  override fun getVariants(): Array<Any> {
    val root = element.containingFile
    return PsiTreeUtil.findChildrenOfType(root, QuantumVariableName::class.java)
      .filter { QuantumPsiUtil.isDeclaration(it) }
      .map { it.text }
      .toTypedArray()
  }
}