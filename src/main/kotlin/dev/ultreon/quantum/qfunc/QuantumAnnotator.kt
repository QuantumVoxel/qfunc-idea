package dev.ultreon.quantum.qfunc

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.util.Key
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiErrorElement
import com.intellij.psi.util.elementType
import dev.ultreon.quantum.qfunc.psi.*

val keyInputs = Key.create<List<String>>("key.inputs")
val keyGlobals = Key.create<MutableList<String>>("key.globals")

class QuantumAnnotator : Annotator {
  override fun annotate(element: PsiElement, holder: AnnotationHolder) {
    val elementType = element.node.elementType // Get the element type from the parsed node

    val session = holder.currentAnnotationSession

    when (element) {
      is PsiErrorElement -> {
        return
      }

      is QuantumId -> {
        holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
          .textAttributes(DefaultLanguageHighlighterColors.CLASS_REFERENCE)
          .range(element)
          .create()
      }

      is QuantumPersistStatement -> {
        holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
          .textAttributes(DefaultLanguageHighlighterColors.KEYWORD)
          .range(element)
          .create()

        for (child in element.children) {
          if (child is QuantumGlobalName) {
            holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
              .textAttributes(DefaultLanguageHighlighterColors.INSTANCE_FIELD)
              .range(child)
              .create()

            session.getUserData(keyGlobals)?.add(child.text) ?: run {
              session.putUserData(keyGlobals, mutableListOf(child.text))
            }
          }
        }
      }

      is QuantumInputStatement -> {
        session.putUserData(keyInputs, element.paramNameList.map { it.text })

        holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
          .textAttributes(DefaultLanguageHighlighterColors.KEYWORD)
          .range(element)
          .create()

        for (child in element.paramNameList) {
          holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
            .textAttributes(DefaultLanguageHighlighterColors.CONSTANT)
            .range(child)
            .create()
        }
      }

      is QuantumGlobalName -> {
        session.getUserData(keyGlobals)?.let { inputs ->
          var isDefine = false
          if (element.parent is QuantumPersistStatement) isDefine = true
          if (element.parent is QuantumGlobalExpr) {
            val parent = element.parent.parent
            if (parent !is QuantumGlobalRef) isDefine = true
            else if (parent.children[0].text == "present") isDefine = true
          }

          if (isDefine) {
            element.putUserData(keyGlobals, inputs.also {
              it.add(element.text)
            })
          } else if (element.text !in inputs) {
            holder.newAnnotation(HighlightSeverity.ERROR, "Global name '${element.text}' isn't defined")
              .range(element)
              .create()

            element.putUserData(keyGlobals, inputs.also {
              it.add(element.text)
            })
          }
        }
      }

      is QuantumDirectiveType -> {
        holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
          .textAttributes(DefaultLanguageHighlighterColors.CLASS_NAME)
          .range(element)
          .create()
      }

      is QuantumFuncName -> {
        holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
          .textAttributes(DefaultLanguageHighlighterColors.FUNCTION_CALL)
          .range(element)
          .create()
      }

      is QuantumPath -> {
        holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
          .textAttributes(DefaultLanguageHighlighterColors.STRING)
          .range(element)
          .create()
      }

      is QuantumNamespace -> {
        holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
          .textAttributes(DefaultLanguageHighlighterColors.CLASS_REFERENCE)
          .range(element)
          .create()
      }

      is QuantumGlobalExpr -> {
        holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
          .textAttributes(DefaultLanguageHighlighterColors.INSTANCE_FIELD)
          .range(element)
          .create()
      }

      is QuantumParameterExpr -> {
        holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
          .textAttributes(DefaultLanguageHighlighterColors.CONSTANT)
          .range(element)
          .create()
      }

      is QuantumParameterName -> {
        holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
          .textAttributes(DefaultLanguageHighlighterColors.PARAMETER)
          .range(element)
          .create()
      }

      is QuantumMember -> {
        for (child in element.children) {
          when (child) {
            is QuantumVariableName -> holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
              .textAttributes(DefaultLanguageHighlighterColors.INSTANCE_FIELD)
              .range(child)
              .create()

            is QuantumFunctionCall -> for (child2 in child.children) {
              if (child2 is QuantumFuncName)
                holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
                  .textAttributes(DefaultLanguageHighlighterColors.FUNCTION_CALL)
                  .range(child2)
                  .create()
            }

            else -> holder.newSilentAnnotation(HighlightSeverity.TEXT_ATTRIBUTES)
              .textAttributes(DefaultLanguageHighlighterColors.INSTANCE_FIELD)
              .range(child)
              .create()
          }
        }
      }
    }

    for (child in element.children) {
      if (child != null) {
        if (child is PsiErrorElement) {
          holder.newAnnotation(
            HighlightSeverity.ERROR, """
                                Parsing error ${child.errorDescription}: ${child.text.prependIndent("  ")}
                            """.trimIndent()
          )
            .range(child)
            .create()
          continue
        }
        annotate(child, holder)
      }
    }
  }
}
