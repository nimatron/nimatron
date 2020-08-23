// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimForStmt extends NimElement {

  @Nullable
  NimColcom getColcom();

  @NotNull
  List<NimComma> getCommaList();

  @Nullable
  NimExpr getExpr();

  @NotNull
  List<NimIdentWithPragma> getIdentWithPragmaList();

  @Nullable
  NimInlineStmt getInlineStmt();

}
