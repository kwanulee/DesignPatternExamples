package mvc.djview

interface BeatModelInterface {
    fun initialize()

    fun on()

    fun off()

    var bPM: Int

    fun registerObserver(o: BeatObserver)

    fun removeObserver(o: BeatObserver)

    fun registerObserver(o: BPMObserver)

    fun removeObserver(o: BPMObserver)
}
