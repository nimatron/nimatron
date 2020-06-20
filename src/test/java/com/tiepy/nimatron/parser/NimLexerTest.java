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

package com.tiepy.nimatron.parser;

import com.intellij.psi.tree.IElementType;
import org.junit.Assert;
import org.junit.Test;

public class NimLexerTest {

    private String stringify(String input) {
        return input.replace("\n", "\\n");
    }

    /**
     * Parses the string into tokens using the lexer to be tested.
     *
     * @param input String to be parsed.
     * @return Token count.
     */
    private int parse(String input) {
        int count = 0;

        NimLexerAdapter lexer = new NimLexerAdapter();

        int start = 0;
        int end = input.length();
        lexer.start(input, start, end, NimLexer.YYINITIAL);

        IElementType token = lexer.getTokenType();
        while (token != null) {
            count++;
            System.out.println(String.format("%s \"%s\"", token.toString(), stringify(lexer.getTokenText())));
            lexer.advance();
            token = lexer.getTokenType();
        }

        return count;
    }

    @Test
    public void testSimpleIf() {
        int tokenCount = parse("if name == \"\":\n" +
                "  echo \"Poor soul, you lost your name?\"\n");

        Assert.assertEquals(12, tokenCount);
    }

    @Test
    public void testExample() {
        int tokenCount = parse("echo \"Hello, World!\" # This is a line comment\n" +
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
                "var checkpoints* {.threadvar.}: seq[string]\n");

        Assert.assertEquals(209, tokenCount);
    }
}
