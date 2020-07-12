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
import com.tiepy.nimatron.psi.NimTokenType;

public interface NimSyntaxTypes {
    IElementType BRACKET = new NimTokenType("BRACKET");
    IElementType COMMA = new NimTokenType("COMMA");
    IElementType COMMENT = new NimTokenType("COMMENT");
    IElementType GRAVE_ACCENT = new NimTokenType("GRAVE_ACCENT");
    IElementType IDENT = new NimTokenType("IDENT");
    IElementType KEYWORD = new NimTokenType("KEYWORD");
    IElementType NUMERICAL_CONSTANT = new NimTokenType("NUMERICAL_CONSTANT");
    IElementType OPERATOR = new NimTokenType("OPERATOR");
    IElementType PARENTHESIS = new NimTokenType("PARENTHESIS");
    IElementType PROCS = new NimTokenType("PROCS");
    IElementType SEMICOLON = new NimTokenType("SEMICOLON");
    IElementType STRING_LITERAL = new NimTokenType("STRING_LITERAL");
    IElementType TYPES = new NimTokenType("TYPES");
}
