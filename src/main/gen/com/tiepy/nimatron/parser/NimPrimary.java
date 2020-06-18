// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.parser;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPrimary extends PsiElement {

  @Nullable
  NimIdentOrLiteral getIdentOrLiteral();

  @Nullable
  NimOptInd getOptInd();

  @NotNull
  List<NimPrefixOperator> getPrefixOperatorList();

  @Nullable
  NimPrimary getPrimary();

  @NotNull
  List<NimPrimarySuffix> getPrimarySuffixList();

  @Nullable
  NimTypeDesc getTypeDesc();

  @Nullable
  NimTypeKeyw getTypeKeyw();

}
