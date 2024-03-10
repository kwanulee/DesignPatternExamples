package facade.hometheater

class Screen(var description: String) {
    fun up() {
        println("$description going up")
    }

    fun down() {
        println("$description going down")
    }


    override fun toString(): String {
        return description
    }
}
