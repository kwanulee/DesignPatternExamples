package proxy.virtualproxy

import java.awt.Component
import java.awt.Graphics
import java.net.URL
import javax.swing.Icon
import javax.swing.ImageIcon
import kotlin.concurrent.Volatile

internal class ImageProxy(val imageURL: URL?) : Icon {
    @Volatile
    var imageIcon: ImageIcon? = null
        @Synchronized set(value) {
            field = value;
        }
    var retrievalThread: Thread? = null
    var retrieving: Boolean = false

    override fun getIconWidth(): Int {
        return if (imageIcon != null) {
            imageIcon!!.iconWidth
        } else {
            800
        }
    }

    override fun getIconHeight(): Int {
        return if (imageIcon != null) {
            imageIcon!!.iconHeight
        } else {
            600
        }
    }


    override fun paintIcon(c: Component, g: Graphics, x: Int, y: Int) {
        if (imageIcon != null) {
            imageIcon!!.paintIcon(c, g, x, y)
        } else {
            g.drawString("Loading CD cover, please wait...", x + 300, y + 190)
            if (!retrieving) {
                retrieving = true

                retrievalThread = Thread {
                    try {
                        imageIcon = ImageIcon(imageURL, "CD Cover")
                        c.repaint()
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
                retrievalThread!!.start()
            }
        }
    }
}
