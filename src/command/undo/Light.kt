package command.undo

class Light(var location: String) {
    var level: Int = 0

    fun on() {
        level = 100
        println("Light is on")
    }

    fun off() {
        level = 0
        println("Light is off")
    }

    fun dim(level: Int) {
        this.level = level
        if (level == 0) {
            off()
        } else {
            println("Light is dimmed to $level%")
        }
    }
}
