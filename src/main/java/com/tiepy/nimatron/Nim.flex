package com.tiepy.nimatron;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.tiepy.nimatron.psi.NimTypes;
import java.util.Stack;

%%

%class NimLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\n|\r|\r\n
WHITE_SPACE=[\ \t\f]
BLOCK_COMMENT_BEGIN=#\[
BLOCK_COMMENT_END=\]#
BLOCK_DOC_COMMENT_BEGIN=##\[
BLOCK_DOC_COMMENT_END=\]##
DIGIT=[0-9]
ALPHA=[A-Za-z\u0080-\u00ff]
IDENT={ALPHA}(_|{ALPHA}|{DIGIT})*
KEYWORD=addr|and|as|asm|bind|block|break|case|cast|concept|const|continue|converter|defer|discard|distinct|div|do|elif
|else|end|enum|except|export|finally|for|from|func|if|import|in|include|interface|is|isnot|iterator|let|macro|method
|mixin|mod|nil|not|notin|object|of|or|out|proc|ptr|raise|ref|return|shl|shr|static|template|try|tuple|type|using|var
|when|while|xor|yield
HEX_DIGIT=[0-9A-Fa-f]
OCT_DIGIT=[0-7]
BIN_DIGIT=[01]
HEX_LIT=0(x|X){HEX_DIGIT}(_|{HEX_DIGIT})*
DEC_LIT={DIGIT}(_|{DIGIT})*
OCT_LIT=0o{OCT_DIGIT}(_|{OCT_DIGIT})*
BIN_LIT=0(b|B){BIN_DIGIT}(_|{BIN_DIGIT})*
INT_LIT={HEX_LIT}|{DEC_LIT}|{OCT_LIT}|{BIN_LIT}
INT8_LIT={INT_LIT}'?(i|I)8
INT16_LIT={INT_LIT}'?(i|I)16
INT32_LIT={INT_LIT}'?(i|I)32
INT64_LIT={INT_LIT}'?(i|I)64
UINT_LIT={INT_LIT}'?(u|U)
UINT8_LIT={INT_LIT}'?(u|U)8
UINT16_LIT={INT_LIT}'?(u|U)16
UINT32_LIT={INT_LIT}'?(u|U)32
UINT64_LIT={INT_LIT}'?(u|U)64
DIGITS={DEC_LIT}
EXPONENT=(e|E)(\+|\-)?{DIGITS}
FLOAT_LIT={DIGITS}((\.{DIGITS}{EXPONENT}?)|{EXPONENT})
FLOAT32_SUFFIX=(f|F)32
FLOAT64_SUFFIX=(f|F)64
FLOAT32_LIT=({HEX_LIT}'{FLOAT32_SUFFIX})|(({FLOAT_LIT}|{DEC_LIT}|{OCT_LIT}|{BIN_LIT})'?{FLOAT32_SUFFIX})
FLOAT64_LIT=({HEX_LIT}'{FLOAT64_SUFFIX})|(({FLOAT_LIT}|{DEC_LIT}|{OCT_LIT}|{BIN_LIT})'?{FLOAT64_SUFFIX})
NUMERICAL_CONSTANT={HEX_LIT}|{DEC_LIT}|{OCT_LIT}|{BIN_LIT}
|{INT_LIT}|{INT8_LIT}|{INT16_LIT}|{INT32_LIT}|{INT64_LIT}
|{UINT_LIT}|{UINT8_LIT}|{UINT16_LIT}|{UINT32_LIT}|{UINT64_LIT}
|{FLOAT_LIT}|{FLOAT32_LIT}|{FLOAT64_LIT}
OPR=[\=\+\-\*/<>@$~&%\|!\?\^\.:\\]+
OTHER=[`\(\)\{\}\[\],;]|(\[\.)|(\.\])|(\{\.)|(\.\})|(\(\.)|(\.\))|(\[:)

%{

private Stack<Integer> stack = new Stack<Integer>();

public void yypushState(int newState) {
    stack.push(yystate());
    yybegin(newState);
}

public void yypopState() {
    yybegin(stack.pop());
}

%}

%state YYINITIAL
%state LINE_COMMENT
%state BLOCK_COMMENT
%state BLOCK_DOC_COMMENT
%state STRING_LITERAL
%state TRIPLE_STRING_LITERAL
%state RAW_STRING_LITERAL
%state GENERALIZED_STRING_LITERAL
%state GENERALIZED_TRIPLE_STRING_LITERAL
%state CHARACTER_LITERAL

%%

<YYINITIAL> {
    {CRLF}+                     { return TokenType.WHITE_SPACE; }
    {WHITE_SPACE}+              { return TokenType.WHITE_SPACE; }
    #                           { yypushState(LINE_COMMENT); return NimTypes.COMMENT; }
    {BLOCK_COMMENT_BEGIN}       { yypushState(BLOCK_COMMENT); return NimTypes.COMMENT; }
    {BLOCK_DOC_COMMENT_BEGIN}   { yypushState(BLOCK_DOC_COMMENT); return NimTypes.COMMENT; }
    {KEYWORD}                   { return NimTypes.KEYWORD; }
    r\"                         { yypushState(RAW_STRING_LITERAL); return NimTypes.STRING_LITERAL; }
    \"\"\"                      { yypushState(TRIPLE_STRING_LITERAL); return NimTypes.STRING_LITERAL; }
    \"                          { yypushState(STRING_LITERAL); return NimTypes.STRING_LITERAL; }
    {IDENT}\"                   { yypushState(GENERALIZED_STRING_LITERAL); return NimTypes.STRING_LITERAL; }
    {IDENT}\"\"\"               { yypushState(GENERALIZED_TRIPLE_STRING_LITERAL); return NimTypes.STRING_LITERAL; }
    '                           { yypushState(CHARACTER_LITERAL); return NimTypes.STRING_LITERAL; }
    {NUMERICAL_CONSTANT}        { return NimTypes.NUMERICAL_CONSTANT; }
    {ALPHA}+                    { return TokenType.WHITE_SPACE; }
    .                           { return TokenType.WHITE_SPACE; }
}

<LINE_COMMENT> {
    {CRLF}+                     { yypopState(); return NimTypes.COMMENT; }
    .                           { return NimTypes.COMMENT; }
}

<BLOCK_COMMENT> {
    {BLOCK_COMMENT_BEGIN}       { yypushState(BLOCK_COMMENT); return NimTypes.COMMENT; }
    {BLOCK_COMMENT_END}         { yypopState(); return NimTypes.COMMENT; }
    {CRLF}+                     { return NimTypes.COMMENT; }
    .                           { return NimTypes.COMMENT; }
}

<BLOCK_DOC_COMMENT> {
    {BLOCK_DOC_COMMENT_BEGIN}   { yypushState(BLOCK_DOC_COMMENT); return NimTypes.COMMENT; }
    {BLOCK_DOC_COMMENT_END}     { yypopState(); return NimTypes.COMMENT; }
    {CRLF}+                     { return NimTypes.COMMENT; }
    .                           { return NimTypes.COMMENT; }
}

<STRING_LITERAL> {
    \\\"                        { return NimTypes.STRING_LITERAL; }
    \"                          { yypopState(); return NimTypes.STRING_LITERAL; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { return NimTypes.STRING_LITERAL; }
}

<TRIPLE_STRING_LITERAL> {
    \"\"\"                      { yypopState(); return NimTypes.STRING_LITERAL; }
    {CRLF}                      { return NimTypes.STRING_LITERAL; }
    .                           { return NimTypes.STRING_LITERAL; }
}

<RAW_STRING_LITERAL> {
    \"\"                        { return NimTypes.STRING_LITERAL; }
    \"                          { yypopState(); return NimTypes.STRING_LITERAL; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { return NimTypes.STRING_LITERAL; }
}

<GENERALIZED_STRING_LITERAL> {
    \"\"                        { return NimTypes.STRING_LITERAL; }
    \"                          { yypopState(); return NimTypes.STRING_LITERAL; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { return NimTypes.STRING_LITERAL; }
}

<GENERALIZED_TRIPLE_STRING_LITERAL> {
    \"\"\"                      { yypopState(); return NimTypes.STRING_LITERAL; }
    {CRLF}                      { return NimTypes.STRING_LITERAL; }
    .                           { return NimTypes.STRING_LITERAL; }
}

<CHARACTER_LITERAL> {
    '                           { yypopState(); return NimTypes.STRING_LITERAL; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { return NimTypes.STRING_LITERAL; }
}
