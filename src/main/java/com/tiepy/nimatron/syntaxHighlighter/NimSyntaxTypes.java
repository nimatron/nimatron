/*
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

package com.tiepy.nimatron.syntaxHighlighter;

import com.intellij.psi.tree.IElementType;

public interface NimSyntaxTypes {
    IElementType BRACKET = new NimSyntaxTokenType("BRACKET");
    IElementType COMMA = new NimSyntaxTokenType("COMMA");
    IElementType COMMENT = new NimSyntaxTokenType("COMMENT");
    IElementType GRAVE_ACCENT = new NimSyntaxTokenType("GRAVE_ACCENT");
    IElementType IDENT = new NimSyntaxTokenType("IDENT");
    IElementType KEYWORD = new NimSyntaxTokenType("KEYWORD");
    IElementType NUMERICAL_CONSTANT = new NimSyntaxTokenType("NUMERICAL_CONSTANT");
    IElementType OPERATOR = new NimSyntaxTokenType("OPERATOR");
    IElementType PARENTHESIS = new NimSyntaxTokenType("PARENTHESIS");
    IElementType PROCS = new NimSyntaxTokenType("PROCS");
    IElementType SEMICOLON = new NimSyntaxTokenType("SEMICOLON");
    IElementType STRING_LITERAL = new NimSyntaxTokenType("STRING_LITERAL");
    IElementType TYPES = new NimSyntaxTokenType("TYPES");
}