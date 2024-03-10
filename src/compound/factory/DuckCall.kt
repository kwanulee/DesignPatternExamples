package compound.factory

class DuckCall : Quackable {
    override fun quack() {
        println("Kwak")
    }

    override fun toString(): String {
        return "Duck Call"
    }
}
