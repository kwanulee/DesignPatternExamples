package compound.observer

class DecoyDuck : Quackable {
    var observable: Observable = Observable(this)

    override fun quack() {
        println("<< Silence >>")
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun toString(): String {
        return "Decoy Duck"
    }
}
