package strategy.SimUDuckApp.Revision1

abstract class Duck {
    fun quack() {
        println("Quack")
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }

    abstract fun display()
    fun fly() {
        println("I'm flying")
    }
}
