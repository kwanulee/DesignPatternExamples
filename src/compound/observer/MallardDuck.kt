package compound.observer

class MallardDuck : Quackable {
    var observable: Observable = Observable(this)

    override fun quack() {
        println("Quack")
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun toString(): String {
        return "Mallard Duck"
    }
}
