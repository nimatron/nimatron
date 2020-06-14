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
IDENT={ALPHA}('_'|{ALPHA}|{DIGIT})*
KEYWORD=addr|and|as|asm|bind|block|break|case|cast|concept|const|continue|converter|defer|discard|distinct|div|do|elif
|else|end|enum|except|export|finally|for|from|func|if|import|in|include|interface|is|isnot|iterator|let|macro|method
|mixin|mod|nil|not|notin|object|of|or|out|proc|ptr|raise|ref|return|shl|shr|static|template|try|tuple|type|using|var
|when|while|xor|yield

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
%state STATEMENT

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

//<STATEMENT> {
//
//}
