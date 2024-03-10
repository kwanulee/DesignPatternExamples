package compound.observer

class Flock : Quackable {
    var ducks: ArrayList<Quackable?> = ArrayList()

    fun add(duck: Quackable?) {
        ducks.add(duck)
    }

    override fun quack() {
        val iterator: Iterator<Quackable?> = ducks.iterator()
        while (iterator.hasNext()) {
            iterator.next()!!.quack()
        }
    }

    override fun registerObserver(observer: Observer) {
        val iterator: Iterator<Quackable?> = ducks.iterator()
        while (iterator.hasNext()) {
            iterator.next()!!.registerObserver(observer)
        }
    }

    override fun notifyObservers() {
        val iterator: Iterator<Quackable?> = ducks.iterator()
        while (iterator.hasNext()) {
            iterator.next()!!.notifyObservers()
        }
    }

    override fun toString(): String {
        return "Flock of Ducks"
    }
}
