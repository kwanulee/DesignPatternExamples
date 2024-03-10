package compound.observer

class RubberDuck : Quackable {
    var observable: Observable = Observable(this)

    override fun quack() {
        println("Squeak")
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun toString(): String {
        return "Rubber Duck"
    }
}
