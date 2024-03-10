package mvc.djview

interface HeartModelInterface {
    val heartRate: Int
    fun registerObserver(o: BeatObserver)
    fun removeObserver(o: BeatObserver)
    fun registerObserver(o: BPMObserver)
    fun removeObserver(o: BPMObserver)
}
