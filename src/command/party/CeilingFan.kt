package command.party

class CeilingFan(var location: String) {
    var speed: Int = 0

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
        speed = OFF
        println("$location ceiling fan is off")
    }

    companion object {
        const val HIGH: Int = 3
        const val MEDIUM: Int = 2
        const val LOW: Int = 1
        const val OFF: Int = 0
    }
}
