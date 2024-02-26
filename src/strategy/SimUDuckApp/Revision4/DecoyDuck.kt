package strategy.SimUDuckApp.Revision4

class DecoyDuck : Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = MuteQuack()
    }

    override fun display() {
        println("I'm a duck Decoy")
    }
}
