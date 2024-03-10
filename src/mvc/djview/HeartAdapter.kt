package mvc.djview

class HeartAdapter(var heart: HeartModelInterface) : BeatModelInterface {
    override fun initialize() {}

    override fun on() {}

    override fun off() {}

    override var bPM: Int
        get() = heart.heartRate
        set(bpm) {}

    override fun registerObserver(o: BeatObserver) {
        heart.registerObserver(o)
    }

    override fun removeObserver(o: BeatObserver) {
        heart.removeObserver(o)
    }

    override fun registerObserver(o: BPMObserver) {
        heart.registerObserver(o)
    }

    override fun removeObserver(o: BPMObserver) {
        heart.removeObserver(o)
    }
}
