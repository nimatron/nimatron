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

KEYWORD="echo"

%state YYINITIAL

%%

<YYINITIAL> {
    {KEYWORD}             { return NimTypes.KEYWORD; }
    .                     { return TokenType.WHITE_SPACE; }
}
