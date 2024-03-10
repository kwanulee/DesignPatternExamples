package facade.hometheater

class Tuner(var description: String, amplifier: Amplifier?) {
    var amplifier: Amplifier? = null
    var frequency: Double = 0.0
		set(value) {
			println("$description setting frequency to $value")
			field = value
		}

    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }


    fun setAm() {
        println("$description setting AM mode")
    }

    fun setFm() {
        println("$description setting FM mode")
    }

    override fun toString(): String {
        return description
    }
}
