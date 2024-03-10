package compound.factory

class DecoyDuck : Quackable {
    override fun quack() {
        println("<< Silence >>")
    }

    override fun toString(): String {
        return "Decoy Duck"
    }
}
