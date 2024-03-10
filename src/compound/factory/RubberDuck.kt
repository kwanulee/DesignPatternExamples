package compound.factory

class RubberDuck : Quackable {
    override fun quack() {
        println("Squeak")
    }

    override fun toString(): String {
        return "Rubber Duck"
    }
}
