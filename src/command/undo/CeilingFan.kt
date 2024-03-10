package command.undo

class CeilingFan(var location: String) {
    var speed: Int

    init {
        speed = OFF
    }

    fun high() {
        speed = HIGH
        println("$location ceiling fan is on high")
    }

    fun medium() {
        speed = MEDIUM
        println("$location ceiling fan is on medium")
    }

    fun low() {
        speed = LOW
        println("$location ceiling fan is on low")
    }

    fun off() {
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
