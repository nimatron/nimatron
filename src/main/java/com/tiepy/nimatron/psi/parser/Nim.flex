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
import com.tiepy.nimatron.psi.NimElementType;import com.tiepy.nimatron.psi.NimElementTypes;
import java.util.Stack;

%%

%class NimLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

OPR_EQUALS==
OPR_PLUS=\+
OPR_MINUS=-
OPR_STAR=\*
OPR_FWD_SLASH=\/
OPR_ANGLE_BACK=<
OPR_ANGLE_FWD=>
OPR_AT=@
OPR_DOLLAR=\$
OPR_TILDA=\~
OPR_AMP=&
OPR_PERCENT=%
OPR_PIPE=\|
OPR_EXCLAIM=\!
OPR_QUESTION=\?
OPR_CARET=\^
OPR_DOT=\.
OPR_COLON=:
OPR_BACK_SLASH=\\
OPR_CHARS={OPR_EQUALS}|{OPR_PLUS}|{OPR_MINUS}|{OPR_STAR}|{OPR_FWD_SLASH}|{OPR_ANGLE_BACK}
|{OPR_ANGLE_FWD}|{OPR_AT}|{OPR_DOLLAR}|{OPR_TILDA}|{OPR_AMP}|{OPR_PERCENT}
|{OPR_PIPE}|{OPR_EXCLAIM}|{OPR_QUESTION}|{OPR_CARET}|{OPR_DOT}|{OPR_COLON}
|{OPR_BACK_SLASH}

DIGIT=[0-9]
ALPHA=[A-Za-z\u0080-\u00ff]
IDENT={ALPHA}(_|{ALPHA}|{DIGIT})*

BLOCK_COMMENT_BEGIN=#\[
BLOCK_COMMENT_END=\]#
BLOCK_DOC_COMMENT_BEGIN=##\[
BLOCK_DOC_COMMENT_END=\]##

CR=\r
LF=\n
CRLF={CR}{LF}
NEWLINE={CRLF}|{CR}|{LF}

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
FLOAT64_SUFFIX=((f|F)64)|d|D
FLOAT32_LIT=({HEX_LIT}'{FLOAT32_SUFFIX})|(({FLOAT_LIT}|{DEC_LIT}|{OCT_LIT}|{BIN_LIT})'?{FLOAT32_SUFFIX})
FLOAT64_LIT=({HEX_LIT}'{FLOAT64_SUFFIX})|(({FLOAT_LIT}|{DEC_LIT}|{OCT_LIT}|{BIN_LIT})'?{FLOAT64_SUFFIX})

NUM_LIT={INT_LIT}|{INT8_LIT}|{INT16_LIT}|{INT32_LIT}|{INT64_LIT}
|{UINT_LIT}|{UINT8_LIT}|{UINT16_LIT}|{UINT32_LIT}|{UINT64_LIT}
|{FLOAT_LIT}|{FLOAT32_LIT}|{FLOAT64_LIT}

BOOL_LIT=true|false

OPEN_BRACKET =\{|\[|(\[\.)|(\{\.)|(\(\.)|(\[:)
CLOSE_BRACKET=\}|\]|(\.\])|(\.\})|(\.\))

OPEN_PARENTHESIS=\(
CLOSE_PARENTHESIS=\)

SEMICOLON=;
COMMA=,
GRAVE_ACCENT=`

KEYW=addr|and|as|asm|bind|block|break|case|cast|concept|const|continue
|converter|defer|discard|distinct|div|do|elif|else|end|enum|except|export
|finally|for|from|func|if|import|in|include|interface|is|isnot|iterator|let
|macro|method|mixin|mod|nil|not|notin|object|of|or|out|proc|ptr|raise|ref
|return|shl|shr|static|template|try|tuple|type|using|var|when|while|xor|yield

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

private boolean isIndentSuspended = false;

private void suspendIndent() {
    isIndentSuspended = true;
}

private void resumeIndent() {
    isIndentSuspended = false;
}

private int lastIndentSpaces = 0;
private int indentSpaces = 0;

/**
 * Records last indent spaces and pushes the INDENTER state onto stack.
 */
private void handleIndent() {
    if (!isIndentSuspended) {
        lastIndentSpaces = indentSpaces;
        indentSpaces = 0;
        pushState(INDENTER);
    }
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
        if (indentSpaces == 0) {
            return NimElementTypes.IND_EQ0;
        } else {
            return NimElementTypes.IND_EQX;
        }
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

    if (indentSpaces == 0) {
        dedentStack.push(NimElementTypes.IND_EQ0);
    } else {
        dedentStack.push(NimElementTypes.IND_EQX);
    }

    // Add required dedents to stack to be returned.
    while (diff > lastIndent.Increment) {

        // Determine difference with previous indentation level.
        lastIndent = indentStack.pop();
        diff = lastIndent.Column - indentSpaces;

        if (indentSpaces == 0) {
            dedentStack.push(NimElementTypes.DEDENT0);
        } else {
            dedentStack.push(NimElementTypes.DEDENTX);
        }
    }

    lastIndentSpaces = lastIndent.Column;

    popState();
    pushState(DEDENTER);

    if (indentSpaces == 0) {
        return NimElementTypes.DEDENT0;
    } else {
        return NimElementTypes.DEDENTX;
    }
}

private IElementType getDedenterToken() {
    IElementType token = dedentStack.pop();
    if (dedentStack.size() == 0) popState();
    return token;
}

// -----------------------------------------------------------------------------
// Operator test
// -----------------------------------------------------------------------------

private final StringBuffer buffer = new StringBuffer();

private IElementType getOperatorToken(boolean isSpecialCase, int pushbackLength) {
    popState();

    if (isSpecialCase) {
        if (buffer.length() > 0) {
            // NOTE: Not special case.
            buffer.append("*:");
            yypushback(pushbackLength);
        } else {
            // NOTE: This is the special case. We want two tokens from "*:"
            // and here we return the first token.
            yypushback(pushbackLength + 1); // Pushes the ':' char back for next token to be generated.
            return NimElementTypes.OP9;
        }
    } else {
        yypushback(pushbackLength);
    }

    assert buffer.length() > 0;
    String s = buffer.toString();
    int len = s.length();

    // NOTE: The following from the Nim Manual, section on Operators.
    // . =, :, :: are not available as general operators; they are used for other notational purposes.
    if (s.equals(":")) {
        isIndentSuspended = false;
        return NimElementTypes.NOTATION;
    }

    if (s.equals(".") || s.equals("=") || s.equals("::")) {
        return NimElementTypes.NOTATION;
    }

    if (s.equals("->") || s.equals("=>") || s.equals("~>")) {
        return NimElementTypes.OP0;
    }

    if (s.equals("+=") || s.equals("*=") || s.equals("-=") || s.equals("/=")) {
        return NimElementTypes.OP1;
    }

    if (false && len > 1) {
        if (s.startsWith("@") || s.startsWith(":") || s.startsWith("?")) {
            return NimElementTypes.OP2;
        }
    }

    if (s.equals("==") ||
        s.equals("<=") ||
        s.equals("<") ||
        s.equals(">=") ||
        s.equals(">") ||
        s.equals("!=")) {
        return NimElementTypes.OP5;
    }

    if (false && len > 1) {
        if (s.startsWith("=") ||
            s.startsWith("<") ||
            s.startsWith(">") ||
            s.startsWith("!")) {
            return NimElementTypes.OP5;
        }
    }

    if (s.equals("..")) {
        return NimElementTypes.OP6;
    }

    if (true || len > 1) {
        if (s.startsWith(".")) {
            return NimElementTypes.OP6;
        }
    }

    if (true || len > 1) {
        if (s.startsWith("&")) {
            return NimElementTypes.OP7;
        }
    }

    if (s.equals("+") ||
        s.equals("-")) {
        return NimElementTypes.OP8;
    }

    if (true || len > 1) {
        if (s.startsWith("+") ||
            s.startsWith("-") ||
            s.startsWith("~") ||
            s.startsWith("|")) {
            return NimElementTypes.OP8;
        }
    }

    if (s.equals("*") ||
        s.equals("/") ||
        s.equals("%")) {
        return NimElementTypes.OP9;
    }

    if (true || len > 1) {
        if (s.startsWith("*") ||
            s.startsWith("%") ||
            s.startsWith("\\") ||
            s.startsWith("/")) {
            return NimElementTypes.OP9;
        }
    }

    if (true || len > 1) {
        if (s.startsWith("$") || s.startsWith("^")) {
            return NimElementTypes.OP10;
        }
    }

    return NimElementTypes.OPR;
}

%}

%state YYINITIAL
%state INDENTER
%state DEDENTER
%state OPERATOR
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
    {BLOCK_COMMENT_BEGIN}           { pushState(BLOCK_COMMENT); }
    {BLOCK_DOC_COMMENT_BEGIN}       { pushState(BLOCK_DOC_COMMENT); }
    #                               { pushState(LINE_COMMENT); }
    discard\ \"\"\"                 { pushState(DISCARD_COMMENT); }
    {NEWLINE}                       { handleIndent(); return TokenType.WHITE_SPACE; }
    {WHITE_SPACE}+                  { return TokenType.WHITE_SPACE; }
    if                              { suspendIndent(); return NimElementTypes.KEYW; }
    {KEYW}                          { return NimElementTypes.KEYW; }
    r\"                             { pushState(RAW_STRING_LITERAL); }
    \"\"\"                          { pushState(TRIPLE_STRING_LITERAL); }
    \"                              { pushState(STRING_LITERAL); }
    '                               { pushState(CHARACTER_LITERAL); }
    {NUM_LIT}                       { return NimElementTypes.NUM_LIT; }
    {BOOL_LIT}                      { return NimElementTypes.BOOL_LIT; }
    {OPR_CHARS}                     { yypushback(1); buffer.setLength(0); pushState(OPERATOR); }
    {IDENT}\"\"\"                   { pushState(GENERALIZED_TRIPLE_STRING_LITERAL); }
    {IDENT}\"                       { pushState(GENERALIZED_STRING_LITERAL); }
    {IDENT}                         { return NimElementTypes.IDENT; }
    {OPEN_BRACKET}                  { suspendIndent(); return NimElementTypes.NOTATION; }
    {CLOSE_BRACKET}                 { resumeIndent(); return NimElementTypes.NOTATION; }
    {OPEN_PARENTHESIS}              { suspendIndent(); return NimElementTypes.NOTATION; }
    {CLOSE_PARENTHESIS}             { resumeIndent(); return NimElementTypes.NOTATION; }
    {SEMICOLON}                     { return NimElementTypes.NOTATION; }
    {COMMA}                         { return NimElementTypes.NOTATION; }
    {GRAVE_ACCENT}                  { return NimElementTypes.NOTATION; }
    .                               { return TokenType.BAD_CHARACTER; }
}

<INDENTER> {
    {NEWLINE}                       { indentSpaces = 0; }
    \                               { indentSpaces++; }
    .                               { yypushback(1); return getIndenterToken(); }
}

<DEDENTER> {
    .                               { yypushback(1); return getDedenterToken(); }
}

<OPERATOR> {
    \*:({CRLF})                     { return getOperatorToken(true, 2); }
    \*:({CR}|{LF}|.)                { return getOperatorToken(true, 1); }
    {OPR_EQUALS}                    { buffer.append('='); }
    {OPR_PLUS}                      { buffer.append('+'); }
    {OPR_MINUS}                     { buffer.append('-'); }
    {OPR_STAR}                      { buffer.append('*'); }
    {OPR_FWD_SLASH}                 { buffer.append('/'); }
    {OPR_ANGLE_BACK}                { buffer.append('<'); }
    {OPR_ANGLE_FWD}                 { buffer.append('>'); }
    {OPR_AT}                        { buffer.append('@'); }
    {OPR_DOLLAR}                    { buffer.append('$'); }
    {OPR_TILDA}                     { buffer.append('~'); }
    {OPR_AMP}                       { buffer.append('&'); }
    {OPR_PERCENT}                   { buffer.append('%'); }
    {OPR_PIPE}                      { buffer.append('|'); }
    {OPR_EXCLAIM}                   { buffer.append('!'); }
    {OPR_QUESTION}                  { buffer.append('?'); }
    {OPR_CARET}                     { buffer.append('^'); }
    {OPR_DOT}                       { buffer.append('.'); }
    {OPR_COLON}                     { buffer.append(':'); }
    {OPR_BACK_SLASH}                { buffer.append('\\'); }
    {CRLF}                          { return getOperatorToken(false, 2); }
    {CR}|{LF}|.                     { return getOperatorToken(false, 1); }
}

<LINE_COMMENT> {
    {CRLF}                          { yypushback(2); popState(); return NimElementTypes.COMMENT; }
    {CR}|{LF}                       { yypushback(1); popState(); return NimElementTypes.COMMENT; }
    (.* {NEWLINE}{WHITE_SPACE}* #)  { }
    .+                              { }
    <<EOF>>                         { popState(); return NimElementTypes.COMMENT; }
}

<BLOCK_COMMENT> {
    {BLOCK_COMMENT_BEGIN}           { pushState(BLOCK_COMMENT); }
    {BLOCK_COMMENT_END}             { if (popState() == 0) return NimElementTypes.COMMENT; }
    {CR}|{LF}|.                     { }
}

<BLOCK_DOC_COMMENT> {
    {BLOCK_DOC_COMMENT_BEGIN}       { pushState(BLOCK_DOC_COMMENT); }
    {BLOCK_DOC_COMMENT_END}         { if (popState() == 0) return NimElementTypes.COMMENT; }
    {CR}|{LF}|.                     { }
}

<DISCARD_COMMENT> {
    \"\"\"                          { if (popState() == 0) return NimElementTypes.COMMENT; }
    {CR}|{LF}|.                     { }
}

<STRING_LITERAL> {
    \\\\                            { }
    \\\"                            { }
    \"                              { popState(); return NimElementTypes.STR_LIT; }
    {CR}|{LF}                       { return TokenType.BAD_CHARACTER; }
    .                               { }
}

<TRIPLE_STRING_LITERAL> {
    \"\"\"                          { popState(); return NimElementTypes.STR_LIT; }
    {CR}|{LF}|.                     { }
}

<RAW_STRING_LITERAL> {
    \"\"                            { }
    \"                              { popState(); return NimElementTypes.STR_LIT; }
    {CR}|{LF}                       { return TokenType.BAD_CHARACTER; }
    .                               { }
}

<GENERALIZED_STRING_LITERAL> {
    \"\"                            { }
    \"                              { popState(); return NimElementTypes.GENERALIZED_STR_LIT; }
    {CR}|{LF}                       { return TokenType.BAD_CHARACTER; }
    .                               { }
}

<GENERALIZED_TRIPLE_STRING_LITERAL> {
    \"\"\"                          { popState(); return NimElementTypes.GENERALIZED_STR_LIT; }
    {CR}|{LF}                       { }
    .                               { }
}

<CHARACTER_LITERAL> {
    \\\\                            { }
    \\\'                            { }
    '                               { popState(); return NimElementTypes.CHAR_LIT; }
    {CR}|{LF}                       { return TokenType.BAD_CHARACTER; }
    .                               { }
}
