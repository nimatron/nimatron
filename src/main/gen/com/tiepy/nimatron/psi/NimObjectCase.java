// This is a generated file. Not intended for manual editing.
package com.tiepy.nimatron.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface NimObjectCase extends NimElement {

  @Nullable
  NimDedent getDedent();

  @NotNull
  NimIdentWithPragma getIdentWithPragma();

  @Nullable
  NimIndEq getIndEq();

  @NotNull
  NimObjectBranches getObjectBranches();

  @NotNull
  NimTypeDesc getTypeDesc();

}
