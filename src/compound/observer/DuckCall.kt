package compound.observer

class DuckCall : Quackable {
    var observable: Observable = Observable(this)

    override fun quack() {
        println("Kwak")
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun toString(): String {
        return "Duck Call"
    }
}
