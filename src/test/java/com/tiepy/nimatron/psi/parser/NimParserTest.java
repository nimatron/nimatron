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

import com.intellij.testFramework.ParsingTestCase;

public class NimParserTest extends ParsingTestCase {
    public NimParserTest() {
        super("", "nim", new NimParserDefinition());
    }

    public void testMiscArrayAssign() {
        doTest(true, true);
    }

    public void testMiscArrayIndented() {
        doTest(true, true);
    }

    public void testMiscBlock() {
        doTest(true, true);
    }

    public void testMiscCommentNotIgnored() {
        doTest(true, true);
    }

    public void testMiscEchoOk() {
        doTest(true, true);
    }

    public void testMiscEchoOkX2() {
        doTest(true, true);
    }

    public void testMiscFor() {
        doTest(true, true);
    }

    public void testMiscFuncArg() {
        doTest(true, true);
    }

    public void testMiscFuncVarArg() {
        doTest(true, true);
    }

    public void testMiscForwardSlashFuncName() {
        doTest(true, true);
    }

    public void testMiscIfIndent() {
        doTest(true, true);
    }

    public void testMiscIfIndentX2() {
        doTest(true, true);
    }

    public void testMiscIfElseIndent() {
        doTest(true, true);
    }

    public void testMiscIfElseIndentX2() {
        doTest(true, true);
    }

    public void testMiscIfTrueEchoOk() {
        doTest(true, true);
    }

    public void testMiscImportFromParentPath() {
        doTest(true, true);
    }

    public void testMiscImportsComma() {
        doTest(true, true);
    }

    public void testMiscLineComment() {
        doTest(true, true);
    }

    public void testMiscMethodCall() {
        doTest(true, true);
    }

    public void testMiscMultiLineArgs() {
        doTest(true, true);
    }

    public void testMiscMultiLineCommentAtFileEnd() {
        doTest(true, true);
    }

    public void testMiscMultipleVarStatements() {
        doTest(true, true);
    }

    public void testMiscNumberValueHighlighting() {
        doTest(true, true);
    }

    public void testMiscObjType() {
        doTest(true, true);
    }

    public void testMiscObjTypeOf() {
        doTest(true, true);
    }

    public void testMiscObjFieldParsing() {
        doTest(true, true);
    }

    public void testMiscParseOpt() {
        doTest(true, true);
    }

    public void testMiscParseOptBlock1() {
        doTest(true, true);
    }

    public void testMiscParseOptBlock2() {
        doTest(true, true);
    }

    public void testMiscParseOptBlock3() {
        doTest(true, true);
    }

    public void testMiscPop() {
        doTest(true, true);
    }

    public void testMiscProc() {
        doTest(true, true);
    }

    public void testMiscProcCall() {
        doTest(true, true);
    }

    public void testMiscProcWithFollowingBlankLines() {
        doTest(true, true);
    }

    public void testMiscSimpleIf() {
        doTest(true, true);
    }

    public void testMiscTypeDecl() {
        doTest(true, true);
    }

    public void testMiscTypeDef() {
        doTest(true, true);
    }

    public void testMiscVar() {
        doTest(true, true);
    }

    public void testMiscVar2() {
        doTest(true, true);
    }

    public void testMiscWhatsYourName() {
        doTest(true, true);
    }

    public void testNimByExampleOOP() {
        doTest(true, true);
    }

    public void testNimByExampleProc() {
        doTest(true, true);
    }

    public void testNimByExampleProc2() {
        doTest(true, true);
    }

    public void testNimByExampleVariables() {
        doTest(true, true);
    }

    public void testNimTestProc() {
        doTest(true, true);
    }

    public void testNimTestVarStmtVarDecl() {
        doTest(true, true);
    }

    /**
     * @return path to test data file directory relative to root of this module.
     */
    @Override
    protected String getTestDataPath() {
        return "src/test/testData";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}
