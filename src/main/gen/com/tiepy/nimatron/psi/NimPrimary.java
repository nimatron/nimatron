// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimPrimary extends NimElement {

  @Nullable
  NimDistinctType getDistinctType();

  @Nullable
  NimEnumType getEnumType();

  @Nullable
  NimIdentOrLiteral getIdentOrLiteral();

  @Nullable
  NimIteratorType getIteratorType();

  @Nullable
  NimObjectType getObjectType();

  @Nullable
  NimOperator getOperator();

  @Nullable
  NimOutType getOutType();

  @Nullable
  NimPrimary getPrimary();

  @NotNull
  List<NimPrimarySuffix> getPrimarySuffixList();

  @Nullable
  NimProcType getProcType();

  @Nullable
  NimPtrType getPtrType();

  @Nullable
  NimRefType getRefType();

  @Nullable
  NimSharedType getSharedType();

  @Nullable
  NimTupleType getTupleType();

  @Nullable
  NimVarType getVarType();

}
