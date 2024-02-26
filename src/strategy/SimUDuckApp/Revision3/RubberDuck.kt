package strategy.SimUDuckApp.Revision3

class RubberDuck : Duck(), Quackable {
    override fun display() {
        println("I'm a rubber duckie")
    }

    override fun quack() {
        println("Squeak")
    }
}
