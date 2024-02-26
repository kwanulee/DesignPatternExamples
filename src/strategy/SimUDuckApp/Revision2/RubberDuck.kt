package strategy.SimUDuckApp.Revision2

class RubberDuck : Duck() {
    override fun quack() {
        println("Squeak")
    }

    override fun display() {
        println("I'm a rubber duckie")
    }

    override fun fly() {
        println("I can't fly")
    }
}
