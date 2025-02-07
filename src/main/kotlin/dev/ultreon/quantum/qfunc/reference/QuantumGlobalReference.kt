package dev.ultreon.quantum.qfunc.reference

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.icons.AllIcons
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiPolyVariantReferenceBase
import com.intellij.psi.ResolveResult
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.util.childrenOfType
import dev.ultreon.quantum.qfunc.psi.QuantumGlobalName
import dev.ultreon.quantum.qfunc.psi.QuantumPsiUtil

class QuantumGlobalReference(element: PsiElement, textRange: TextRange = element.textRange) : PsiPolyVariantReferenceBase<PsiElement>(element, textRange) {
    private val key: String = element.text
        .substring(textRange.startOffset, textRange.endOffset)

    override fun getVariants(): Array<Any> {
        println("Element: $key")

        val variants: MutableList<LookupElement> = ArrayList()
        for (variant in element.containingFile.childrenOfType<QuantumGlobalName>()) {
            if (!variant.text.equals(element.text)) {
                variants.add(
                    LookupElementBuilder
                        .create(variant).withIcon(AllIcons.Nodes.Field)
                        .withTypeText(variant.containingFile.name)
                )
            }
        }
        return variants.toTypedArray()
    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        println("Element: $key")

        val root = element.containingFile

        return PsiTreeUtil.findChildrenOfType(root, QuantumGlobalName::class.java)
            .filter { QuantumPsiUtil.isDeclaration(it) && it.text == key }
            .map { PsiElementResolveResult(it) }
            .toTypedArray()
    }
}