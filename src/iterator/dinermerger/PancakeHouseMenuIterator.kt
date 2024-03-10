package iterator.dinermerger

class PancakeHouseMenuIterator(var items: ArrayList<MenuItem>) : Iterator {
    var position: Int = 0

    override fun next(): MenuItem? {
        val item = items[position]
        position = position + 1
        return item
    }

    override fun hasNext(): Boolean {
        return if (position >= items.size) {
            false
        } else {
            true
        }
    }
}
