package iterator.dinermerger

interface Iterator {
    fun hasNext(): Boolean
    fun next(): MenuItem?
}
