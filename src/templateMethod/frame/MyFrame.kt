package templateMethod.frame

import java.awt.Graphics
import javax.swing.JFrame

class MyFrame(title: String?) : JFrame(title) {
    init {
        this.defaultCloseOperation = EXIT_ON_CLOSE

        this.setSize(300, 300)
        this.isVisible = true
    }

    override fun paint(graphics: Graphics) {
        super.paint(graphics)
        val msg = "I rule!!"
        graphics.drawString(msg, 100, 100)
    }

    companion object {
        private const val serialVersionUID = 2L

        @JvmStatic
        fun main(args: Array<String>) {
            val myFrame = MyFrame("Head First Design Patterns")
        }
    }
}
