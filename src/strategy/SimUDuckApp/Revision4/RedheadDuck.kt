package strategy.SimUDuckApp.Revision4

class RedheadDuck : Duck() {
    init {
        flyBehavior = FlyWithWings()
        quackBehavior = Quack()
    }

    override fun display() {
        println("I'm a real Red Headed duck")
    }
}
