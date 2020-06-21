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

    @Test
    public void testIfElseIndent() {
        int tokenCount = parse("if true:\n" +
                "  echo \"TRUE\"\n" +
                "else:\n" +
                "  echo \"FALSE\"\n");

        Assert.assertEquals(18, tokenCount);
    }

    @Test
    public void testIfElseIndentX2() {
        int tokenCount = parse("if true:\n" +
                "  echo \"TRUE L1\"\n" +
                "  if false:\n" +
                "    echo \"TRUE L2\"\n" +
                "  else:\n" +
                "    echo \"FALSE L2\"\n" +
                "else:\n" +
                "  echo \"FALSE L1\"\n");

        Assert.assertEquals(18, tokenCount);
    }

    /**
     * Parses the string into tokens using the lexer to be tested.
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
            System.out.println(String.format("%s \"%s\"", token.toString(),
                    lexer.getTokenText().replace("\n", "\\n")));
            lexer.advance();
            token = lexer.getTokenType();
        }

        return count;
    }
}
