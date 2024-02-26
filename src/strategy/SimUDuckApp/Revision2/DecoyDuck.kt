package strategy.SimUDuckApp.Revision2

class DecoyDuck : Duck() {
    override fun quack() {
        println("<< Silence >>")
    }

    override fun display() {
        println("I'm a duck Decoy")
    }

    override fun fly() {
        println("I can't fly")
    }
}
