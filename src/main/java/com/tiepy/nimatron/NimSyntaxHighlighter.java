package com.tiepy.nimatron;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import com.tiepy.nimatron.psi.NimTypes;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class NimSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEYWORD = createTextAttributesKey(
            "NIM_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey LINE_COMMENT = createTextAttributesKey(
            "NIM_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey LITERAL_STRING = createTextAttributesKey(
            "NIM_LITERAL_STRING", DefaultLanguageHighlighterColors.STRING);

    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{LINE_COMMENT};
    private static final TextAttributesKey[] LITERAL_STRING_KEYS = new TextAttributesKey[]{LITERAL_STRING};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new NimLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(NimTypes.KEYWORD)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(NimTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(NimTypes.LITERAL_STRING)) {
            return LITERAL_STRING_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
