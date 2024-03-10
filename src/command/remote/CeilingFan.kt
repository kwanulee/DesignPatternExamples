package command.remote

class CeilingFan(location: String) {
    var location: String = ""
    var speed: Int = 0

    init {
        this.location = location
    }

    fun high() {
        // turns the ceiling fan on to high
        speed = HIGH
        println("$location ceiling fan is on high")
    }

    fun medium() {
        // turns the ceiling fan on to medium
        speed = MEDIUM
        println("$location ceiling fan is on medium")
    }

    fun low() {
        // turns the ceiling fan on to low
        speed = LOW
        println("$location ceiling fan is on low")
    }

    fun off() {
        // turns the ceiling fan off
        speed = 0
        println("$location ceiling fan is off")
    }

    companion object {
        const val HIGH: Int = 2
        const val MEDIUM: Int = 1
        const val LOW: Int = 0
    }
}
