package com.tiepy.nimatron.psi;

import com.intellij.psi.tree.IElementType;
import com.tiepy.nimatron.NimLanguage;
import org.jetbrains.annotations.*;

public class NimTokenType extends IElementType {
    public NimTokenType(@NotNull @NonNls String debugName) {
        super(debugName, NimLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "NimTokenType." + super.toString();
    }
}
