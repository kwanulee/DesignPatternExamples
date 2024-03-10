package compound.observer

interface Observer {
    fun update(duck: QuackObservable)
}
