// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPrimary extends NimElement {

  @Nullable
  NimIdentOrLiteral getIdentOrLiteral();

  @Nullable
  NimObject getObject();

  @Nullable
  NimOperator getOperator();

  @Nullable
  NimOptInd getOptInd();

  @Nullable
  NimPrimary getPrimary();

  @NotNull
  List<NimPrimarySuffix> getPrimarySuffixList();

  @Nullable
  NimTypeKeyw getTypeKeyw();

}
