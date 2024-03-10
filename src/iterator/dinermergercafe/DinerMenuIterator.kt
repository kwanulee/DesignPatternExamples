package iterator.dinermergercafe

class DinerMenuIterator(var list: Array<MenuItem?>) : Iterator<MenuItem?> {
    var position: Int = 0

    override fun next(): MenuItem? {
        val menuItem = list[position]
        position = position + 1
        return menuItem
    }

    override fun hasNext(): Boolean {
        return if (position >= list.size || list[position] == null) {
            false
        } else {
            true
        }
    }

    /*
    override fun remove() {
        check(position > 0) { "You can't remove an item until you've done at least one next()" }
        if (list[position - 1] != null) {
            for (i in position - 1 until (list.size - 1)) {
                list[i] = list[i + 1]
            }
            list[list.size - 1] = null
        }
    }

     */
}
