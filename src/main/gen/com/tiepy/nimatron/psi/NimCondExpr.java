// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimCondExpr extends NimElement {

  @NotNull
  List<NimCondExpr1> getCondExpr1List();

  @Nullable
  NimCondExpr2 getCondExpr2();

  @NotNull
  NimExpr getExpr();

  @NotNull
  NimOptInd getOptInd();

}
