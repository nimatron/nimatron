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
END_OF_LINE_COMMENT="#"[^\r\n]*
KEYWORD="echo"

%state YYINITIAL

%%

<YYINITIAL> {
    {END_OF_LINE_COMMENT} { return NimTypes.COMMENT; }
    {KEYWORD}             { return NimTypes.KEYWORD; }
    {CRLF}+               { return TokenType.WHITE_SPACE; }
    {WHITE_SPACE}+        { return TokenType.WHITE_SPACE; }
    .                     { return TokenType.WHITE_SPACE; }
}
