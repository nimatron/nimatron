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

package com.tiepy.nimatron;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.*;
import com.tiepy.nimatron.syntaxHighlighter.NimSyntaxHighlighter;
import org.jetbrains.annotations.*;

import javax.swing.*;
import java.util.Map;

public class NimColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", NimSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Line Comment", NimSyntaxHighlighter.LINE_COMMENT),
            new AttributesDescriptor("String Literal", NimSyntaxHighlighter.STRING_LITERAL),
            new AttributesDescriptor("Numerical Constant", NimSyntaxHighlighter.NUMERICAL_CONSTANT),
            new AttributesDescriptor("Operator", NimSyntaxHighlighter.OPERATOR),
            new AttributesDescriptor("Bracket", NimSyntaxHighlighter.BRACKET),
            new AttributesDescriptor("Parenthesis", NimSyntaxHighlighter.PARENTHESIS),
            new AttributesDescriptor("Semicolon", NimSyntaxHighlighter.SEMICOLON),
            new AttributesDescriptor("Comma", NimSyntaxHighlighter.COMMA),
            new AttributesDescriptor("Built-in Type", NimSyntaxHighlighter.TYPES),
            new AttributesDescriptor("Procedure Name", NimSyntaxHighlighter.PROCS),
            new AttributesDescriptor("Identifier", NimSyntaxHighlighter.IDENT),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return NimIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new NimSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "echo \"Hello, World!\" # This is a line comment\n" +
                "\n" +
                "#[\n" +
                "This is a block comment.\n" +
                "#[\n" +
                "This is a nested block comment.\n" +
                "]#\n" +
                "]#\n" +
                "\n" +
                "proc p(arg: int): int =\n" +
                "  s.add $arg\n" +
                "  result = arg\n" +
                "\n" +
                "discard p(p(1) + p(2))\n" +
                "\n" +
                "var b = true\n" +
                "doAssert b == true\n" +
                "\n" +
                "if true else false\n" +
                "\n" +
                "\"\"\"This is\n" +
                "a multi-line string that can contain \"Other strings\".\"\"\"\n" +
                "\n" +
                "var path = r\"C:\\\"; echo path\n" +
                "\n" +
                "var s1 = abc\"string literal\\\"\n" +
                "var s2 = ident\"\"\"string literal\"\"\"\n" +
                "var c = 'c'\n" +
                "\n" +
                "var n1 = 123\n" +
                "var n2 = 1.2\n" +
                "var n3 = 1e23\n" +
                "var n4 = 1.2e-23\n" +
                "var test = true and false\n" +
                "\n" +
                "return json({'hello': 'world'})\n" +
                "\n" +
                "var\n" +
                "  x, y: int\n" +
                "  # a comment can occur here too\n" +
                "  a, b, c: string\n" +
                "\n" +
                "var checkpoints* {.threadvar.}: seq[string]";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Nim";
    }
}
