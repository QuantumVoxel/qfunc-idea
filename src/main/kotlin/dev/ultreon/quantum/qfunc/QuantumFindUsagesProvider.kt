package dev.ultreon.quantum.qfunc

import com.intellij.lang.cacheBuilder.DefaultWordsScanner
import com.intellij.lang.cacheBuilder.WordsScanner
import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.FlexLexer
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import dev.ultreon.quantum.qfunc.psi.QuantumGlobalName
import dev.ultreon.quantum.qfunc.psi.QuantumParamName
import org.jetbrains.annotations.Nls
import org.jetbrains.annotations.NonNls

class QuantumFindUsagesProvider : FindUsagesProvider {
  override fun getWordsScanner(): WordsScanner {
    return object : DefaultWordsScanner(
      FlexAdapter(QuantumLexer(null)),
      QuantumTokenSets.names,
      QuantumTokenSets.comments,
      QuantumTokenSets.literals
    ) {

    }
  }

  override fun canFindUsagesFor(psiElement: PsiElement): Boolean {
    return psiElement is PsiNamedElement
  }

  override fun getHelpId(psiElement: PsiElement): @NonNls String? {
    return null
  }


  override fun getType(element: PsiElement): @Nls String {
    if (element is QuantumGlobalName) {
      return "global name"
    }
    if (element is QuantumParamName) {
      return "input parameter name"
    }
    return ""
  }

  override fun getDescriptiveName(element: PsiElement): String {
    if (element is QuantumGlobalName) {
      return element.text
    }
    if (element is QuantumParamName) {
      return element.text
    }
    return ""
  }

  override fun getNodeText(element: PsiElement, useFullName: Boolean): String {
    if (element is QuantumGlobalName) {
      return element.text
    }
    if (element is QuantumParamName) {
      return element.text
    }
    return ""
  }
}