// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimRoutine extends PsiElement {

  @Nullable
  NimGenericParams getGenericParams();

  @NotNull
  NimIdentVis getIdentVis();

  @Nullable
  NimOptInd getOptInd();

  @NotNull
  NimParamsColon getParamsColon();

  @Nullable
  NimPattern getPattern();

  @Nullable
  NimPragma getPragma();

  @Nullable
  NimRem getRem();

}
