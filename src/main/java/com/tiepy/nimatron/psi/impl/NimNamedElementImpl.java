/*
 * This file is based on example provided by the JS GraphQL IntelliJ Plugin.
 * Copyright (c) 2018-2020, Jim Kynde Meyer.
 * Use of original example source code is governed by the MIT license.
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

package com.tiepy.nimatron.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.SourceTreeToPsiMap;
import com.intellij.psi.impl.source.tree.Factory;
import com.intellij.psi.impl.source.tree.LeafElement;
import com.intellij.util.IncorrectOperationException;
import com.tiepy.nimatron.psi.NimElementTypes;
import com.tiepy.nimatron.psi.NimNamedElement;
import com.tiepy.nimatron.psi.NimSymbol;
import org.jetbrains.annotations.NotNull;

public abstract class NimNamedElementImpl extends NimElementImpl implements NimNamedElement {

    public NimNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public String getName() {
        PsiElement identifier = getNameIdentifier();
        if (identifier == null) return null;

        ASTNode identifierNode = identifier.getNode();
        if (identifierNode == null) return null;

        return identifierNode.getText();
    }

    @Override
    public PsiElement setName(@NotNull String newName) throws IncorrectOperationException {
        final NimSymbol nameIdentifier = getNameIdentifier();
        if (nameIdentifier != null) {
            final LeafElement renamedLeaf = Factory.createSingleLeafElement(NimElementTypes.SYMBOL, newName, null, nameIdentifier.getManager());
            final PsiElement renamedPsiElement = SourceTreeToPsiMap.treeElementToPsi(renamedLeaf);
            if (renamedPsiElement != null) {
                nameIdentifier.getFirstChild().replace(renamedPsiElement);
            }
        }
        return this;
    }
}
