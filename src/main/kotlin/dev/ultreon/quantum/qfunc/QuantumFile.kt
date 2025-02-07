package dev.ultreon.quantum.qfunc

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider

class QuantumFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, QuantumLang) {
    override fun getFileType() = QuantumFileType()
    override fun toString() = "Quantum File"
}
