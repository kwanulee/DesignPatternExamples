package command.remote

class Light(location: String) {
    var location: String = ""

    init {
        this.location = location
    }

    fun on() {
        println("$location light is on")
    }

    fun off() {
        println("$location light is off")
    }
}
