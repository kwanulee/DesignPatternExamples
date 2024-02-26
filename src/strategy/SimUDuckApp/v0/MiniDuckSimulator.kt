package strategy.SimUDuckApp.v0

object MiniDuckSimulator {
    @JvmStatic
    fun main(args: Array<String>) {
        val ducks = ArrayList<Duck>()

        ducks.add(MallardDuck())
        ducks.add(RedheadDuck())

        for (d in ducks) {
            d.display()
            d.swim()
            d.quack()
            println()
        }
    }
}
