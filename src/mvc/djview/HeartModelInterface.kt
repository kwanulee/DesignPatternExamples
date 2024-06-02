package mvc.djview

interface HeartModelInterface {
    fun getHeartRate(): Int
    fun registerObserver(o: BeatObserver)
    fun removeObserver(o: BeatObserver)
    fun registerObserver(o: BPMObserver)
    fun removeObserver(o: BPMObserver)
}
