package dev.ultreon.quantum.qfunc

import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.*
import dev.ultreon.quantum.qfunc.psi.QuantumGlobalName
import dev.ultreon.quantum.qfunc.psi.QuantumParamName
import dev.ultreon.quantum.qfunc.psi.QuantumTypes
import dev.ultreon.quantum.qfunc.psi.QuantumVariableName
import dev.ultreon.quantum.qfunc.reference.QuantumGlobalReferenceProvider
import dev.ultreon.quantum.qfunc.reference.QuantumParamReferenceProvider
import dev.ultreon.quantum.qfunc.reference.QuantumVariableReferenceProvider

class QuantumReferenceContributor : PsiReferenceContributor() {
    override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
        println("QuantumReferenceContributor")

        registrar.registerReferenceProvider(
            PlatformPatterns.psiElement().withParent(PlatformPatterns.psiElement(QuantumTypes.GLOBAL_EXPR)),
            QuantumVariableReferenceProvider(), PsiReferenceRegistrar.HIGHER_PRIORITY
        )
        registrar.registerReferenceProvider(
            PlatformPatterns.psiElement().withParent(PlatformPatterns.psiElement(QuantumTypes.INPUT_STATEMENT)),
            QuantumVariableReferenceProvider(), PsiReferenceRegistrar.HIGHER_PRIORITY
        )
        registrar.registerReferenceProvider(
            PlatformPatterns.psiElement().withParent(PlatformPatterns.psiElement(QuantumTypes.PARAMETER_EXPR)),
            QuantumVariableReferenceProvider(), PsiReferenceRegistrar.HIGHER_PRIORITY
        )

        registrar.registerReferenceProvider(
            PlatformPatterns.psiElement().withParent(PlatformPatterns.psiElement(QuantumTypes.PERSIST_STATEMENT)),
            QuantumGlobalReferenceProvider(), PsiReferenceRegistrar.HIGHER_PRIORITY
        )
    }
}
