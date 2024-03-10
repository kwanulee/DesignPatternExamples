package adapter.iterenum

import java.util.*

fun main(args: Array<String>) {
    val l = ArrayList(Arrays.asList(*args))
    val enumeration: Enumeration<*> = IteratorEnumeration(l.iterator())
    while (enumeration.hasMoreElements()) {
        println(enumeration.nextElement())
    }
}

