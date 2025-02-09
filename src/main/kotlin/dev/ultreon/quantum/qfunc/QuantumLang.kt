package dev.ultreon.quantum.qfunc

import com.intellij.lang.Language
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import dev.ultreon.quantum.qfunc.psi.QuantumTokenTypes
import dev.ultreon.quantum.qfunc.psi.QuantumTypes
import javax.swing.Icon

// Define the language
object QuantumLang : Language("QuantumLang") {
    override fun getDisplayName(): String {
        return "Quantum Voxel Function"
    }

    override fun getAssociatedFileType(): LanguageFileType {
        return QuantumFileType()
    }

    override fun getMimeTypes(): Array<String> {
        return arrayOf("text/quantumvoxel+func")
    }

    override fun isCaseSensitive(): Boolean {
        return true
    }
}

// Define the file type
class QuantumFileType : LanguageFileType(QuantumLang) {
    override fun getName(): String = "Quantum Voxel Function"
    override fun getDescription(): String = "Quantum Voxel Function source file"
    override fun getDefaultExtension(): String = "qfunc"
    override fun getIcon(): Icon? = null
}

// Define the syntax highlighter
class QuantumSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = FlexAdapter(QuantumLexer(null))

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> = when (tokenType) {
        QuantumTypes.IF, QuantumTypes.ELSE, QuantumTypes.FOR, QuantumTypes.WHILE, QuantumTypes.LOOP, QuantumTypes.BREAK,
        QuantumTypes.CONTINUE, QuantumTypes.RETURN, QuantumTypes.STOP, QuantumTypes.IS, QuantumTypes.PRESENT -> KEYWORD_KEYS
        QuantumTypes.PERSIST -> DIRECTIVE_KEYS
        QuantumTypes.INPUT -> DIRECTIVE_KEYS
        QuantumTypes.DOLLAR -> VARIABLE_KEYS
        QuantumTypes.AT -> VARIABLE_KEYS
        QuantumTypes.FUNC_NAME -> FUNCTION_KEYS
        QuantumTypes.STRING -> STRING_KEYS
        QuantumTypes.ID -> TYPE_KEYS
        QuantumTypes.PARAMETER_EXPR -> PARAMETER_KEYS
        QuantumTypes.COMMENT -> COMMENT_KEYS

        QuantumTypes.HASH, QuantumTypes.AND, QuantumTypes.OR, QuantumTypes.NOT,
        QuantumTypes.BITWISE_AND, QuantumTypes.BITWISE_OR, QuantumTypes.BITWISE_XOR,
        QuantumTypes.BITWISE_NOT, QuantumTypes.SHIFT_LEFT, QuantumTypes.SHIFT_RIGHT,
        QuantumTypes.STAR, QuantumTypes.SLASH, QuantumTypes.PERCENT, QuantumTypes.PLUS, QuantumTypes.MINUS,
        QuantumTypes.LESS_THAN, QuantumTypes.GREATER_THAN, QuantumTypes.LESS_THAN_EQUAL, QuantumTypes.GREATER_THAN_EQUAL,
        QuantumTypes.ASSIGN -> EMPTY_KEYS

        QuantumTypes.LPAREN, QuantumTypes.RPAREN -> PARENTHESIS_KEYS
        QuantumTypes.LBRACKET, QuantumTypes.RBRACKET -> BRACKETS_KEYS
        QuantumTypes.LBRACE, QuantumTypes.RBRACE -> BRACES_KEYS

        QuantumTypes.NUMBER, QuantumTypes.FLOATING_POINT -> NUMBER_KEYS
        QuantumTypes.DIRECTIVE_TYPE -> TYPE_KEYS
        QuantumTypes.IDENTIFIER -> EMPTY_KEYS
        TokenType.WHITE_SPACE -> EMPTY_KEYS
        TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
        else -> {
            EMPTY_KEYS
        }
    }
}

val KEYWORD = createTextAttributesKey("QUANTUM_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
val TYPE = createTextAttributesKey("QUANTUM_TYPE", DefaultLanguageHighlighterColors.CLASS_NAME)
val VARIABLE = createTextAttributesKey("QUANTUM_VARIABLE", DefaultLanguageHighlighterColors.STATIC_FIELD)
val FUNCTION = createTextAttributesKey("QUANTUM_FUNCTION", DefaultLanguageHighlighterColors.FUNCTION_CALL)
val STRING = createTextAttributesKey("QUANTUM_STRING", DefaultLanguageHighlighterColors.STRING)
val COMMENT = createTextAttributesKey("QUANTUM_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
val PARAMETER = createTextAttributesKey("QUANTUM_PARAMETER", DefaultLanguageHighlighterColors.METADATA)
val FIELD = createTextAttributesKey("QUANTUM_FIELD", DefaultLanguageHighlighterColors.INSTANCE_FIELD)
val NUMBER = createTextAttributesKey("QUANTUM_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
val DIRECTIVE = createTextAttributesKey("QUANTUM_DIRECTIVE", DefaultLanguageHighlighterColors.METADATA)
val PARENTHESIS = createTextAttributesKey("QUANTUM_PARENTHESIS", DefaultLanguageHighlighterColors.PARENTHESES)
val BRACKETS = createTextAttributesKey("QUANTUM_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)
val BRACES = createTextAttributesKey("QUANTUM_BRACES", DefaultLanguageHighlighterColors.BRACES)
val BAD_CHAR = createTextAttributesKey("QUANTUM_BAD_CHAR", HighlighterColors.BAD_CHARACTER)
private val KEYWORD_KEYS = arrayOf(KEYWORD)
private val TYPE_KEYS = arrayOf(TYPE)
private val VARIABLE_KEYS = arrayOf(VARIABLE)
private val FUNCTION_KEYS = arrayOf(FUNCTION)
private val STRING_KEYS = arrayOf(STRING)
private val PARAMETER_KEYS = arrayOf(PARAMETER)
private val COMMENT_KEYS = arrayOf(COMMENT)
private val FIELD_KEYS = arrayOf(FIELD)
private val NUMBER_KEYS = arrayOf(NUMBER)
private val DIRECTIVE_KEYS = arrayOf(DIRECTIVE)
private val PARENTHESIS_KEYS = arrayOf(PARENTHESIS)
private val BRACKETS_KEYS = arrayOf(BRACKETS)
private val BRACES_KEYS = arrayOf(BRACES)
private val BAD_CHAR_KEYS = arrayOf(BAD_CHAR)
private val EMPTY_KEYS = emptyArray<TextAttributesKey>()