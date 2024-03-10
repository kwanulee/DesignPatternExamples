package compound.decorator

class DuckCall : Quackable {
    override fun quack() {
        println("Kwak")
    }

    override fun toString(): String {
        return "Duck Call"
    }
}
