package compound.observer

class QuackCounter(var duck: Quackable) : Quackable {
    override fun quack() {
        duck.quack()
        quacks++
    }

    override fun registerObserver(observer: Observer) {
        duck.registerObserver(observer)
    }

    override fun notifyObservers() {
        duck.notifyObservers()
    }

    override fun toString(): String {
        return duck.toString()
    }

    companion object {
        var quacks: Int = 0
    }
}
