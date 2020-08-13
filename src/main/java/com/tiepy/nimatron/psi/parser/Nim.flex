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

package com.tiepy.nimatron.psi.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.tiepy.nimatron.psi.NimElementTypes;
import java.util.Stack;

%%

%class NimLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

OP0A=->
OP0B=\~>
OP0C==>
//OP0={OP0A}|{OP0B}|{OP0C}

OP1A=\+=
OP1B=\*=
OP1C=-=
OP1D=\/\*
//OP1={OP1A}|{OP1B}|{OP1C}|{OP1D}

OP2A=@
OP2B=:
OP2C=\?
//OP2={OP2A}|{OP2B}|{OP2C}

OP3A=or
OP3B=xor
//OP3={OP3A}|{OP3B}

OP4A=and
//OP4={OP4A}

OP5A===
OP5B=<=
OP5C=<
OP5D=>=
OP5E=>
OP5F=\!=
OP5G=in
OP5H=notin
OP5I=is
OP5J=isnot
OP5K=not
OP5L=of
OP5M=as
//OP5={OP5A}|{OP5B}|{OP5C}|{OP5D}|{OP5E}|{OP5F}|{OP5G}|{OP5H}|{OP5I}|{OP5J}|{OP5K}|{OP5L}|{OP5M}

OP6A=\.\.
//OP6={OP6A}

OP7A=&
//OP7={OP7A}

OP8A=\+
OP8B=-
//OP8={OP8A}|{OP8B}

OP9A=\*
OP9B=\/
OP9C=div
OP9D=mod
OP9E=shl
OP9F=shr
OP9G=%
//OP9={OP9A}|{OP9B}|{OP9C}|{OP9D}|{OP9E}|{OP9F}|{OP9G}

OP10A=\$
OP10B=\^
//OP10={OP10A}|{OP10B}

OPR=[\=\+\-\*/<>@$~&%\|\!\?\^\.\:\\]+

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
FLOAT32_SUFFIX=(f|F)(32)?
FLOAT64_SUFFIX=(f|F)64
FLOAT32_LIT=({HEX_LIT}'{FLOAT32_SUFFIX})|(({FLOAT_LIT}|{DEC_LIT}|{OCT_LIT}|{BIN_LIT})'?{FLOAT32_SUFFIX})
FLOAT64_LIT=({HEX_LIT}'{FLOAT64_SUFFIX})|(({FLOAT_LIT}|{DEC_LIT}|{OCT_LIT}|{BIN_LIT})'?{FLOAT64_SUFFIX})

BOOL_LIT=true|false

NIL=nil

BRACKET=\{|\}|\[|\]|(\[\.)|(\.\])|(\{\.)|(\.\})|(\[:)|(\(\.)|(\.\))
PARENTHESIS=\(|\)

C_SEMICOLON=;
C_COMMA=,
C_GRAVE_ACCENT=`

KEYW=addr|asm|bind|block|break|case|cast|concept|const|continue|converter|defer|discard|distinct|do|elif
|else|end|enum|except|export|finally|for|from|func|if|import|include|interface|iterator|let|macro|method
|mixin|object|out|proc|ptr|raise|ref|return|static|template|try|tuple|type|using|var|when|while|yield

%{

// -----------------------------------------------------------------------------
// State stack
// -----------------------------------------------------------------------------

private final Stack<Integer> stateStack = new Stack<Integer>();

/**
 * Pushes new state onto stack and sets parser to begin new state.
 * @param newState New parser state.
 * @return New stack size.
 */
private int pushState(int newState) {
    stateStack.push(yystate());
    yybegin(newState);
    return stateStack.size();
}

/**
 * Pops previous state from stack.
 * @return Previous state.
 */
private int popState() {
    yybegin(stateStack.pop());
    return stateStack.size();
}

// -----------------------------------------------------------------------------
// Indent spaces handler
// -----------------------------------------------------------------------------

private int lastIndentSpaces = 0;
private int indentSpaces = 0;

/**
 * Records last indent spaces and pushes the INDENTER state onto stack.
 */
private void handleIndent() {
    lastIndentSpaces = indentSpaces;
    indentSpaces = 0;
    pushState(INDENTER);
}

// -----------------------------------------------------------------------------
// Stack indenter
// -----------------------------------------------------------------------------

/**
 * Stores column number and increment for each indentation level.
 * This is required as it's not certain each indent is same size.
 */
private class Indent {
    public int Column;
    public int Increment;
}

private final Stack<Indent> indentStack = new Stack<Indent>();
private final Stack<IElementType> dedentStack = new Stack<IElementType>();

/**
 * This method is used to return multiple tokens by stalling the return state transition.
 * @return Next token to be returned to parser.
 */
private IElementType getIndenterToken() {

    // Return from INDENTER state with indent at same level, when length same.
    if (indentSpaces == lastIndentSpaces) {
        popState();
        return NimElementTypes.IND_EQ;
    }

    // Return from INDENTER state with indent at higher level, when length greater.
    if (indentSpaces > lastIndentSpaces) {

        // Length of last indent on stack, if any.
        int lastLength = 0;
        if (indentStack.size() > 0) lastLength = indentStack.peek().Column;

        // Push an entry onto the indenter stack.
        // Note the incremental column positions for indentation.
        Indent indent = new Indent();
        indent.Column = indentSpaces;
        indent.Increment = indentSpaces - lastLength;
        indentStack.push(indent);

        popState();
        return NimElementTypes.INDENT;
    }

    // Handle dedents.
    // Following is where indentSpaces < lastIndentSpaces.

    // Determine difference with previous indentation level.
    Indent lastIndent = indentStack.pop();
    int diff = lastIndent.Column - indentSpaces;

    // Handle error case where dedent is smaller than last indent.
    if (diff < lastIndent.Increment) {
        return TokenType.BAD_CHARACTER;
    }

    dedentStack.push(NimElementTypes.IND_EQ);

    // Add required dedents to stack to be returned.
    while (diff > lastIndent.Increment) {

        // Determine difference with previous indentation level.
        lastIndent = indentStack.pop();
        diff = lastIndent.Column - indentSpaces;

        // Handle error case where dedent is smaller than last indent.
        if (diff < lastIndent.Increment) {
            return TokenType.BAD_CHARACTER;
        }

        dedentStack.push(NimElementTypes.DEDENT);
    }

    lastIndentSpaces = lastIndent.Column;

    popState();
    pushState(DEDENTER);
    return NimElementTypes.DEDENT;
}

private IElementType getDedenterToken() {
    IElementType token = dedentStack.pop();
    if (dedentStack.size() == 0) popState();
    return token;
}

%}

%state YYINITIAL
%state INDENTER
%state DEDENTER
%state LINE_COMMENT
%state BLOCK_COMMENT
%state BLOCK_DOC_COMMENT
%state DISCARD_COMMENT
%state STRING_LITERAL
%state TRIPLE_STRING_LITERAL
%state RAW_STRING_LITERAL
%state GENERALIZED_STRING_LITERAL
%state GENERALIZED_TRIPLE_STRING_LITERAL
%state CHARACTER_LITERAL

%%

<YYINITIAL> {
    {CRLF}                      { handleIndent(); return TokenType.WHITE_SPACE; }
    {WHITE_SPACE}+              { return TokenType.WHITE_SPACE; }
    #                           { pushState(LINE_COMMENT); }
    {BLOCK_COMMENT_BEGIN}       { pushState(BLOCK_COMMENT); }
    {BLOCK_DOC_COMMENT_BEGIN}   { pushState(BLOCK_DOC_COMMENT); }
    discard\ \"\"\"             { pushState(DISCARD_COMMENT); }
    {KEYW}                      { return NimElementTypes.KEYW; }
    r\"                         { pushState(RAW_STRING_LITERAL); }
    \"\"\"                      { pushState(TRIPLE_STRING_LITERAL); }
    \"                          { pushState(STRING_LITERAL); }
    '                           { pushState(CHARACTER_LITERAL); }
    {INT_LIT}                   { return NimElementTypes.INT_LIT; }
    {INT8_LIT}                  { return NimElementTypes.INT8_LIT; }
    {INT16_LIT}                 { return NimElementTypes.INT16_LIT; }
    {INT32_LIT}                 { return NimElementTypes.INT32_LIT; }
    {INT64_LIT}                 { return NimElementTypes.INT64_LIT; }
    {UINT_LIT}                  { return NimElementTypes.UINT_LIT; }
    {UINT8_LIT}                 { return NimElementTypes.UINT8_LIT; }
    {UINT16_LIT}                { return NimElementTypes.UINT16_LIT; }
    {UINT32_LIT}                { return NimElementTypes.UINT32_LIT; }
    {UINT64_LIT}                { return NimElementTypes.UINT64_LIT; }
    {FLOAT_LIT}                 { return NimElementTypes.FLOAT_LIT; }
    {FLOAT32_LIT}               { return NimElementTypes.FLOAT32_LIT; }
    {FLOAT64_LIT}               { return NimElementTypes.FLOAT64_LIT; }
    {NIL}                       { return NimElementTypes.NIL; }
    {BOOL_LIT}                  { return NimElementTypes.BOOL_LIT; }
    {OP0A}                      { return NimElementTypes.OP0A; }
    {OP0B}                      { return NimElementTypes.OP0B; }
    {OP0C}                      { return NimElementTypes.OP0C; }
    {OP1A}                      { return NimElementTypes.OP1A; }
    {OP1B}                      { return NimElementTypes.OP1B; }
    {OP1C}                      { return NimElementTypes.OP1C; }
    {OP1D}                      { return NimElementTypes.OP1D; }
    {OP2A}                      { return NimElementTypes.OP2A; }
    {OP2B}                      { return NimElementTypes.OP2B; }
    {OP2C}                      { return NimElementTypes.OP2C; }
    {OP3A}                      { return NimElementTypes.OP3A; }
    {OP3B}                      { return NimElementTypes.OP3B; }
    {OP4A}                      { return NimElementTypes.OP4A; }
    {OP5A}                      { return NimElementTypes.OP5A; }
    {OP5B}                      { return NimElementTypes.OP5B; }
    {OP5C}                      { return NimElementTypes.OP5C; }
    {OP5D}                      { return NimElementTypes.OP5D; }
    {OP5E}                      { return NimElementTypes.OP5E; }
    {OP5F}                      { return NimElementTypes.OP5F; }
    {OP5G}                      { return NimElementTypes.OP5G; }
    {OP5H}                      { return NimElementTypes.OP5H; }
    {OP5I}                      { return NimElementTypes.OP5I; }
    {OP5J}                      { return NimElementTypes.OP5J; }
    {OP5K}                      { return NimElementTypes.OP5K; }
    {OP5L}                      { return NimElementTypes.OP5L; }
    {OP5M}                      { return NimElementTypes.OP5M; }
    {OP6A}                      { return NimElementTypes.OP6A; }
    {OP7A}                      { return NimElementTypes.OP7A; }
    {OP8A}                      { return NimElementTypes.OP8A; }
    {OP8B}                      { return NimElementTypes.OP8B; }
    {OP9A}                      { return NimElementTypes.OP9A; }
    {OP9B}                      { return NimElementTypes.OP9B; }
    {OP9C}                      { return NimElementTypes.OP9C; }
    {OP9D}                      { return NimElementTypes.OP9D; }
    {OP9E}                      { return NimElementTypes.OP9E; }
    {OP9F}                      { return NimElementTypes.OP9F; }
    {OP9G}                      { return NimElementTypes.OP9G; }
    {OP10A}                     { return NimElementTypes.OP10A; }
    {OP10B}                     { return NimElementTypes.OP10B; }
    {OPR}                       { return NimElementTypes.OPR; }
    {IDENT}                     { return NimElementTypes.IDENT; }
    {IDENT}\"                   { pushState(GENERALIZED_STRING_LITERAL); }
    {IDENT}\"\"\"               { pushState(GENERALIZED_TRIPLE_STRING_LITERAL); }
    {BRACKET}                   { return NimElementTypes.BRACKET; }
    {PARENTHESIS}               { return NimElementTypes.PARENTHESIS; }
    {C_SEMICOLON}               { return NimElementTypes.C_SEMICOLON; }
    {C_COMMA}                   { return NimElementTypes.C_COMMA; }
    {C_GRAVE_ACCENT}            { return NimElementTypes.C_GRAVE_ACCENT; }
    .                           { return TokenType.BAD_CHARACTER; }
}

<INDENTER> {
    {CRLF}                      { indentSpaces = 0; }
    \                           { indentSpaces++; }
    .                           { yypushback(1); return getIndenterToken(); }
}

<DEDENTER> {
    .                           { yypushback(1); return getDedenterToken(); }
}

<LINE_COMMENT> {
    .+                          { popState(); return NimElementTypes.COMMENT; }
    {CRLF}                      { popState(); return NimElementTypes.COMMENT; }
}

<BLOCK_COMMENT> {
    {BLOCK_COMMENT_BEGIN}       { pushState(BLOCK_COMMENT); }
    {BLOCK_COMMENT_END}         { if (popState() == 0) return NimElementTypes.COMMENT; }
    {CRLF}                      { }
    .                           { }
}

<BLOCK_DOC_COMMENT> {
    {BLOCK_DOC_COMMENT_BEGIN}   { pushState(BLOCK_DOC_COMMENT); }
    {BLOCK_DOC_COMMENT_END}     { if (popState() == 0) return NimElementTypes.COMMENT; }
    {CRLF}                      { }
    .                           { }
}

<DISCARD_COMMENT> {
    \"\"\"                      { if (popState() == 0) return NimElementTypes.COMMENT; }
    {CRLF}                      { }
    .                           { }
}

<STRING_LITERAL> {
    \\\"                        { }
    \"                          { popState(); return NimElementTypes.STR_LIT; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { }
}

<TRIPLE_STRING_LITERAL> {
    \"\"\"                      { popState(); return NimElementTypes.TRIPLESTR_LIT; }
    {CRLF}                      { }
    .                           { }
}

<RAW_STRING_LITERAL> {
    \"\"                        { }
    \"                          { popState(); return NimElementTypes.RSTR_LIT; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { }
}

<GENERALIZED_STRING_LITERAL> {
    \"\"                        { }
    \"                          { popState(); return NimElementTypes.GENERALIZED_STR_LIT; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { }
}

<GENERALIZED_TRIPLE_STRING_LITERAL> {
    \"\"\"                      { popState(); return NimElementTypes.GENERALIZED_TRIPLESTR_LIT; }
    {CRLF}                      { }
    .                           { }
}

<CHARACTER_LITERAL> {
    '                           { popState(); return NimElementTypes.CHAR_LIT; }
    {CRLF}                      { return TokenType.BAD_CHARACTER; }
    .                           { }
}
