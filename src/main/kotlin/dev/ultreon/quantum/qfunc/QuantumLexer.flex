package dev.ultreon.quantum.qfunc;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static dev.ultreon.quantum.qfunc.psi.QuantumTokenTypes.*;
import static dev.ultreon.quantum.qfunc.psi.QuantumTypes.*;

%%

%class QuantumLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

%{

%}

WHITESPACE = [ \t\n\r]+
DIRECTIVE = "#" [a-zA-Z_][a-zA-Z0-9_]*
STRING = "'" ([^'\n\r\\]|\\.)* "'"
IDENTIFIER = [a-zA-Z_]([a-zA-Z0-9_-]*[a-zA-Z0-9])?
FLOATING_POINT = [0-9]+(\.[0-9]+)?
NUMBER = [0-9]+
COMMENT = "//" [^\n\r]*
COMMA = ","
SEMICOLON = ";"
COLON = ":"
ARROW = "->"
LESS_THAN = "<"
GREATER_THAN = ">"
LESS_THAN_EQUAL = "<="
GREATER_THAN_EQUAL = ">="
NOT_EQUAL = "!="
EQUAL = "=="
BITWISE_AND = "&"
BITWISE_OR = "|"
BITWISE_XOR = "^"
BITWISE_NOT = "~"
SHIFT_LEFT = "<<"
SHIFT_RIGHT = ">>"
BITWISE_SHIFT = SHIFT_LEFT | SHIFT_RIGHT
STAR = "*"
SLASH = "/"
PERCENT = "%"
PLUS = "+"
MINUS = "-"
ASSIGN = "="
HASH = "#"
LPAREN = "("
RPAREN = ")"
LBRACKET = "["
RBRACKET = "]"
LBRACE = "{"
RBRACE = "}"
IF = "if"
IS = "is"
ELSE = "else"
WHILE = "while"
FOR = "for"
LOOP = "loop"
BREAK = "break"
CONTINUE = "continue"
STOP = "stop"
INPUT_DIRECTIVE = "input"
PERSIST_DIRECTIVE = "persist"
DIRECTIVE = INPUT_DIRECTIVE | PERSIST_DIRECTIVE
DOLLAR = "$"
AT = "@"

%%

<YYINITIAL> {
    {COMMENT}            { return COMMENT; }
    {WHITESPACE}         { return com.intellij.psi.TokenType.WHITE_SPACE; }
    {PERSIST_DIRECTIVE}  { return PERSIST; }
    {INPUT_DIRECTIVE}    { return INPUT; }
    {SEMICOLON}          { return SEMICOLON; }
    {IF}                 { return IF; }
    {IS}                 { return IS; }
    {ELSE}               { return ELSE; }
    {WHILE}              { return WHILE; }
    {FOR}                { return FOR; }
    {LOOP}               { return LOOP; }
    {BREAK}              { return BREAK; }
    {CONTINUE}           { return CONTINUE; }
    {STOP}               { return STOP; }
    {BITWISE_AND}        { return BITWISE_AND; }
    {BITWISE_OR}         { return BITWISE_OR; }
    {BITWISE_XOR}        { return BITWISE_XOR; }
    {BITWISE_NOT}        { return BITWISE_NOT; }
    {SHIFT_LEFT}         { return SHIFT_LEFT; }
    {SHIFT_RIGHT}        { return SHIFT_RIGHT; }
    {DOLLAR}             { return DOLLAR; }
    {AT}                 { return AT; }
    {LPAREN}             { return LPAREN; }
    {RPAREN}             { return RPAREN; }
    {LBRACKET}           { return LBRACKET; }
    {RBRACKET}           { return RBRACKET; }
    {LBRACE}             { return LBRACE; }
    {RBRACE}             { return RBRACE; }
    {HASH}               { return HASH; }
    {PLUS}               { return PLUS; }
    {MINUS}              { return MINUS; }
    {STAR}               { return STAR; }
    {SLASH}              { return SLASH; }
    {PERCENT}            { return PERCENT; }
    {COMMA}              { return COMMA; }
    {COLON}              { return COLON; }
    {ASSIGN}             { return ASSIGN; }
    {LESS_THAN}          { return LESS_THAN; }
    {GREATER_THAN}       { return GREATER_THAN; }
    {LESS_THAN_EQUAL}    { return LESS_THAN_EQUAL; }
    {GREATER_THAN_EQUAL} { return GREATER_THAN_EQUAL; }
    {EQUAL}              { return EQUAL; }
    {NOT_EQUAL}          { return NOT_EQUAL; }
    {STRING}             { return STRING; }
    {IDENTIFIER}         { return IDENTIFIER; }
    {FLOATING_POINT}     { return FLOATING_POINT; }
    {NUMBER}             { return NUMBER; }

   . { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}

[^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
