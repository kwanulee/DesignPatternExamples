package facade.hometheater

class Projector(var description: String, var dvdPlayer: DvdPlayer) {
    fun on() {
        println("$description on")
    }

    fun off() {
        println("$description off")
    }

    fun wideScreenMode() {
        println("$description in widescreen mode (16x9 aspect ratio)")
    }

    fun tvMode() {
        println("$description in tv mode (4x3 aspect ratio)")
    }

    override fun toString(): String {
        return description
    }
}
