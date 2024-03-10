package compound.observer

class GooseAdapter(var goose: Goose) : Quackable {
    var observable: Observable = Observable(this)

    override fun quack() {
        goose.honk()
        notifyObservers()
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObservers() {
        observable.notifyObservers()
    }

    override fun toString(): String {
        return "Goose pretending to be a Duck"
    }
}
