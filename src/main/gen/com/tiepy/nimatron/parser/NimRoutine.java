// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimRoutine extends PsiElement {

  @Nullable
  NimGenericParamList getGenericParamList();

  @NotNull
  NimIdentVis getIdentVis();

  @NotNull
  NimOptInd getOptInd();

  @NotNull
  NimParamListColon getParamListColon();

  @Nullable
  NimPattern getPattern();

  @Nullable
  NimPragma getPragma();

  @Nullable
  NimStmt getStmt();

}
