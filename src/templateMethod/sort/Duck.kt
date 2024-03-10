package templateMethod.sort

class Duck(var name: String, var weight: Int) : Comparable<Duck> {
    override fun toString(): String {
        return "$name weighs $weight"
    }

    override fun compareTo(`object`: Duck): Int {
        val otherDuck = `object`

        return if (this.weight < otherDuck.weight) {
            -1
        } else if (this.weight == otherDuck.weight) {
            0
        } else { // this.weight > otherDuck.weight
            1
        }
    }
}
