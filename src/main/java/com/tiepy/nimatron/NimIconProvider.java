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
