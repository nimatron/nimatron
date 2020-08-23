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

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiComment;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.tiepy.nimatron.psi.impl.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NimFoldingBuilder extends FoldingBuilderEx implements DumbAware {

    @NotNull
    @Override
    public FoldingDescriptor[] buildFoldRegions(@NotNull PsiElement root, @NotNull Document document, boolean quick) {
        List<FoldingDescriptor> list = new ArrayList<>();

        // Add regions for statements.
        Collection<NimComplexOrSimpleStmtImpl> statements = PsiTreeUtil.findChildrenOfType(root, NimComplexOrSimpleStmtImpl.class);
        for (final NimComplexOrSimpleStmtImpl statement : statements) {
            addRegion(statement, list);
        }

        // Add regions for multi-line comments.
        Collection<PsiComment> comments = PsiTreeUtil.findChildrenOfType(root, PsiComment.class);
        for (final PsiComment comment : comments) {
            addRegion(comment, list);
        }

        FoldingDescriptor[] descriptors = new FoldingDescriptor[list.size()];
        return list.toArray(descriptors);
    }

    private static void addRegion(PsiElement element, List<FoldingDescriptor> list) {
        int start = element.getTextRange().getStartOffset();
        int end = element.getTextRange().getEndOffset();
        if (end > start) {
            // Add a folding descriptor for the statement at this node.

            // Don't include trailing newlines.
            String str = element.getText();
            int trim = str.length() - str.trim().length();

            list.add(new FoldingDescriptor(element.getNode(), new TextRange(start, end - trim)));
        }
    }

    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode node) {
        String str = node.getPsi().getText().trim().replaceAll("\\s+", " ");
        int len = str.length();
        if (len > 77) str = str.substring(0, 77);
        int pos = str.indexOf(' ');
        if (pos > 0) str = str.substring(0, pos);
        if (str.length() < len) str = str + "...";
        return str;
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode node) {
        return false;
    }
}
