package strategy.SimUDuckApp.Revision4

class RubberDuck : Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Squeak()
    }

    override fun display() {
        println("I'm a rubber duckie")
    }
}
