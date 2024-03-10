package facade.hometheater

class Amplifier(var description: String) {
    var tuner: Tuner? = null
		set(value) {
			println("$description setting tuner to $value")
			field = value
		}

    var dvd: DvdPlayer? = null
		set(value) {
			println("$description setting tuner to $value")
			field = value
		}
    var cd: CdPlayer? = null
		set(value) {
			println("$description setting CD player to $value")
			field = value
		}

    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun setStereoSound() {
        println("$description stereo mode on")
    }

    fun setSurroundSound() {
        println("$description surround sound on (5 speakers, 1 subwoofer)")
    }

    fun setVolume(level: Int) {
        println("$description setting volume to $level")
    }


    override fun toString(): String {
        return description
    }
}
