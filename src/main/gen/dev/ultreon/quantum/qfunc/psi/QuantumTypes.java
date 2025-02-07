// This is a generated file. Not intended for manual editing.
package dev.ultreon.quantum.qfunc.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import dev.ultreon.quantum.qfunc.psi.impl.*;

public interface QuantumTypes {

  IElementType ADD_EXPR = new QuantumElementType("ADD_EXPR");
  IElementType AND_EXPR = new QuantumElementType("AND_EXPR");
  IElementType ARGUMENT_EXPR = new QuantumElementType("ARGUMENT_EXPR");
  IElementType ARGUMENT_LIST = new QuantumElementType("ARGUMENT_LIST");
  IElementType ASSIGNMENT = new QuantumElementType("ASSIGNMENT");
  IElementType ATOM = new QuantumElementType("ATOM");
  IElementType BITWISE_AND_EXPR = new QuantumElementType("BITWISE_AND_EXPR");
  IElementType BITWISE_NOT_EXPR = new QuantumElementType("BITWISE_NOT_EXPR");
  IElementType BITWISE_OR_EXPR = new QuantumElementType("BITWISE_OR_EXPR");
  IElementType BITWISE_XOR_EXPR = new QuantumElementType("BITWISE_XOR_EXPR");
  IElementType BLOCK_STATEMENT = new QuantumElementType("BLOCK_STATEMENT");
  IElementType BREAK_STATEMENT = new QuantumElementType("BREAK_STATEMENT");
  IElementType CONDITION = new QuantumElementType("CONDITION");
  IElementType CONTINUE_STATEMENT = new QuantumElementType("CONTINUE_STATEMENT");
  IElementType DIRECTIVE_TYPE = new QuantumElementType("DIRECTIVE_TYPE");
  IElementType EQUALITY_EXPR = new QuantumElementType("EQUALITY_EXPR");
  IElementType EXPRESSION = new QuantumElementType("EXPRESSION");
  IElementType EXPRESSION_STATEMENT = new QuantumElementType("EXPRESSION_STATEMENT");
  IElementType FOR_STATEMENT = new QuantumElementType("FOR_STATEMENT");
  IElementType FUNCTION_CALL = new QuantumElementType("FUNCTION_CALL");
  IElementType FUNC_NAME = new QuantumElementType("FUNC_NAME");
  IElementType GLOBAL_EXPR = new QuantumElementType("GLOBAL_EXPR");
  IElementType GLOBAL_NAME = new QuantumElementType("GLOBAL_NAME");
  IElementType GROUP = new QuantumElementType("GROUP");
  IElementType ID = new QuantumElementType("ID");
  IElementType IF_STATEMENT = new QuantumElementType("IF_STATEMENT");
  IElementType INPUT_STATEMENT = new QuantumElementType("INPUT_STATEMENT");
  IElementType IS_COND = new QuantumElementType("IS_COND");
  IElementType LINE_COMMENT = new QuantumElementType("LINE_COMMENT");
  IElementType LOOP_STATEMENT = new QuantumElementType("LOOP_STATEMENT");
  IElementType MEMBER = new QuantumElementType("MEMBER");
  IElementType MULT_EXPR = new QuantumElementType("MULT_EXPR");
  IElementType NAMED_ATOM = new QuantumElementType("NAMED_ATOM");
  IElementType NAMESPACE = new QuantumElementType("NAMESPACE");
  IElementType NEGATION_EXPR = new QuantumElementType("NEGATION_EXPR");
  IElementType OR_EXPR = new QuantumElementType("OR_EXPR");
  IElementType PARAMETER_EXPR = new QuantumElementType("PARAMETER_EXPR");
  IElementType PARAMETER_NAME = new QuantumElementType("PARAMETER_NAME");
  IElementType PARAM_NAME = new QuantumElementType("PARAM_NAME");
  IElementType PATH = new QuantumElementType("PATH");
  IElementType PERSIST_STATEMENT = new QuantumElementType("PERSIST_STATEMENT");
  IElementType PRIMARY = new QuantumElementType("PRIMARY");
  IElementType RELATIONAL_EXPR = new QuantumElementType("RELATIONAL_EXPR");
  IElementType RETURN_STATEMENT = new QuantumElementType("RETURN_STATEMENT");
  IElementType SHIFT_EXPR = new QuantumElementType("SHIFT_EXPR");
  IElementType STATEMENT = new QuantumElementType("STATEMENT");
  IElementType STOP_STATEMENT = new QuantumElementType("STOP_STATEMENT");
  IElementType VARIABLE_NAME = new QuantumElementType("VARIABLE_NAME");
  IElementType WHILE_STATEMENT = new QuantumElementType("WHILE_STATEMENT");

  IElementType AND = new QuantumTokenType("AND");
  IElementType ASSIGN = new QuantumTokenType("ASSIGN");
  IElementType AT = new QuantumTokenType("AT");
  IElementType BITWISE_AND = new QuantumTokenType("BITWISE_AND");
  IElementType BITWISE_NOT = new QuantumTokenType("BITWISE_NOT");
  IElementType BITWISE_OR = new QuantumTokenType("BITWISE_OR");
  IElementType BITWISE_XOR = new QuantumTokenType("BITWISE_XOR");
  IElementType BOOLEAN = new QuantumTokenType("BOOLEAN");
  IElementType BREAK = new QuantumTokenType("BREAK");
  IElementType COLON = new QuantumTokenType("COLON");
  IElementType COMMA = new QuantumTokenType("COMMA");
  IElementType COMMENT = new QuantumTokenType("COMMENT");
  IElementType CONTINUE = new QuantumTokenType("CONTINUE");
  IElementType DOLLAR = new QuantumTokenType("DOLLAR");
  IElementType ELSE = new QuantumTokenType("ELSE");
  IElementType EQUAL = new QuantumTokenType("EQUAL");
  IElementType FLOATING_POINT = new QuantumTokenType("FLOATING_POINT");
  IElementType FOR = new QuantumTokenType("FOR");
  IElementType GREATER_THAN = new QuantumTokenType("GREATER_THAN");
  IElementType GREATER_THAN_EQUAL = new QuantumTokenType("GREATER_THAN_EQUAL");
  IElementType HASH = new QuantumTokenType("HASH");
  IElementType IDENTIFIER = new QuantumTokenType("IDENTIFIER");
  IElementType IF = new QuantumTokenType("IF");
  IElementType IN = new QuantumTokenType("IN");
  IElementType INPUT = new QuantumTokenType("INPUT");
  IElementType IS = new QuantumTokenType("IS");
  IElementType LBRACE = new QuantumTokenType("LBRACE");
  IElementType LBRACKET = new QuantumTokenType("LBRACKET");
  IElementType LESS_THAN = new QuantumTokenType("LESS_THAN");
  IElementType LESS_THAN_EQUAL = new QuantumTokenType("LESS_THAN_EQUAL");
  IElementType LOOP = new QuantumTokenType("LOOP");
  IElementType LPAREN = new QuantumTokenType("LPAREN");
  IElementType MINUS = new QuantumTokenType("MINUS");
  IElementType NOT = new QuantumTokenType("NOT");
  IElementType NOT_EQUAL = new QuantumTokenType("NOT_EQUAL");
  IElementType NUMBER = new QuantumTokenType("NUMBER");
  IElementType OR = new QuantumTokenType("OR");
  IElementType PERCENT = new QuantumTokenType("PERCENT");
  IElementType PERSIST = new QuantumTokenType("PERSIST");
  IElementType PLUS = new QuantumTokenType("PLUS");
  IElementType RBRACE = new QuantumTokenType("RBRACE");
  IElementType RBRACKET = new QuantumTokenType("RBRACKET");
  IElementType RETURN = new QuantumTokenType("RETURN");
  IElementType RPAREN = new QuantumTokenType("RPAREN");
  IElementType SEMICOLON = new QuantumTokenType("SEMICOLON");
  IElementType SHIFT_LEFT = new QuantumTokenType("SHIFT_LEFT");
  IElementType SHIFT_RIGHT = new QuantumTokenType("SHIFT_RIGHT");
  IElementType SLASH = new QuantumTokenType("SLASH");
  IElementType STAR = new QuantumTokenType("STAR");
  IElementType STOP = new QuantumTokenType("STOP");
  IElementType STRING = new QuantumTokenType("STRING");
  IElementType WHILE = new QuantumTokenType("WHILE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADD_EXPR) {
        return new QuantumAddExprImpl(node);
      }
      else if (type == AND_EXPR) {
        return new QuantumAndExprImpl(node);
      }
      else if (type == ARGUMENT_EXPR) {
        return new QuantumArgumentExprImpl(node);
      }
      else if (type == ARGUMENT_LIST) {
        return new QuantumArgumentListImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new QuantumAssignmentImpl(node);
      }
      else if (type == ATOM) {
        return new QuantumAtomImpl(node);
      }
      else if (type == BITWISE_AND_EXPR) {
        return new QuantumBitwiseAndExprImpl(node);
      }
      else if (type == BITWISE_NOT_EXPR) {
        return new QuantumBitwiseNotExprImpl(node);
      }
      else if (type == BITWISE_OR_EXPR) {
        return new QuantumBitwiseOrExprImpl(node);
      }
      else if (type == BITWISE_XOR_EXPR) {
        return new QuantumBitwiseXorExprImpl(node);
      }
      else if (type == BLOCK_STATEMENT) {
        return new QuantumBlockStatementImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new QuantumBreakStatementImpl(node);
      }
      else if (type == CONDITION) {
        return new QuantumConditionImpl(node);
      }
      else if (type == CONTINUE_STATEMENT) {
        return new QuantumContinueStatementImpl(node);
      }
      else if (type == DIRECTIVE_TYPE) {
        return new QuantumDirectiveTypeImpl(node);
      }
      else if (type == EQUALITY_EXPR) {
        return new QuantumEqualityExprImpl(node);
      }
      else if (type == EXPRESSION) {
        return new QuantumExpressionImpl(node);
      }
      else if (type == EXPRESSION_STATEMENT) {
        return new QuantumExpressionStatementImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new QuantumForStatementImpl(node);
      }
      else if (type == FUNCTION_CALL) {
        return new QuantumFunctionCallImpl(node);
      }
      else if (type == FUNC_NAME) {
        return new QuantumFuncNameImpl(node);
      }
      else if (type == GLOBAL_EXPR) {
        return new QuantumGlobalExprImpl(node);
      }
      else if (type == GLOBAL_NAME) {
        return new QuantumGlobalNameImpl(node);
      }
      else if (type == GROUP) {
        return new QuantumGroupImpl(node);
      }
      else if (type == ID) {
        return new QuantumIdImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new QuantumIfStatementImpl(node);
      }
      else if (type == INPUT_STATEMENT) {
        return new QuantumInputStatementImpl(node);
      }
      else if (type == IS_COND) {
        return new QuantumIsCondImpl(node);
      }
      else if (type == LINE_COMMENT) {
        return new QuantumLineCommentImpl(node);
      }
      else if (type == LOOP_STATEMENT) {
        return new QuantumLoopStatementImpl(node);
      }
      else if (type == MEMBER) {
        return new QuantumMemberImpl(node);
      }
      else if (type == MULT_EXPR) {
        return new QuantumMultExprImpl(node);
      }
      else if (type == NAMED_ATOM) {
        return new QuantumNamedAtomImpl(node);
      }
      else if (type == NAMESPACE) {
        return new QuantumNamespaceImpl(node);
      }
      else if (type == NEGATION_EXPR) {
        return new QuantumNegationExprImpl(node);
      }
      else if (type == OR_EXPR) {
        return new QuantumOrExprImpl(node);
      }
      else if (type == PARAMETER_EXPR) {
        return new QuantumParameterExprImpl(node);
      }
      else if (type == PARAMETER_NAME) {
        return new QuantumParameterNameImpl(node);
      }
      else if (type == PARAM_NAME) {
        return new QuantumParamNameImpl(node);
      }
      else if (type == PATH) {
        return new QuantumPathImpl(node);
      }
      else if (type == PERSIST_STATEMENT) {
        return new QuantumPersistStatementImpl(node);
      }
      else if (type == PRIMARY) {
        return new QuantumPrimaryImpl(node);
      }
      else if (type == RELATIONAL_EXPR) {
        return new QuantumRelationalExprImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new QuantumReturnStatementImpl(node);
      }
      else if (type == SHIFT_EXPR) {
        return new QuantumShiftExprImpl(node);
      }
      else if (type == STATEMENT) {
        return new QuantumStatementImpl(node);
      }
      else if (type == STOP_STATEMENT) {
        return new QuantumStopStatementImpl(node);
      }
      else if (type == VARIABLE_NAME) {
        return new QuantumVariableNameImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new QuantumWhileStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
