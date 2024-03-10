package templateMethod.sort

import java.util.*


fun main(args: Array<String>) {
    val ducks = arrayOf(
        Duck("Daffy", 8),
        Duck("Dewey", 2),
        Duck("Howard", 7),
        Duck("Louie", 2),
        Duck("Donald", 10),
        Duck("Huey", 2)
    )

    println("Before sorting:")
    display(ducks)

    Arrays.sort(ducks)

    println("\nAfter sorting:")
    display(ducks)
}

fun display(ducks: Array<Duck>) {
    for (d in ducks) {
        println(d)
    }
}

