// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimRoutine extends NimElement {

  @Nullable
  NimGenericParams getGenericParams();

  @NotNull
  NimIndAndComment getIndAndComment();

  @Nullable
  NimInlineStmt getInlineStmt();

  @NotNull
  NimParamsColon getParamsColon();

  @Nullable
  NimPattern getPattern();

  @Nullable
  NimPragma getPragma();

}
