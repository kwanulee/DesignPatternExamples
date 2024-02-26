package strategy.SimUDuckApp.Revision3

class RedheadDuck : Duck(), Flyable, Quackable {
    override fun display() {
        println("I'm a real Red Headed duck")
    }

    override fun fly() {
        println("I'm flying")
    }

    override fun quack() {
        println("Quack")
    }
}
