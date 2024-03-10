package adapter.iterenum

import java.util.*

class IteratorEnumeration(var iterator: Iterator<*>) : Enumeration<Any> {
    override fun hasMoreElements(): Boolean {
        return iterator.hasNext()
    }

    override fun nextElement(): Any {
        return iterator.next()!!
    }
}
