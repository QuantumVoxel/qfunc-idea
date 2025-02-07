package dev.ultreon.quantum.qfunc

import com.intellij.icons.AllIcons
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class QuantumColorSettingsPage : ColorSettingsPage {
    companion object {
        private val DESCRIPTORS: Array<AttributesDescriptor> = arrayOf(
            AttributesDescriptor("Keyword", KEYWORD),
            AttributesDescriptor("Type", TYPE),
            AttributesDescriptor("Variable", VARIABLE),
            AttributesDescriptor("Function", FUNCTION),
            AttributesDescriptor("String", STRING),
            AttributesDescriptor("Comment", COMMENT),
            AttributesDescriptor("Parameter", PARAMETER),
            AttributesDescriptor("Field", FIELD),
            AttributesDescriptor("Number", NUMBER),
            AttributesDescriptor("Bad character", BAD_CHAR)
        )
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<ColorDescriptor> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    override fun getDisplayName(): String {
        return "Quantum Voxel Function"
    }

    override fun getIcon(): Icon? {
        return AllIcons.FileTypes.Text
    }

    override fun getHighlighter(): SyntaxHighlighter {
        return QuantumSyntaxHighlighter()
    }

    override fun getDemoText(): String {
        return "#input x y z dimension\n" +
                "#persist<block-entity> current_x current_y current_z state\n" +
                "\n" +
                "if \$state == 'init':\n" +
                "  \$current_x = @x + 1\n" +
                "  \$current_y = @y - 1\n" +
                "  \$current_z = @z + 1\n" +
                "  \$state = 'working'\n" +
                "\n" +
                "if \$state == 'stop':\n" +
                "  stop\n" +
                "\n" +
                "if \$state == 'stuck':\n" +
                "  stop\n" +
                "\n" +
                "\$block = dimension:get_block(x: \$current_x, y: \$current_y, z: \$current_z)\n" +
                "\n" +
                "if \$block:type is [#quantum:stones]:\n" +
                "  \$drops = \$block:drop()\n" +
                "  dimension:set_block(x: \$current_x, y: \$current_y, z: \$current_z, id: [quantum:air])\n" +
                "  \$current_z = \$current_z - 1\n" +
                "\n" +
                "  if \$current_z < @z - 1:\n" +
                "    \$current_z = @z + 1\n" +
                "    \$current_x = \$current_x - 1\n" +
                "\n" +
                "  if \$current_x < @x - 1:\n" +
                "    \$current_x = @x + 1\n" +
                "    \$current_y = \$current_y - 1\n" +
                "\n" +
                "  if \$current_y < @y - 64:\n" +
                "    \$state = 'stop'\n" +
                "    stop\n" +
                "else:\n" +
                "  \$state = 'stuck'\n"
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey>? {
        return null
    }
}