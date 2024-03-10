package proxy.virtualproxy

import java.awt.event.ActionEvent
import java.net.MalformedURLException
import java.net.URL
import java.util.*
import javax.swing.*

class ImageProxyTestDrive {
    var imageComponent: ImageComponent
    var frame: JFrame = JFrame("CD Cover Viewer")
    var menuBar: JMenuBar
    var menu: JMenu
    var cds: Hashtable<String, String> = Hashtable()

    init {
        cds["Buddha Bar"] = "http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg"
        cds["Ima"] = "http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg"
        cds["Karma"] = "http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif"
        cds["MCMXC A.D."] = "http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg"
        cds["Northern Exposure"] = "http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg"
        cds["Selected Ambient Works, Vol. 2"] = "http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg"

        val initialURL = URL(cds["Selected Ambient Works, Vol. 2"])
        menuBar = JMenuBar()
        menu = JMenu("Favorite CDs")
        menuBar.add(menu)
        frame.jMenuBar = menuBar

        // set up frame and menus
        val icon: Icon = ImageProxy(initialURL)
        imageComponent = ImageComponent(icon)
        frame.contentPane.add(imageComponent)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(800, 600)
        frame.isVisible = true


        val e = cds.keys()
        while (e.hasMoreElements()) {
            val name = e.nextElement() as String
            val menuItem = JMenuItem(name)
            menu.add(menuItem)
            menuItem.addActionListener { event: ActionEvent ->
                imageComponent.setIcon(ImageProxy(getCDUrl(event.actionCommand)))
                frame.repaint()
            }
        }

    }

    fun getCDUrl(name: String): URL? {
        try {
            return URL(cds[name])
        } catch (e: MalformedURLException) {
            e.printStackTrace()
            return null
        }
    }

    companion object {
        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            val testDrive = ImageProxyTestDrive()
        }
    }
}
