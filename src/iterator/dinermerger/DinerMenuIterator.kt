package iterator.dinermerger

class DinerMenuIterator(var items: Array<MenuItem?>) : Iterator {
    var position: Int = 0

    override fun next(): MenuItem? {
        val menuItem = items[position]
        position = position + 1
        return menuItem
    }

    override fun hasNext(): Boolean {
        return if (position >= items.size || items[position] == null) {
            false
        } else {
            true
        }
    }
}
