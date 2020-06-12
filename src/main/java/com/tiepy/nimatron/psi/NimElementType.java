package com.tiepy.nimatron.psi;

import com.intellij.psi.tree.IElementType;
import com.tiepy.nimatron.NimLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class NimElementType extends IElementType {
    public NimElementType( @NotNull @NonNls String debugName) {
        super(debugName, NimLanguage.INSTANCE);
    }
}
