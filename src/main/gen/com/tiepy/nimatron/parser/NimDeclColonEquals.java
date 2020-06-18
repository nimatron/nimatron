// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimDeclColonEquals extends PsiElement {

  @NotNull
  List<NimComma> getCommaList();

  @Nullable
  NimExpr getExpr();

  @NotNull
  List<NimIdentWithPragma> getIdentWithPragmaList();

  @NotNull
  List<NimOptInd> getOptIndList();

  @Nullable
  NimTypeDesc getTypeDesc();

}
