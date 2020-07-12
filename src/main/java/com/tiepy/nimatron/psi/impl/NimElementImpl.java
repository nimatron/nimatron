package com.tiepy.nimatron.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.tiepy.nimatron.psi.NimElement;
import org.jetbrains.annotations.NotNull;

public abstract class NimElementImpl extends ASTWrapperPsiElement implements NimElement {
    public NimElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
