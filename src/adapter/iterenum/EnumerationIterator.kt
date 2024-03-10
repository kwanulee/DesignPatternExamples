package adapter.iterenum

import java.util.*

class EnumerationIterator(var enumeration: Enumeration<*>) : MutableIterator<Any> {
    override fun hasNext(): Boolean {
        return enumeration.hasMoreElements()
    }

    override fun next(): Any {
        return enumeration.nextElement()
    }

    override fun remove() {
        throw UnsupportedOperationException()
    }
}
