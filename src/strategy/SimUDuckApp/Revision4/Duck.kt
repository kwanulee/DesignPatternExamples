package strategy.SimUDuckApp.Revision4

abstract class Duck {
    var flyBehavior: FlyBehavior? = null
    var quackBehavior: QuackBehavior? = null

    fun swim() {
        println("All ducks float, even decoys!")
    }

    abstract fun display()

    fun performFly() {
        flyBehavior!!.fly()
    }

    fun performQuack() {
        quackBehavior!!.quack()
    }
}
