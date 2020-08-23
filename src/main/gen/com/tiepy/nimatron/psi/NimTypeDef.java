// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimTypeDef extends NimElement {

  @Nullable
  NimGenericParams getGenericParams();

  @Nullable
  NimIdentVisDot getIdentVisDot();

  @Nullable
  NimIdentWithPragmaDot getIdentWithPragmaDot();

  @NotNull
  NimIndAndComment getIndAndComment();

  @NotNull
  NimOptInd getOptInd();

  @Nullable
  NimPragma getPragma();

}
