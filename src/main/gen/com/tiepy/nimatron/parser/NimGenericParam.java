// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimGenericParam extends PsiElement {

  @Nullable
  NimColon getColon();

  @NotNull
  List<NimComma> getCommaList();

  @Nullable
  NimExpr getExpr();

  @Nullable
  NimOptInd getOptInd();

  @NotNull
  List<NimSymbol> getSymbolList();

}
