package com.tiepy.nimatron;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class NimFileType extends LanguageFileType {
    public static final NimFileType INSTANCE = new NimFileType();

    private NimFileType() {
        super(NimLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Nim File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Nim language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "nim";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return NimIcons.FILE;
    }
}
