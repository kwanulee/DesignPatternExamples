package strategy.SimUDuckApp.Revision2

abstract class Duck {
    open fun quack() {
        println("Quack")
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }

    abstract fun display()
    open fun fly() {
        println("I'm flying")
    }
}
