package compound.observer

class Observable(var duck: QuackObservable) : QuackObservable {
    var observers: ArrayList<Observer> = ArrayList()

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun notifyObservers() {
        val iterator: Iterator<Observer> = observers.iterator()
        while (iterator.hasNext()) {
            val observer = iterator.next()
            observer.update(duck)
        }
    }

    fun getObservers(): Iterator<Observer> {
        return observers.iterator()
    }
}
