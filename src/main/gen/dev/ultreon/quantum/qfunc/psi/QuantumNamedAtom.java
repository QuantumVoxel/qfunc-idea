// This is a generated file. Not intended for manual editing.
package dev.ultreon.quantum.qfunc.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QuantumNamedAtom extends PsiElement {

  @Nullable
  QuantumFunctionCall getFunctionCall();

  @Nullable
  QuantumGlobalExpr getGlobalExpr();

  @NotNull
  List<QuantumMember> getMemberList();

  @Nullable
  QuantumParameterExpr getParameterExpr();

  @Nullable
  QuantumVariableName getVariableName();

}
