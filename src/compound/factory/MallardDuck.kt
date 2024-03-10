package compound.factory

class MallardDuck : Quackable {
    override fun quack() {
        println("Quack")
    }

    override fun toString(): String {
        return "Mallard Duck"
    }
}
