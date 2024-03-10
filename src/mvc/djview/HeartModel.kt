package mvc.djview

import java.util.*

class HeartModel : HeartModelInterface, Runnable {
    var beatObservers: ArrayList<BeatObserver> = ArrayList()
    var bpmObservers: ArrayList<BPMObserver> = ArrayList()
    var time: Int = 1000
    var random: Random = Random(System.currentTimeMillis())
    var thread: Thread = Thread(this)

    init {
        thread.start()
    }

    override fun run() {
        var lastrate = -1

        while (true) {
            var change = random.nextInt(10)
            if (random.nextInt(2) == 0) {
                change = 0 - change
            }
            val rate = 60000 / (time + change)
            println("rate=$rate(time=$time,change=$change")
            if (rate < 120 && rate > 50) {
                time += change
                notifyBeatObservers()
                if (rate != lastrate) {
                    lastrate = rate
                    notifyBPMObservers()
                }
            }
            try {
                println("time=$time")
                Thread.sleep(time.toLong())
            } catch (e: Exception) {
            }
        }
    }

    override val heartRate: Int
        get() = 60000 / time

    override fun registerObserver(o: BeatObserver) {
        beatObservers.add(o)
    }

    override fun removeObserver(o: BeatObserver) {
        val i = beatObservers.indexOf(o)
        if (i >= 0) {
            beatObservers.removeAt(i)
        }
    }

    fun notifyBeatObservers() {
        for (i in beatObservers.indices) {
            println("HeartModel::notifyBeatObservers()")
            beatObservers[i].updateBeat()
        }
    }

    override fun registerObserver(o: BPMObserver) {
        bpmObservers.add(o)
    }

    override fun removeObserver(o: BPMObserver) {
        val i = bpmObservers.indexOf(o)
        if (i >= 0) {
            bpmObservers.removeAt(i)
        }
    }

    fun notifyBPMObservers() {
        for (i in bpmObservers.indices) {
            bpmObservers[i].updateBPM()
        }
    }
}
