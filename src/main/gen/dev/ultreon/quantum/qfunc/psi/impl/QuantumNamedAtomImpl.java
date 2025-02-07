// This is a generated file. Not intended for manual editing.
package dev.ultreon.quantum.qfunc.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.ultreon.quantum.qfunc.psi.QuantumTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import dev.ultreon.quantum.qfunc.psi.*;

public class QuantumNamedAtomImpl extends ASTWrapperPsiElement implements QuantumNamedAtom {

  public QuantumNamedAtomImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QuantumVisitor visitor) {
    visitor.visitNamedAtom(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QuantumVisitor) accept((QuantumVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public QuantumFunctionCall getFunctionCall() {
    return findChildByClass(QuantumFunctionCall.class);
  }

  @Override
  @Nullable
  public QuantumGlobalExpr getGlobalExpr() {
    return findChildByClass(QuantumGlobalExpr.class);
  }

  @Override
  @NotNull
  public List<QuantumMember> getMemberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QuantumMember.class);
  }

  @Override
  @Nullable
  public QuantumParameterExpr getParameterExpr() {
    return findChildByClass(QuantumParameterExpr.class);
  }

  @Override
  @Nullable
  public QuantumVariableName getVariableName() {
    return findChildByClass(QuantumVariableName.class);
  }

}
