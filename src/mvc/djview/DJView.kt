package mvc.djview

import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.GridLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*

class DJView(var controller: ControllerInterface, model: BeatModelInterface) : ActionListener, BeatObserver,
    BPMObserver {
    var model: BeatModelInterface? = model

    override fun updateBPM() {
        if (model != null) {
            val bpm = model?.bPM
            if (bpm == 0) {
                if (bpmOutputLabel != null) {
                    bpmOutputLabel!!.text = "offline"
                }
            } else {
                if (bpmOutputLabel != null) {
                    bpmOutputLabel!!.text = "Current BPM: " + model?.bPM
                }
            }
        }
    }

    override fun updateBeat() {
        if (beatBar != null) {
            beatBar!!.value = 100
        }
    }

    var viewFrame: JFrame? = null
    var viewPanel: JPanel? = null
    var beatBar: BeatBar? = null
    var bpmOutputLabel: JLabel? = null
    var controlFrame: JFrame? = null

    fun createView() {
        // Create all Swing components here

        viewFrame = JFrame("View")
        viewFrame!!.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        viewFrame!!.size = Dimension(100, 80)

        bpmOutputLabel = JLabel("offline", SwingConstants.CENTER)
        beatBar = BeatBar()
        beatBar!!.value = 0

        viewPanel = JPanel(GridLayout(2, 1))
        viewPanel!!.add(beatBar)
        viewPanel!!.add(bpmOutputLabel)

        viewFrame!!.contentPane.add(viewPanel, BorderLayout.CENTER)
        viewFrame!!.pack()
        viewFrame!!.isVisible = true
    }

    var controlPanel: JPanel? = null
    var bpmLabel: JLabel? = null
    var bpmTextField: JTextField? = null
    var setBPMButton: JButton? = null
    var increaseBPMButton: JButton? = null
    var decreaseBPMButton: JButton? = null
    var menuBar: JMenuBar? = null
    var menu: JMenu? = null
    var startMenuItem: JMenuItem? = null
    var stopMenuItem: JMenuItem? = null

    init {
        model.registerObserver(this as BeatObserver)
        model.registerObserver(this as BPMObserver)
    }

    fun createControls() {
        // Create all Swing components here
        JFrame.setDefaultLookAndFeelDecorated(true)
        controlFrame = JFrame("Control")
        controlFrame!!.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        controlFrame!!.size = Dimension(100, 80)

        controlPanel = JPanel(GridLayout(3, 1))

        menuBar = JMenuBar()
        menu = JMenu("DJ Control")
        startMenuItem = JMenuItem("Start")
        menu!!.add(startMenuItem)
        startMenuItem!!.addActionListener { controller.start() }
        stopMenuItem = JMenuItem("Stop")
        menu!!.add(stopMenuItem)
        stopMenuItem!!.addActionListener { controller.stop() }
        val exit = JMenuItem("Quit")
        exit.addActionListener { System.exit(0) }

        menu!!.add(exit)
        menuBar!!.add(menu)
        controlFrame!!.jMenuBar = menuBar

        bpmTextField = JTextField(2)
        bpmLabel = JLabel("Enter BPM:", SwingConstants.RIGHT)
        setBPMButton = JButton("Set")
        setBPMButton!!.size = Dimension(10, 40)
        increaseBPMButton = JButton(">>")
        decreaseBPMButton = JButton("<<")
        setBPMButton!!.addActionListener(this)
        increaseBPMButton!!.addActionListener(this)
        decreaseBPMButton!!.addActionListener(this)

        val buttonPanel = JPanel(GridLayout(1, 2))

        buttonPanel.add(decreaseBPMButton)
        buttonPanel.add(increaseBPMButton)

        val enterPanel = JPanel(GridLayout(1, 2))
        enterPanel.add(bpmLabel)
        enterPanel.add(bpmTextField)


        controlPanel!!.add(enterPanel)
        controlPanel!!.add(setBPMButton)
        controlPanel!!.add(buttonPanel)

        bpmLabel!!.border = BorderFactory.createEmptyBorder(5, 5, 5, 5)
        bpmOutputLabel!!.border = BorderFactory.createEmptyBorder(5, 5, 5, 5)

        controlFrame!!.rootPane.defaultButton = setBPMButton
        controlFrame!!.contentPane.add(controlPanel, BorderLayout.CENTER)

        controlFrame!!.pack()
        controlFrame!!.isVisible = true
    }

    fun enableStopMenuItem() {
        stopMenuItem!!.isEnabled = true
    }

    fun disableStopMenuItem() {
        stopMenuItem!!.isEnabled = false
    }

    fun enableStartMenuItem() {
        startMenuItem!!.isEnabled = true
    }

    fun disableStartMenuItem() {
        startMenuItem!!.isEnabled = false
    }

    override fun actionPerformed(event: ActionEvent) {
        if (event.source === setBPMButton) {
            val bpm = bpmTextField!!.text.toInt()
            controller.setBPM(bpm)
        } else if (event.source === increaseBPMButton) {
            controller.increaseBPM()
        } else if (event.source === decreaseBPMButton) {
            controller.decreaseBPM()
        }
    }
}
