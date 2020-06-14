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
BLOCK_COMMENT=#\[
BLOCK_DOC_COMMENT=##\[
//DIGIT=[0-9]
LETTER=[A-Za-z\u0080-\u00ff]
//NOT_LETTER=[^A-Za-z\u0080-\u00ff]
//IDENTIFIER={LETTER} (['_'] ({LETTER}|{DIGIT}))*
KEYWORD=addr|and|as|asm|bind|block|break|case|cast|concept|const|continue|converter|defer|discard|distinct|div|do|elif
|else|end|enum|except|export|finally|for|from|func|if|import|in|include|interface|is|isnot|iterator|let|macro|method
|mixin|mod|nil|not|notin|object|of|or|out|proc|ptr|raise|ref|return|shl|shr|static|template|try|tuple|type|using|var
|when|while|xor|yield

%{

int level = 0; // Level counter for nested comment blocks.

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
%state LITERAL_STRING
%state LITERAL_STRING_TRIPLE
%state LITERAL_STRING_RAW
%state STATEMENT

%%

<YYINITIAL> {
    {CRLF}+                     { return TokenType.WHITE_SPACE; }
    {WHITE_SPACE}+              { return TokenType.WHITE_SPACE; }
    #                           { yypushState(LINE_COMMENT); return NimTypes.COMMENT; }
    {BLOCK_COMMENT}             { level = 1; yypushState(BLOCK_COMMENT); return NimTypes.COMMENT; }
    {BLOCK_DOC_COMMENT}         { level = 1; yypushState(BLOCK_DOC_COMMENT); return NimTypes.COMMENT; }
    {KEYWORD}                   { return NimTypes.KEYWORD; }
    \"\"\"                      { yypushState(LITERAL_STRING_TRIPLE); return NimTypes.LITERAL_STRING; }
    r\"                         { yypushState(LITERAL_STRING_RAW); return NimTypes.LITERAL_STRING; }
    \"                          { yypushState(LITERAL_STRING); return NimTypes.LITERAL_STRING; }
    {LETTER}+                   { return TokenType.WHITE_SPACE; }
    .                           { return TokenType.WHITE_SPACE; }
}

<LINE_COMMENT> {
    {CRLF}+                     { yypopState(); return NimTypes.COMMENT; }
    .                           { return NimTypes.COMMENT; }
}

<BLOCK_COMMENT> {
    {BLOCK_COMMENT}             { level++; yypushState(BLOCK_COMMENT); return NimTypes.COMMENT; }
    \]#                         { if (--level == 0) yypopState(); return NimTypes.COMMENT; }
    {CRLF}+                     { return NimTypes.COMMENT; }
    .                           { return NimTypes.COMMENT; }
}

<BLOCK_DOC_COMMENT> {
    {BLOCK_DOC_COMMENT}         { level++; yypushState(BLOCK_DOC_COMMENT); return NimTypes.COMMENT; }
    \]##                        { if (--level == 0) yypopState(); return NimTypes.COMMENT; }
    {CRLF}+                     { return NimTypes.COMMENT; }
    .                           { return NimTypes.COMMENT; }
}

<LITERAL_STRING> {
    \\\"                        { return NimTypes.LITERAL_STRING; }
    \"                          { yypopState(); return NimTypes.LITERAL_STRING; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { return NimTypes.LITERAL_STRING; }
}

<LITERAL_STRING_TRIPLE> {
    \"\"\"                      { yypopState(); return NimTypes.LITERAL_STRING; }
    {CRLF}                      { return NimTypes.LITERAL_STRING; }
    .                           { return NimTypes.LITERAL_STRING; }
}

<LITERAL_STRING_RAW> {
    \"                          { yypopState(); return NimTypes.LITERAL_STRING; }
    {CRLF}                      { return NimTypes.LITERAL_STRING; }
    .                           { return NimTypes.LITERAL_STRING; }
}

//<STATEMENT> {
//
//}
