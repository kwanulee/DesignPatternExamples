package strategy.SimUDuckApp.Revision3

class MallardDuck : Duck(), Flyable, Quackable {
    override fun display() {
        println("I'm a real Mallard duck")
    }

    override fun fly() {
        println("I'm flying")
    }

    override fun quack() {
        println("Quack")
    }
}
