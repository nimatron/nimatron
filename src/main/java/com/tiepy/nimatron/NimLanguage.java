package com.tiepy.nimatron;

import com.intellij.lang.Language;

public class NimLanguage extends Language {
    public static final NimLanguage INSTANCE = new NimLanguage();

    private NimLanguage() {
        super("Nim");
    }
}
