// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPrimary2 extends NimElement {

  @NotNull
  NimIdentOrLiteral getIdentOrLiteral();

  @NotNull
  List<NimOperator> getOperatorList();

  @NotNull
  List<NimPrimarySuffix> getPrimarySuffixList();

}
