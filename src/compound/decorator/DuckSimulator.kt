package compound.decorator

class DuckSimulator {
    fun simulate() {
        val mallardDuck: Quackable = QuackCounter(MallardDuck())
        val redheadDuck: Quackable = QuackCounter(RedheadDuck())
        val duckCall: Quackable = QuackCounter(DuckCall())
        val rubberDuck: Quackable = QuackCounter(RubberDuck())
        val gooseDuck: Quackable = GooseAdapter(Goose())

        println("\nDuck Simulator: With Decorator")

        simulate(mallardDuck)
        simulate(redheadDuck)
        simulate(duckCall)
        simulate(rubberDuck)
        simulate(gooseDuck)

        println(
            "The ducks quacked " +
                    QuackCounter.quacks + " times"
        )
    }

    fun simulate(duck: Quackable) {
        duck.quack()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val simulator = DuckSimulator()
            simulator.simulate()
        }
    }
}
