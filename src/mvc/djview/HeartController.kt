package mvc.djview

class HeartController(var model: HeartModelInterface) : ControllerInterface {
    var view: DJView = DJView(this, HeartAdapter(model))

    init {
        view.createView()
        view.createControls()
        view.disableStopMenuItem()
        view.disableStartMenuItem()
    }

    override fun start() {}

    override fun stop() {}

    override fun increaseBPM() {}

    override fun decreaseBPM() {}

    override fun setBPM(bpm: Int) {}
}



