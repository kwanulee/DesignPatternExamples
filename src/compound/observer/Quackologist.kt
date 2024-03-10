package compound.observer

class Quackologist : Observer {
    override fun update(duck: QuackObservable) {
        println("Quackologist: $duck just quacked.")
    }

    override fun toString(): String {
        return "Quackologist"
    }
}
