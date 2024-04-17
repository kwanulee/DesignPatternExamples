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
}
fun main(args: Array<String>) {
    val myFrame = MyFrame("Head First Design Patterns")
}