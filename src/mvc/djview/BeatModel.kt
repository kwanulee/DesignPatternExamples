package mvc.djview

import javax.sound.midi.*

class BeatModel : BeatModelInterface, MetaEventListener {
    var sequencer: Sequencer? = null
    var beatObservers: ArrayList<BeatObserver> = ArrayList()
    var bpmObservers: ArrayList<BPMObserver> = ArrayList()

    var bpm: Int = 90
    var sequence: Sequence? = null
    var track: Track? = null

    override fun initialize() {
        setUpMidi()
        buildTrackAndStart()
    }

    override fun on() {
        sequencer!!.start()
        setBPM(90)
    }

    override fun off() {
        setBPM(0)
        sequencer!!.stop()
    }

    override fun setBPM(bpm: Int) {
        this.bpm = bpm
        sequencer!!.setTempoInBPM(getBPM().toFloat())
        notifyBPMObservers()
    }

    override fun getBPM() = bpm

    fun beatEvent() {
        notifyBeatObservers()
    }

    override fun registerObserver(o: BeatObserver) {
        beatObservers.add(o)
    }

    fun notifyBeatObservers() {
        for (i in beatObservers.indices) {
            beatObservers[i].updateBeat()
        }
    }

    override fun registerObserver(o: BPMObserver) {
        bpmObservers.add(o)
    }

    fun notifyBPMObservers() {
        for (i in bpmObservers.indices) {
            bpmObservers[i].updateBPM()
        }
    }

    override fun removeObserver(o: BeatObserver) {
        val i = beatObservers.indexOf(o)
        if (i >= 0) {
            beatObservers.removeAt(i)
        }
    }

    override fun removeObserver(o: BPMObserver) {
        val i = bpmObservers.indexOf(o)
        if (i >= 0) {
            bpmObservers.removeAt(i)
        }
    }

    /**
     * Invoked when a Sequencer has encountered and processed a MetaMessage in the Sequence it is processing.
     * @param message
     */
    override fun meta(message: MetaMessage) {
        if (message.type == 47) {
            beatEvent()
            sequencer!!.start()
            setBPM(getBPM())
        }
    }

    fun setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer()
            sequencer!!.open()

            if (!sequencer!!.addMetaEventListener(this)) println("addMetaEventListener(this) is failed")
            else println("addMetaEventListener(this) is success")
            sequence = Sequence(Sequence.PPQ, 4)
            track = sequence!!.createTrack()
            sequencer!!.setTempoInBPM(getBPM().toFloat())
            sequencer!!.setLoopCount(Sequencer.LOOP_CONTINUOUSLY)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun buildTrackAndStart() {
        val trackList = intArrayOf(35, 0, 46, 0)

        sequence!!.deleteTrack(null)
        track = sequence!!.createTrack()

        makeTracks(trackList)
        track!!.add(makeEvent(192, 9, 1, 0, 4))
        try {
            sequencer!!.sequence = sequence
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun makeTracks(list: IntArray) {
        for (i in list.indices) {
            val key = list[i]

            if (key != 0) {
                track!!.add(makeEvent(144, 9, key, 100, i))
                val midiEvent = makeEvent(128, 9, key, 100, i + 1)
                track!!.add(midiEvent)
                track!!.add(makeMetaEvent(midiEvent, i + 2))
            }
        }
    }

    private fun makeMetaEvent(midiEvent: MidiEvent?, tick: Int): MidiEvent? {
        var event: MidiEvent? = null

        try {
            val message = MetaMessage(
                47, midiEvent!!.message.message,
                midiEvent.message.length
            )
            event = MidiEvent(message, tick.toLong())
        } catch (e: InvalidMidiDataException) {
            e.printStackTrace()
        }

        return event
    }

    fun makeEvent(comd: Int, chan: Int, one: Int, two: Int, tick: Int): MidiEvent? {
        var event: MidiEvent? = null
        try {
            val a = ShortMessage()
            a.setMessage(comd, chan, one, two)
            event = MidiEvent(a, tick.toLong())
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return event
    }
}
