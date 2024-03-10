package compound.observer

interface QuackObservable {
    fun registerObserver(observer: Observer)
    fun notifyObservers()
}
