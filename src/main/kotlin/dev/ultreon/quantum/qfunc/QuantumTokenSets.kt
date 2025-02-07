package dev.ultreon.quantum.qfunc

import com.intellij.psi.tree.TokenSet
import dev.ultreon.quantum.qfunc.psi.QuantumTypes

object QuantumTokenSets {
    val comments = TokenSet.create(QuantumTypes.COMMENT)
    val literals = TokenSet.create(QuantumTypes.STRING, QuantumTypes.NUMBER)

    val globalNames = TokenSet.create(QuantumTypes.GLOBAL_NAME)
    val paramNames = TokenSet.create(QuantumTypes.PARAM_NAME)
    val names = TokenSet.create(QuantumTypes.GLOBAL_NAME, QuantumTypes.PARAM_NAME)
    val nameElement = TokenSet.orSet(names)
    val namespace = TokenSet.create(QuantumTypes.NAMESPACE)
    val path = TokenSet.create(QuantumTypes.PATH)
    val paths = TokenSet.create(QuantumTypes.PATH, QuantumTypes.NAMESPACE)

    val keywords = TokenSet.create(
        QuantumTypes.IF, QuantumTypes.ELSE, QuantumTypes.FOR, QuantumTypes.WHILE, QuantumTypes.LOOP, QuantumTypes.BREAK,
        QuantumTypes.CONTINUE, QuantumTypes.RETURN, QuantumTypes.STOP, QuantumTypes.IS
    )

    val operators = TokenSet.create(
        QuantumTypes.AND, QuantumTypes.OR, QuantumTypes.NOT,
        QuantumTypes.BITWISE_AND, QuantumTypes.BITWISE_OR, QuantumTypes.BITWISE_XOR,
        QuantumTypes.BITWISE_NOT, QuantumTypes.SHIFT_LEFT, QuantumTypes.SHIFT_RIGHT,
        QuantumTypes.STAR, QuantumTypes.SLASH, QuantumTypes.PERCENT, QuantumTypes.PLUS, QuantumTypes.MINUS,
        QuantumTypes.LESS_THAN, QuantumTypes.GREATER_THAN, QuantumTypes.LESS_THAN_EQUAL, QuantumTypes.GREATER_THAN_EQUAL,
        QuantumTypes.ASSIGN
    )
}