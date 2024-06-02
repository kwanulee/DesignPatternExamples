package mvc.djview

interface BeatModelInterface {
    fun initialize()

    fun on()

    fun off()

    fun getBPM(): Int

    fun setBPM(bpm:Int)

    fun registerObserver(o: BeatObserver)

    fun removeObserver(o: BeatObserver)

    fun registerObserver(o: BPMObserver)

    fun removeObserver(o: BPMObserver)
}
