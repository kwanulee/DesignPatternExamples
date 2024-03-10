package compound.composite

class RedheadDuck : Quackable {
    override fun quack() {
        println("Quack")
    }

    override fun toString(): String {
        return "Redhead Duck"
    }
}
