package facade.hometheater

class PopcornPopper(var description: String) {
    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun pop() {
        println("$description popping popcorn!")
    }


    override fun toString(): String {
        return description
    }
}
