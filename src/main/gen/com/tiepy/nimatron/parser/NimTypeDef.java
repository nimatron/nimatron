// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimTypeDef extends PsiElement {

  @NotNull
  List<NimGenericParamList> getGenericParamListList();

  @NotNull
  NimIdentVisDot getIdentVisDot();

  @NotNull
  NimIdentWithPragmaDot getIdentWithPragmaDot();

  @NotNull
  NimPragma getPragma();

  @NotNull
  List<NimTypeDefAux> getTypeDefAuxList();

}
