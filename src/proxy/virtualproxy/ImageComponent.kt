package proxy.virtualproxy

import java.awt.Graphics
import javax.swing.Icon
import javax.swing.JComponent

class ImageComponent(private var icon: Icon) : JComponent() {
    fun setIcon(icon: Icon) {
        this.icon = icon
    }

    public override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        val w = icon.iconWidth
        val h = icon.iconHeight
        val x = (800 - w) / 2
        val y = (600 - h) / 2
        icon.paintIcon(this, g, x, y)
    }

    companion object {
        private const val serialVersionUID = 1L
    }
}
