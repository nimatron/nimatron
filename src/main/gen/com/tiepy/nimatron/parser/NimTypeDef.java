// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimTypeDef extends PsiElement {

  @Nullable
  NimGenericParamList getGenericParamList();

  @Nullable
  NimIdentVisDot getIdentVisDot();

  @Nullable
  NimIdentWithPragmaDot getIdentWithPragmaDot();

  @Nullable
  NimIndAndComment getIndAndComment();

  @NotNull
  NimOptInd getOptInd();

  @Nullable
  NimPragma getPragma();

  @NotNull
  NimTypeDefAux getTypeDefAux();

}
