package adapter.iterenum

import java.util.*


fun main(args: Array<String>) {
    val v = Vector(Arrays.asList(*args))
    val enumeration = v.elements()
    while (enumeration.hasMoreElements()) {
        println(enumeration.nextElement())
    }
    val iterator: Iterator<String> = v.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}

