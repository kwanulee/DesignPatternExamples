package strategy.SimUDuckApp.v0

abstract class Duck {
    fun quack() {
        println("Quack")
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }

    abstract fun display()
}
