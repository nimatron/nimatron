// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimSimpleExpr extends NimElement {

  @NotNull
  List<NimOp> getOpList();

  @NotNull
  List<NimOptInd> getOptIndList();

  @Nullable
  NimPragma getPragma();

  @NotNull
  NimPrimary getPrimary();

}