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

package com.tiepy.nimatron;

import com.intellij.ide.IconProvider;
import com.intellij.psi.PsiElement;
import com.tiepy.nimatron.psi.NimElement;
import com.tiepy.nimatron.psi.impl.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class NimIconProvider extends IconProvider {
    @Nullable
    @Override
    public Icon getIcon(@NotNull PsiElement element, int flags) {
        if (element instanceof NimElement) {

            if (element instanceof NimProcStmtImpl) {
                return NimIcons.StructureView.Proc;
            }

            if (element instanceof NimFuncStmtImpl) {
                return NimIcons.StructureView.Func;
            }

            if (element instanceof NimMethodStmtImpl) {
                return NimIcons.StructureView.Method;
            }

            if (element instanceof NimIteratorStmtImpl) {
                return NimIcons.StructureView.Iterator;
            }

            if (element instanceof NimMacroStmtImpl) {
                return NimIcons.StructureView.Macro;
            }

            if (element instanceof NimTemplateStmtImpl) {
                return NimIcons.StructureView.Template;
            }

            if (element instanceof NimConverterStmtImpl) {
                return NimIcons.StructureView.Converter;
            }

            // TODO: Provide a default icon.
            return NimIcons.StructureView.Proc;
        }

        return null;
    }
}
