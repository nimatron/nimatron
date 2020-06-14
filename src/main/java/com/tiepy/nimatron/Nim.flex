package com.tiepy.nimatron;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.tiepy.nimatron.psi.NimTypes;

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
NOT_LETTER=[^A-Za-z\u0080-\u00ff]
//IDENTIFIER={LETTER} (['_'] ({LETTER}|{DIGIT}))*
KEYWORD=addr|and|as|asm|bind|block|break|case|cast|concept|const|continue|converter|defer|discard|distinct|div|do|elif
|else|end|enum|except|export|finally|for|from|func|if|import|in|include|interface|is|isnot|iterator|let|macro|method
|mixin|mod|nil|not|notin|object|of|or|out|proc|ptr|raise|ref|return|shl|shr|static|template|try|tuple|type|using|var
|when|while|xor|yield

%{
int level = 0; // Level counter for nested comment blocks.
boolean letter = false; // True if letters were last thing read. False otherwise.
%}

%state YYINITIAL
%state LINE_COMMENT
%state BLOCK_COMMENT
%state BLOCK_DOC_COMMENT
%state LITERAL_STRING

%%

<YYINITIAL> {
    {CRLF}+                     { letter = false; return TokenType.WHITE_SPACE; }
    {WHITE_SPACE}+              { letter = false; return TokenType.WHITE_SPACE; }
    #                           { letter = false; yybegin(LINE_COMMENT); return NimTypes.COMMENT; }
    {BLOCK_COMMENT}             { letter = false; level = 1; yybegin(BLOCK_COMMENT); return NimTypes.COMMENT; }
    {BLOCK_DOC_COMMENT}         { letter = false; level = 1; yybegin(BLOCK_DOC_COMMENT); return NimTypes.COMMENT; }
    {KEYWORD}/{NOT_LETTER}      { if (letter) { letter = false; return TokenType.WHITE_SPACE; } else { letter = false; return NimTypes.KEYWORD; } }
    \"                          { letter = false; yybegin(LITERAL_STRING); return NimTypes.LITERAL_STRING; }
    {LETTER}                    { letter = true; return TokenType.WHITE_SPACE; }
    .                           { letter = false; return TokenType.WHITE_SPACE; }
}

<LINE_COMMENT> {
    {CRLF}+                     { yybegin(YYINITIAL); return NimTypes.COMMENT; }
    .                           { return NimTypes.COMMENT; }
}

<BLOCK_COMMENT> {
    {BLOCK_COMMENT}             { level++; yybegin(BLOCK_COMMENT); return NimTypes.COMMENT; }
    \]#                         { if (--level == 0) yybegin(YYINITIAL); return NimTypes.COMMENT; }
    {CRLF}+                     { return NimTypes.COMMENT; }
    .                           { return NimTypes.COMMENT; }
}

<BLOCK_DOC_COMMENT> {
    {BLOCK_DOC_COMMENT}         { level++; yybegin(BLOCK_DOC_COMMENT); return NimTypes.COMMENT; }
    \]##                        { if (--level == 0) yybegin(YYINITIAL); return NimTypes.COMMENT; }
    {CRLF}+                     { return NimTypes.COMMENT; }
    .                           { return NimTypes.COMMENT; }
}

<LITERAL_STRING> {
    \\\"                        { return NimTypes.LITERAL_STRING; }
    \"                          { yybegin(YYINITIAL); return NimTypes.LITERAL_STRING; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { return NimTypes.LITERAL_STRING; }
}
