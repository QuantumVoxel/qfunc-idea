package dev.ultreon.quantum.qfunc

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import dev.ultreon.quantum.qfunc.parser.QuantumParser
import dev.ultreon.quantum.qfunc.psi.QuantumTokenTypes
import dev.ultreon.quantum.qfunc.psi.QuantumTypes

class QuantumParserDefinition : ParserDefinition {
  override fun createLexer(project: Project?): Lexer {
    return FlexAdapter(QuantumLexer(null))
  }

  override fun spaceExistenceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements {
    return ParserDefinition.SpaceRequirements.MAY
  }

  override fun getCommentTokens(): TokenSet {
    return TokenSet.create(QuantumTypes.COMMENT)
  }

  override fun getStringLiteralElements(): TokenSet {
    return TokenSet.create(QuantumTypes.STRING)
  }

  override fun createParser(project: Project?): PsiParser {
    return QuantumParser()
  }

  override fun getFileNodeType(): IFileElementType {
    return FILE
  }

  override fun createFile(viewProvider: FileViewProvider): PsiFile {
    return QuantumFile(viewProvider)
  }

  override fun createElement(node: ASTNode): PsiElement {
    return QuantumTypes.Factory.createElement(node)
  }
}

val FILE = IFileElementType(QuantumLang)