package compound.ducks

class DecoyDuck : Quackable {
    override fun quack() {
        println("<< Silence >>")
    }
}
