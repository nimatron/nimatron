// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimGenericParamList extends PsiElement {

  @NotNull
  List<NimComma> getCommaList();

  @NotNull
  List<NimGenericParam> getGenericParamList();

  @NotNull
  NimOptInd getOptInd();

  @NotNull
  NimOptPar getOptPar();

  @NotNull
  List<NimSemicolon> getSemicolonList();

}
