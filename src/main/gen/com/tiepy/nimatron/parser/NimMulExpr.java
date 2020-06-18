// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimMulExpr extends PsiElement {

  @NotNull
  List<NimDollarExpr> getDollarExprList();

  @NotNull
  List<NimOptInd> getOptIndList();

}
