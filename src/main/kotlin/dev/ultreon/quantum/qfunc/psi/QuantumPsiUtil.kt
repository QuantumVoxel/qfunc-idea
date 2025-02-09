package dev.ultreon.quantum.qfunc.psi

import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil

object QuantumPsiUtil {
  fun isDeclaration(element: PsiElement): Boolean {
    val parent = element.parent

    // Check if the element is inside a #persist or #input directive
    if (parent is QuantumInputStatement || parent is QuantumPersistStatement) {
      return true
    }

    // Check if the element is on the left side of an assignment
    return parent is QuantumAssignment && parent.firstChild == element
  }
}
