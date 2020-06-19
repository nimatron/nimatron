// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimConstant extends PsiElement {

  @NotNull
  NimExpr getExpr();

  @Nullable
  NimIdentWithPragma getIdentWithPragma();

  @Nullable
  NimTypeDesc getTypeDesc();

  @Nullable
  NimVarTuple getVarTuple();

}
