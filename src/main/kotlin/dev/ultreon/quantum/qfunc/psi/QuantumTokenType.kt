package dev.ultreon.quantum.qfunc.psi

import com.intellij.psi.tree.IElementType
import dev.ultreon.quantum.qfunc.QuantumLang


class QuantumTokenType(debugName: String) : IElementType(debugName, QuantumLang) {
  override fun toString(): String {
    return "QuantumTokenType." + super.toString()
  }
}

object QuantumTokenTypes {
}
