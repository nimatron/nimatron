// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimCastExpr extends PsiElement {

  @NotNull
  NimExpr getExpr();

  @NotNull
  List<NimOptInd> getOptIndList();

  @NotNull
  List<NimOptPar> getOptParList();

  @NotNull
  NimTypeDesc getTypeDesc();

}
