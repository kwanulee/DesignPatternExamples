package compound.composite

class MallardDuck : Quackable {
    override fun quack() {
        println("Quack")
    }

    override fun toString(): String {
        return "Mallard Duck"
    }
}
