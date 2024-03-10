package adapter.iterenum

import java.util.*


fun main(args: Array<String>) {
    val v = Vector(Arrays.asList(*args))
    val iterator: Iterator<*> = EnumerationIterator(v.elements())
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}

