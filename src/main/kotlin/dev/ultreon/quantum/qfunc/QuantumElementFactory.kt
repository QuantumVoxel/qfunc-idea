package dev.ultreon.quantum.qfunc

import com.intellij.openapi.project.Project
import com.intellij.psi.util.descendantsOfType
import dev.ultreon.quantum.qfunc.psi.impl.QuantumGlobalNameImpl
import dev.ultreon.quantum.qfunc.psi.impl.QuantumParamNameImpl

object QuantumElementFactory {
    fun createGlobalName(project: Project, name: String): QuantumGlobalNameImpl {
        val file: QuantumFile = createFile(project, "$$name = 0;")
        return (file.descendantsOfType<QuantumGlobalNameImpl>()).first()
    }

    fun createParamName(project: Project, name: String): QuantumParamNameImpl {
        val file: QuantumFile = createFile(project, "@$name = 0;")
        return (file.descendantsOfType<QuantumParamNameImpl>()).first()
    }

    fun createFile(project: Project, text: String): QuantumFile {
        val name = "dummy.qfunc"
        val a = com.intellij.psi.PsiFileFactory.getInstance(project).createFileFromText(name, QuantumFileType(), text) as QuantumFile
        a.calcTreeElement()
        return a
    }
}