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

        // Get a collection of the statements in the document below root.
        Collection<NimStmtImpl> statements =
                PsiTreeUtil.findChildrenOfType(root, NimStmtImpl.class);

        // Evaluate the collection.
        for (final NimStmtImpl statement : statements) {
            try {

                // Add a folding descriptor for the statement at this node.
                list.add(new FoldingDescriptor(statement.getNode(),
                        new TextRange(statement.getTextRange().getStartOffset() + 1,
                                statement.getTextRange().getEndOffset() - 1)));

            } catch (Exception ex) {
                // Ignore
            }
        }

        FoldingDescriptor[] descriptors = new FoldingDescriptor[list.size()];
        return list.toArray(descriptors);
    }

    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode node) {
        // TODO: Get name of routine.

/*
        final ASTNode first = node.getFirstChildNode();
        final ASTNode last = node.getLastChildNode();

        if (first != null && last != null) {
            return first.getText() + "..." + last.getText();
        }
*/

        return "...";
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode node) {
        return false;
    }
}
