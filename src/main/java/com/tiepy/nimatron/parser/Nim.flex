/*
 * This file is based on example provided by the IntelliJ Platform SDK DevGuide.
 * Copyright 2000-2020 JetBrains s.r.o. and other contributors.
 * Use of original example source code is governed by the Apache 2.0 license.
 *
 * Copyright 2020 TiePy Ltd. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This file is part of Nimatron, a Nim plug-in for IDEA platform IDEs.
 *
 * Nimatron is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.  TiePy Ltd designates this
 * particular file as subject to the "Classpath" exception as provided
 * by TiePy Ltd in the LICENSE file that accompanied this code.
 *
 * Nimatron is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Nimatron.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Please contact TiePy Ltd, 19 Lyall Way, Laurencekirk, AB30 1FU, UK
 * or visit www.tiepy.com if you need additional information or have any
 * questions.
 */

package com.tiepy.nimatron.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.tiepy.nimatron.parser.NimTypes;
import java.util.Stack;

%%

%class NimLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

OP0=->|~>|=>
OP1=\+=|\*=|-=|\/\*
OP2=@|:|\?
OP3=or|xor
OP4=and
OP5===|<=|<|>=|>|\!=|in|notin|is|isnot|not|of|as
OP6=\.\.
OP7=&
OP8=\+|-
OP9=\*|\/|div|mod|shl|shr|%
OP10=\$|\^

DIGIT=[0-9]
ALPHA=[A-Za-z\u0080-\u00ff]
IDENT={ALPHA}(_|{ALPHA}|{DIGIT})*

BLOCK_COMMENT_BEGIN=#\[
BLOCK_COMMENT_END=\]#
BLOCK_DOC_COMMENT_BEGIN=##\[
BLOCK_DOC_COMMENT_END=\]##

CRLF=\n|\r|\r\n
WHITE_SPACE=[\ \t\f]

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
BOOLEAN_CONSTANT=true|false

BRACKET=[\{\}\[\]]|(\[\.)|(\.\])|(\{\.)|(\.\})|(\[:)
PARENTHESIS=[\(\)]|(\(\.)|(\.\))

C_SEMICOLON=;
C_COMMA=,
C_GRAVE_ACCENT=`

KEYW=addr|asm|bind|block|break|case|cast|concept|const|continue|converter|defer|discard|distinct|div|do|elif
|else|end|enum|except|export|finally|for|from|func|if|import|include|interface|iterator|let|macro|method
|mixin|mod|nil|object|out|proc|ptr|raise|ref|return|shl|shr|static|template|try|tuple|type|using|var
|when|while|yield

%{

private Stack<Integer> stateStack = new Stack<Integer>();

private int pushState(int newState) {
    stateStack.push(yystate());
    yybegin(newState);
    return stateStack.size();
}

private int popState() {
    yybegin(stateStack.pop());
    return stateStack.size();
}

private int lastIndentSpaces = 0;
private int indentSpaces = 0;

private void handleIndent() {
    lastIndentSpaces = indentSpaces;
    indentSpaces = 0;
    pushState(INDENTER);
}

%}

%state YYINITIAL
%state INDENTER
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
    {CRLF}                      { handleIndent(); }
    {WHITE_SPACE}+              { return TokenType.WHITE_SPACE; }
    #                           { pushState(LINE_COMMENT); }
    {BLOCK_COMMENT_BEGIN}       { pushState(BLOCK_COMMENT); }
    {BLOCK_DOC_COMMENT_BEGIN}   { pushState(BLOCK_DOC_COMMENT); }
    {KEYW}                      { return NimTypes.KEYW; }
    r\"                         { pushState(RAW_STRING_LITERAL); }
    \"\"\"                      { pushState(TRIPLE_STRING_LITERAL); }
    \"                          { pushState(STRING_LITERAL); }
    {IDENT}\"                   { pushState(GENERALIZED_STRING_LITERAL); }
    {IDENT}\"\"\"               { pushState(GENERALIZED_TRIPLE_STRING_LITERAL); }
    '                           { pushState(CHARACTER_LITERAL); }
    {NUMERICAL_CONSTANT}        { return NimTypes.NUMERICAL_CONSTANT; }
    {BOOLEAN_CONSTANT}          { return NimTypes.NUMERICAL_CONSTANT; }
    {OP0}                       { return NimTypes.OP0; }
    {OP1}                       { return NimTypes.OP1; }
    {OP2}                       { return NimTypes.OP2; }
    {OP3}                       { return NimTypes.OP3; }
    {OP4}                       { return NimTypes.OP4; }
    {OP5}                       { return NimTypes.OP5; }
    {OP6}                       { return NimTypes.OP6; }
    {OP7}                       { return NimTypes.OP7; }
    {OP8}                       { return NimTypes.OP8; }
    {OP9}                       { return NimTypes.OP9; }
    {OP10}                      { return NimTypes.OP10; }
    {BRACKET}                   { return NimTypes.BRACKET; }
    {PARENTHESIS}               { return NimTypes.PARENTHESIS; }
    {C_SEMICOLON}               { return NimTypes.C_SEMICOLON; }
    {C_COMMA}                   { return NimTypes.C_COMMA; }
    {C_GRAVE_ACCENT}            { return NimTypes.C_GRAVE_ACCENT; }
    {IDENT}+                    { return NimTypes.IDENT; }
    {ALPHA}+                    { return NimTypes.FRAGMENT; }
    .                           { return NimTypes.FRAGMENT; }
}

<INDENTER> {
    {CRLF}                      { indentSpaces = 0; }
    \                           { indentSpaces++; }
    .                           {
        yypushback(1);
        popState();

        if (indentSpaces == lastIndentSpaces) {
            return NimTypes.IND_EQ;
        } else if (indentSpaces > lastIndentSpaces) {
            return NimTypes.IND_GT;
        } else {
            return NimTypes.IND_LT;
        }
    }
}

<LINE_COMMENT> {
    .+                          { popState(); return NimTypes.COMMENT; }
}

<BLOCK_COMMENT> {
    {BLOCK_COMMENT_BEGIN}       { pushState(BLOCK_COMMENT); }
    {BLOCK_COMMENT_END}         { if (popState() == 0) return NimTypes.COMMENT; }
    {CRLF}                      { }
    .                           { }
}

<BLOCK_DOC_COMMENT> {
    {BLOCK_DOC_COMMENT_BEGIN}   { pushState(BLOCK_DOC_COMMENT); }
    {BLOCK_DOC_COMMENT_END}     { if (popState() == 0) return NimTypes.COMMENT; }
    {CRLF}                      { }
    .                           { }
}

<STRING_LITERAL> {
    \\\"                        { }
    \"                          { popState(); return NimTypes.STRING_LITERAL; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { }
}

<TRIPLE_STRING_LITERAL> {
    \"\"\"                      { popState(); return NimTypes.STRING_LITERAL; }
    {CRLF}                      { }
    .                           { }
}

<RAW_STRING_LITERAL> {
    \"\"                        { }
    \"                          { popState(); return NimTypes.STRING_LITERAL; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { }
}

<GENERALIZED_STRING_LITERAL> {
    \"\"                        { }
    \"                          { popState(); return NimTypes.STRING_LITERAL; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { }
}

<GENERALIZED_TRIPLE_STRING_LITERAL> {
    \"\"\"                      { popState(); return NimTypes.STRING_LITERAL; }
    {CRLF}                      { }
    .                           { }
}

<CHARACTER_LITERAL> {
    '                           { popState(); return NimTypes.STRING_LITERAL; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { }
}
