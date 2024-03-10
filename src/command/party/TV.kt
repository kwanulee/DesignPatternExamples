package command.party

class TV(var location: String) {
    var channel: Int = 0

    fun on() {
        println("$location TV is on")
    }

    fun off() {
        println("$location TV is off")
    }

    fun setInputChannel() {
        this.channel = 3
        println("$location TV channel is set for DVD")
    }
}
