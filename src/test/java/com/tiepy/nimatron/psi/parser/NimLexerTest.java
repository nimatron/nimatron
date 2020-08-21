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

package com.tiepy.nimatron.psi.parser;

import com.intellij.psi.tree.IElementType;
import org.junit.Assert;
import org.junit.Test;

public class NimLexerTest {

/*
    @Test
    public void testIfElseIndent() {
        int tokenCount = parse("if true:\n" +
                "  echo \"TRUE\"\n" +
                "else:\n" +
                "  echo \"FALSE\"\n");

        Assert.assertEquals(16, tokenCount);
    }
*/

/*
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

        Assert.assertEquals(34, tokenCount);
    }
*/

/*
    @Test
    public void testIfIndentX2() {
        int tokenCount = parse("if true:\n" +
                "  echo \"TRUE L1\"\n" +
                "  if true:\n" +
                "    echo \"TRUE L2\"\n" +
                "echo \"Outside conditionals\"\n");

        Assert.assertEquals(34, tokenCount);
    }
*/

/*
    @Test
    public void testIgnoredComment() {
        int tokenCount = parse("proc getAlphabet(): string =\n" +
                "  return \"\"\n" +
                "\n" +
                "# Computed at compilation time\n" +
                "const alphabet = getAlphabet()\n");

        Assert.assertEquals(27, tokenCount);
    }
*/

/*
    @Test
    public void testExportSyntax() {
        int tokenCount = parse("proc foo*(): int = 2");
        Assert.assertEquals(27, tokenCount);
    }
*/

/*
    @Test
    public void testMiscNumberValueHighlighting() throws Exception {
        int tokenCount = parse("var i = 1'f\n");
        Assert.assertEquals(8, tokenCount);
    }
*/

/*
    @Test
    public void testMiscMultiLineArgs() throws Exception {
        int tokenCount = parse("echo(2, 3, 1,\n" +
                "        4, 3, 1,\n" +
                "     6, 3, 1)\n");
        Assert.assertEquals(32, tokenCount);
    }
*/

/*
    @Test
    public void testMiscImportFromParentPath() throws Exception {
        int tokenCount = parse("import ../base");
        Assert.assertEquals(4, tokenCount);
    }
*/

/*
    @Test
    public void testMiscForwardSlashFuncName() throws Exception {
        int tokenCount = parse("func `*=`*(a: var Vector3, b: Vector3) =\n" +
                "  a = a * b\n" +
                "\n" +
                "func `/=`*(a: var Vector3, b: Vector3) =\n" +
                "  a = a / b\n");
        Assert.assertEquals(70, tokenCount);
    }
*/

/*
    @Test
    public void testMiscObjType() throws Exception {
        int tokenCount = parse("type Object = object\n" +
                "  member: string\n");
        Assert.assertEquals(14, tokenCount);
    }
*/

    @Test
    public void testLineComment() throws Exception {
        int tokenCount = parse("const\n" +
                "  EndOfFile* = '\\0'           # end of file marker\n" +
                "                              # A little picture makes everything clear :-)\n");
        Assert.assertEquals(11, tokenCount);
    }

    /**
     * Parses the string into tokens using the lexer to be tested.
     * @param input String to be parsed.
     * @return Token count.
     */
    private int parse(String input) throws Exception {
        int count = 0;
        boolean badChars = false;

        NimLexerAdapter lexer = new NimLexerAdapter();

        int start = 0;
        int end = input.length();
        lexer.start(input, start, end, NimLexer.YYINITIAL);

        IElementType token = lexer.getTokenType();
        while (token != null) {
            count++;

            System.out.println(String.format("%s \"%s\"", token.toString(),
                    lexer.getTokenText().replace("\n", "\\n")));

            if (token.toString().contains("BAD_CHARACTER")) {
                badChars = true;
            }

            lexer.advance();
            token = lexer.getTokenType();
        }

        if (badChars) {
            throw new Exception("Contains bad character(s)");
        }

        return count;
    }
}
