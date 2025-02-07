// This is a generated file. Not intended for manual editing.
package dev.ultreon.quantum.qfunc.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static dev.ultreon.quantum.qfunc.psi.QuantumTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SimpleParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return file(b, l + 1);
  }

  /* ********************************************************** */
  // primary ((PLUS | MINUS) add_expr)*
  public static boolean add_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "add_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADD_EXPR, "<add expr>");
    r = primary(b, l + 1);
    r = r && add_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((PLUS | MINUS) add_expr)*
  private static boolean add_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "add_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!add_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "add_expr_1", c)) break;
    }
    return true;
  }

  // (PLUS | MINUS) add_expr
  private static boolean add_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "add_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = add_expr_1_0_0(b, l + 1);
    r = r && add_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS | MINUS
  private static boolean add_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "add_expr_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // or_expr (AND and_expr)?
  public static boolean and_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_EXPR, "<and expr>");
    r = or_expr(b, l + 1);
    r = r && and_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (AND and_expr)?
  private static boolean and_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr_1")) return false;
    and_expr_1_0(b, l + 1);
    return true;
  }

  // AND and_expr
  private static boolean and_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && and_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (parameter_name COLON expression) | expression
  public static boolean argument_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT_EXPR, "<argument expr>");
    r = argument_expr_0(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // parameter_name COLON expression
  private static boolean argument_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_name(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN (argument_expr (COMMA argument_expr)*)? RPAREN
  public static boolean argument_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && argument_list_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, ARGUMENT_LIST, r);
    return r;
  }

  // (argument_expr (COMMA argument_expr)*)?
  private static boolean argument_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list_1")) return false;
    argument_list_1_0(b, l + 1);
    return true;
  }

  // argument_expr (COMMA argument_expr)*
  private static boolean argument_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = argument_expr(b, l + 1);
    r = r && argument_list_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA argument_expr)*
  private static boolean argument_list_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!argument_list_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "argument_list_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA argument_expr
  private static boolean argument_list_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && argument_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // global_expr ASSIGN expression SEMICOLON
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    if (!nextTokenIs(b, DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = global_expr(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // named_atom
  //        | STRING
  //        | NUMBER
  //        | FLOATING_POINT
  //        | BOOLEAN
  //        | id
  public static boolean atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATOM, "<atom>");
    r = named_atom(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, FLOATING_POINT);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = id(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // bitwise_or_expr (BITWISE_AND bitwise_and_expr)?
  public static boolean bitwise_and_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_and_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BITWISE_AND_EXPR, "<bitwise and expr>");
    r = bitwise_or_expr(b, l + 1);
    r = r && bitwise_and_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BITWISE_AND bitwise_and_expr)?
  private static boolean bitwise_and_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_and_expr_1")) return false;
    bitwise_and_expr_1_0(b, l + 1);
    return true;
  }

  // BITWISE_AND bitwise_and_expr
  private static boolean bitwise_and_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_and_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BITWISE_AND);
    r = r && bitwise_and_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BITWISE_NOT? shift_expr | BITWISE_NOT bitwise_not_expr
  public static boolean bitwise_not_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_not_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BITWISE_NOT_EXPR, "<bitwise not expr>");
    r = bitwise_not_expr_0(b, l + 1);
    if (!r) r = bitwise_not_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BITWISE_NOT? shift_expr
  private static boolean bitwise_not_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_not_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bitwise_not_expr_0_0(b, l + 1);
    r = r && shift_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BITWISE_NOT?
  private static boolean bitwise_not_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_not_expr_0_0")) return false;
    consumeToken(b, BITWISE_NOT);
    return true;
  }

  // BITWISE_NOT bitwise_not_expr
  private static boolean bitwise_not_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_not_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BITWISE_NOT);
    r = r && bitwise_not_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // bitwise_xor_expr (BITWISE_OR bitwise_or_expr)?
  public static boolean bitwise_or_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_or_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BITWISE_OR_EXPR, "<bitwise or expr>");
    r = bitwise_xor_expr(b, l + 1);
    r = r && bitwise_or_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BITWISE_OR bitwise_or_expr)?
  private static boolean bitwise_or_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_or_expr_1")) return false;
    bitwise_or_expr_1_0(b, l + 1);
    return true;
  }

  // BITWISE_OR bitwise_or_expr
  private static boolean bitwise_or_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_or_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BITWISE_OR);
    r = r && bitwise_or_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // bitwise_not_expr (BITWISE_XOR bitwise_xor_expr)?
  public static boolean bitwise_xor_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_xor_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BITWISE_XOR_EXPR, "<bitwise xor expr>");
    r = bitwise_not_expr(b, l + 1);
    r = r && bitwise_xor_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BITWISE_XOR bitwise_xor_expr)?
  private static boolean bitwise_xor_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_xor_expr_1")) return false;
    bitwise_xor_expr_1_0(b, l + 1);
    return true;
  }

  // BITWISE_XOR bitwise_xor_expr
  private static boolean bitwise_xor_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwise_xor_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BITWISE_XOR);
    r = r && bitwise_xor_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE (statement)* RBRACE
  public static boolean block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && block_statement_1(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, BLOCK_STATEMENT, r);
    return r;
  }

  // (statement)*
  private static boolean block_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!block_statement_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block_statement_1", c)) break;
    }
    return true;
  }

  // (statement)
  private static boolean block_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BREAK SEMICOLON
  public static boolean break_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_statement")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BREAK, SEMICOLON);
    exit_section_(b, m, BREAK_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // is_cond | present_cond | expression
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = is_cond(b, l + 1);
    if (!r) r = present_cond(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CONTINUE SEMICOLON
  public static boolean continue_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_statement")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONTINUE, SEMICOLON);
    exit_section_(b, m, CONTINUE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // LESS_THAN IDENTIFIER GREATER_THAN
  public static boolean directive_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directive_type")) return false;
    if (!nextTokenIs(b, LESS_THAN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LESS_THAN, IDENTIFIER, GREATER_THAN);
    exit_section_(b, m, DIRECTIVE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // relational_expr (EQUAL equality_expr)? | relational_expr (NOT_EQUAL equality_expr)?
  public static boolean equality_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUALITY_EXPR, "<equality expr>");
    r = equality_expr_0(b, l + 1);
    if (!r) r = equality_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // relational_expr (EQUAL equality_expr)?
  private static boolean equality_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational_expr(b, l + 1);
    r = r && equality_expr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EQUAL equality_expr)?
  private static boolean equality_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expr_0_1")) return false;
    equality_expr_0_1_0(b, l + 1);
    return true;
  }

  // EQUAL equality_expr
  private static boolean equality_expr_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expr_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUAL);
    r = r && equality_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // relational_expr (NOT_EQUAL equality_expr)?
  private static boolean equality_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational_expr(b, l + 1);
    r = r && equality_expr_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (NOT_EQUAL equality_expr)?
  private static boolean equality_expr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expr_1_1")) return false;
    equality_expr_1_1_0(b, l + 1);
    return true;
  }

  // NOT_EQUAL equality_expr
  private static boolean equality_expr_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_expr_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT_EQUAL);
    r = r && equality_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // group
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = group(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression SEMICOLON
  public static boolean expression_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_STATEMENT, "<expression statement>");
    r = expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (statement)*
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    while (true) {
      int c = current_position_(b);
      if (!file_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file", c)) break;
    }
    return true;
  }

  // (statement)
  private static boolean file_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FOR IDENTIFIER IN expression statement
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, IDENTIFIER, IN);
    r = r && expression(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean func_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, FUNC_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // func_name argument_list
  public static boolean function_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = func_name(b, l + 1);
    r = r && argument_list(b, l + 1);
    exit_section_(b, m, FUNCTION_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // DOLLAR global_name
  public static boolean global_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_expr")) return false;
    if (!nextTokenIs(b, DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOLLAR);
    r = r && global_name(b, l + 1);
    exit_section_(b, m, GLOBAL_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean global_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, GLOBAL_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // (LPAREN and_expr RPAREN) | and_expr
  public static boolean group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP, "<group>");
    r = group_0(b, l + 1);
    if (!r) r = and_expr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPAREN and_expr RPAREN
  private static boolean group_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && and_expr(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (LBRACKET namespace COLON path RBRACKET) | (LBRACKET HASH namespace COLON path RBRACKET)
  public static boolean id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id_0(b, l + 1);
    if (!r) r = id_1(b, l + 1);
    exit_section_(b, m, ID, r);
    return r;
  }

  // LBRACKET namespace COLON path RBRACKET
  private static boolean id_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && namespace(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && path(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBRACKET HASH namespace COLON path RBRACKET
  private static boolean id_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LBRACKET, HASH);
    r = r && namespace(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && path(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IF condition statement (ELSE statement)?
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && condition(b, l + 1);
    r = r && statement(b, l + 1);
    r = r && if_statement_3(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // (ELSE statement)?
  private static boolean if_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_3")) return false;
    if_statement_3_0(b, l + 1);
    return true;
  }

  // ELSE statement
  private static boolean if_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // HASH INPUT param_name (param_name)*
  public static boolean input_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_statement")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, HASH, INPUT);
    r = r && param_name(b, l + 1);
    r = r && input_statement_3(b, l + 1);
    exit_section_(b, m, INPUT_STATEMENT, r);
    return r;
  }

  // (param_name)*
  private static boolean input_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_statement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!input_statement_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "input_statement_3", c)) break;
    }
    return true;
  }

  // (param_name)
  private static boolean input_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression IS expression
  public static boolean is_cond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "is_cond")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IS_COND, "<is cond>");
    r = expression(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMMENT
  public static boolean line_comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "line_comment")) return false;
    if (!nextTokenIs(b, COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMENT);
    exit_section_(b, m, LINE_COMMENT, r);
    return r;
  }

  /* ********************************************************** */
  // LOOP statement
  public static boolean loop_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement")) return false;
    if (!nextTokenIs(b, LOOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOOP);
    r = r && statement(b, l + 1);
    exit_section_(b, m, LOOP_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // COLON (function_call | variable_name)
  public static boolean member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && member_1(b, l + 1);
    exit_section_(b, m, MEMBER, r);
    return r;
  }

  // function_call | variable_name
  private static boolean member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_1")) return false;
    boolean r;
    r = function_call(b, l + 1);
    if (!r) r = variable_name(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // add_expr ((STAR | SLASH | PERCENT) mult_expr)*
  public static boolean mult_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULT_EXPR, "<mult expr>");
    r = add_expr(b, l + 1);
    r = r && mult_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((STAR | SLASH | PERCENT) mult_expr)*
  private static boolean mult_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mult_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mult_expr_1", c)) break;
    }
    return true;
  }

  // (STAR | SLASH | PERCENT) mult_expr
  private static boolean mult_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mult_expr_1_0_0(b, l + 1);
    r = r && mult_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STAR | SLASH | PERCENT
  private static boolean mult_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_expr_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, SLASH);
    if (!r) r = consumeToken(b, PERCENT);
    return r;
  }

  /* ********************************************************** */
  // (global_expr | parameter_expr | function_call | variable_name) member*
  public static boolean named_atom(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_atom")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAMED_ATOM, "<named atom>");
    r = named_atom_0(b, l + 1);
    r = r && named_atom_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // global_expr | parameter_expr | function_call | variable_name
  private static boolean named_atom_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_atom_0")) return false;
    boolean r;
    r = global_expr(b, l + 1);
    if (!r) r = parameter_expr(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    if (!r) r = variable_name(b, l + 1);
    return r;
  }

  // member*
  private static boolean named_atom_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_atom_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "named_atom_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean namespace(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, NAMESPACE, r);
    return r;
  }

  /* ********************************************************** */
  // NOT? equality_expr | NOT negation_expr
  public static boolean negation_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "negation_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEGATION_EXPR, "<negation expr>");
    r = negation_expr_0(b, l + 1);
    if (!r) r = negation_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NOT? equality_expr
  private static boolean negation_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "negation_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = negation_expr_0_0(b, l + 1);
    r = r && equality_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT?
  private static boolean negation_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "negation_expr_0_0")) return false;
    consumeToken(b, NOT);
    return true;
  }

  // NOT negation_expr
  private static boolean negation_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "negation_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && negation_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // negation_expr (OR or_expr)?
  public static boolean or_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OR_EXPR, "<or expr>");
    r = negation_expr(b, l + 1);
    r = r && or_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (OR or_expr)?
  private static boolean or_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr_1")) return false;
    or_expr_1_0(b, l + 1);
    return true;
  }

  // OR or_expr
  private static boolean or_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "or_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    r = r && or_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean param_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PARAM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // AT param_name
  public static boolean parameter_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_expr")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && param_name(b, l + 1);
    exit_section_(b, m, PARAMETER_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean parameter_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PARAMETER_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PATH, r);
    return r;
  }

  /* ********************************************************** */
  // HASH PERSIST directive_type global_name (global_name)*
  public static boolean persist_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "persist_statement")) return false;
    if (!nextTokenIs(b, HASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, HASH, PERSIST);
    r = r && directive_type(b, l + 1);
    r = r && global_name(b, l + 1);
    r = r && persist_statement_4(b, l + 1);
    exit_section_(b, m, PERSIST_STATEMENT, r);
    return r;
  }

  // (global_name)*
  private static boolean persist_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "persist_statement_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!persist_statement_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "persist_statement_4", c)) break;
    }
    return true;
  }

  // (global_name)
  private static boolean persist_statement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "persist_statement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = global_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PRESENT global_expr
  public static boolean present_cond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "present_cond")) return false;
    if (!nextTokenIs(b, PRESENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PRESENT);
    r = r && global_expr(b, l + 1);
    exit_section_(b, m, PRESENT_COND, r);
    return r;
  }

  /* ********************************************************** */
  // atom
  public static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY, "<primary>");
    r = atom(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // bitwise_and_expr (LESS_THAN relational_expr)? | bitwise_and_expr (GREATER_THAN relational_expr)? | bitwise_and_expr (LESS_THAN_EQUAL relational_expr)? | bitwise_and_expr (GREATER_THAN_EQUAL relational_expr)?
  public static boolean relational_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIONAL_EXPR, "<relational expr>");
    r = relational_expr_0(b, l + 1);
    if (!r) r = relational_expr_1(b, l + 1);
    if (!r) r = relational_expr_2(b, l + 1);
    if (!r) r = relational_expr_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // bitwise_and_expr (LESS_THAN relational_expr)?
  private static boolean relational_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bitwise_and_expr(b, l + 1);
    r = r && relational_expr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LESS_THAN relational_expr)?
  private static boolean relational_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expr_0_1")) return false;
    relational_expr_0_1_0(b, l + 1);
    return true;
  }

  // LESS_THAN relational_expr
  private static boolean relational_expr_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expr_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS_THAN);
    r = r && relational_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // bitwise_and_expr (GREATER_THAN relational_expr)?
  private static boolean relational_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bitwise_and_expr(b, l + 1);
    r = r && relational_expr_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GREATER_THAN relational_expr)?
  private static boolean relational_expr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expr_1_1")) return false;
    relational_expr_1_1_0(b, l + 1);
    return true;
  }

  // GREATER_THAN relational_expr
  private static boolean relational_expr_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expr_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GREATER_THAN);
    r = r && relational_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // bitwise_and_expr (LESS_THAN_EQUAL relational_expr)?
  private static boolean relational_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bitwise_and_expr(b, l + 1);
    r = r && relational_expr_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LESS_THAN_EQUAL relational_expr)?
  private static boolean relational_expr_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expr_2_1")) return false;
    relational_expr_2_1_0(b, l + 1);
    return true;
  }

  // LESS_THAN_EQUAL relational_expr
  private static boolean relational_expr_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expr_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS_THAN_EQUAL);
    r = r && relational_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // bitwise_and_expr (GREATER_THAN_EQUAL relational_expr)?
  private static boolean relational_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expr_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bitwise_and_expr(b, l + 1);
    r = r && relational_expr_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (GREATER_THAN_EQUAL relational_expr)?
  private static boolean relational_expr_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expr_3_1")) return false;
    relational_expr_3_1_0(b, l + 1);
    return true;
  }

  // GREATER_THAN_EQUAL relational_expr
  private static boolean relational_expr_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expr_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GREATER_THAN_EQUAL);
    r = r && relational_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RETURN expression SEMICOLON
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // mult_expr ((SHIFT_LEFT | SHIFT_RIGHT) shift_expr)*
  public static boolean shift_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_EXPR, "<shift expr>");
    r = mult_expr(b, l + 1);
    r = r && shift_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((SHIFT_LEFT | SHIFT_RIGHT) shift_expr)*
  private static boolean shift_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!shift_expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "shift_expr_1", c)) break;
    }
    return true;
  }

  // (SHIFT_LEFT | SHIFT_RIGHT) shift_expr
  private static boolean shift_expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shift_expr_1_0_0(b, l + 1);
    r = r && shift_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SHIFT_LEFT | SHIFT_RIGHT
  private static boolean shift_expr_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expr_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, SHIFT_LEFT);
    if (!r) r = consumeToken(b, SHIFT_RIGHT);
    return r;
  }

  /* ********************************************************** */
  // line_comment
  //             | persist_statement
  //             | input_statement
  //             | assignment
  //             | function_call
  //             | stop_statement
  //             | if_statement
  //             | for_statement
  //             | while_statement
  //             | loop_statement
  //             | return_statement
  //             | break_statement
  //             | continue_statement
  //             | block_statement
  //             | expression_statement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = line_comment(b, l + 1);
    if (!r) r = persist_statement(b, l + 1);
    if (!r) r = input_statement(b, l + 1);
    if (!r) r = assignment(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    if (!r) r = stop_statement(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = loop_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = break_statement(b, l + 1);
    if (!r) r = continue_statement(b, l + 1);
    if (!r) r = block_statement(b, l + 1);
    if (!r) r = expression_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STOP SEMICOLON
  public static boolean stop_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stop_statement")) return false;
    if (!nextTokenIs(b, STOP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STOP, SEMICOLON);
    exit_section_(b, m, STOP_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean variable_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, VARIABLE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // WHILE condition statement
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && condition(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

}
