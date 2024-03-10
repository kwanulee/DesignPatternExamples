package mvc.djview

import javax.swing.JProgressBar

class BeatBar : JProgressBar(), Runnable {
    var progressBar: JProgressBar? = null
    var thread: Thread = Thread(this)

    init {
        maximum = 100
        thread.start()
    }

    override fun run() {
        while (true) {
            var value = value
            value = (value * .75).toInt()
            setValue(value)
            repaint()
            try {
                Thread.sleep(50)
            } catch (e: Exception) {
            }
        }
    }

    companion object {
        private const val serialVersionUID = 2L
    }
}
