// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimTypeDef extends NimElement {

  @NotNull
  List<NimGenericParams> getGenericParamsList();

  @NotNull
  NimIdentVisDot getIdentVisDot();

  @NotNull
  NimIdentWithPragmaDot getIdentWithPragmaDot();

  @NotNull
  List<NimOptInd> getOptIndList();

  @NotNull
  NimPragma getPragma();

}
