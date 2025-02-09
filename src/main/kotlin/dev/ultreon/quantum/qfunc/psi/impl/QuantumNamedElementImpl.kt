package dev.ultreon.quantum.qfunc.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import dev.ultreon.quantum.qfunc.parser.QuantumParserUtil
import dev.ultreon.quantum.qfunc.psi.QuantumNamedElement
import dev.ultreon.quantum.qfunc.psi.QuantumPsiUtil

open class QuantumNamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), QuantumNamedElement {
  override fun setName(name: String): PsiElement {
    return QuantumParserUtil.setName(this, name)
  }

  override fun getName(): String? {
    return QuantumParserUtil.getName(this);
  }
}