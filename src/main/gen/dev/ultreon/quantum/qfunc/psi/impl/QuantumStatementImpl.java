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

public class QuantumStatementImpl extends ASTWrapperPsiElement implements QuantumStatement {

  public QuantumStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QuantumVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QuantumVisitor) accept((QuantumVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public QuantumAssignment getAssignment() {
    return findChildByClass(QuantumAssignment.class);
  }

  @Override
  @Nullable
  public QuantumBlockStatement getBlockStatement() {
    return findChildByClass(QuantumBlockStatement.class);
  }

  @Override
  @Nullable
  public QuantumBreakStatement getBreakStatement() {
    return findChildByClass(QuantumBreakStatement.class);
  }

  @Override
  @Nullable
  public QuantumContinueStatement getContinueStatement() {
    return findChildByClass(QuantumContinueStatement.class);
  }

  @Override
  @Nullable
  public QuantumExpressionStatement getExpressionStatement() {
    return findChildByClass(QuantumExpressionStatement.class);
  }

  @Override
  @Nullable
  public QuantumForStatement getForStatement() {
    return findChildByClass(QuantumForStatement.class);
  }

  @Override
  @Nullable
  public QuantumFunctionCall getFunctionCall() {
    return findChildByClass(QuantumFunctionCall.class);
  }

  @Override
  @Nullable
  public QuantumIfStatement getIfStatement() {
    return findChildByClass(QuantumIfStatement.class);
  }

  @Override
  @Nullable
  public QuantumInputStatement getInputStatement() {
    return findChildByClass(QuantumInputStatement.class);
  }

  @Override
  @Nullable
  public QuantumLineComment getLineComment() {
    return findChildByClass(QuantumLineComment.class);
  }

  @Override
  @Nullable
  public QuantumLoopStatement getLoopStatement() {
    return findChildByClass(QuantumLoopStatement.class);
  }

  @Override
  @Nullable
  public QuantumPersistStatement getPersistStatement() {
    return findChildByClass(QuantumPersistStatement.class);
  }

  @Override
  @Nullable
  public QuantumReturnStatement getReturnStatement() {
    return findChildByClass(QuantumReturnStatement.class);
  }

  @Override
  @Nullable
  public QuantumStopStatement getStopStatement() {
    return findChildByClass(QuantumStopStatement.class);
  }

  @Override
  @Nullable
  public QuantumWhileStatement getWhileStatement() {
    return findChildByClass(QuantumWhileStatement.class);
  }

}
