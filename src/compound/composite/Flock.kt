package compound.composite

class Flock : Quackable {
    var quackers: ArrayList<Quackable?> = ArrayList()

    fun add(quacker: Quackable?) {
        quackers.add(quacker)
    }

    override fun quack() {
        val iterator: Iterator<Quackable?> = quackers.iterator()
        while (iterator.hasNext()) {
            val quacker = iterator.next()
            quacker!!.quack()
        }
    }

    override fun toString(): String {
        return "Flock of Quackers"
    }
}
