package compound.factory

class DuckSimulator {
    fun simulate(duckFactory: AbstractDuckFactory) {
        val mallardDuck = duckFactory.createMallardDuck()
        val redheadDuck = duckFactory.createRedheadDuck()
        val duckCall = duckFactory.createDuckCall()
        val rubberDuck = duckFactory.createRubberDuck()
        val gooseDuck: Quackable = GooseAdapter(Goose())

        println("\nDuck Simulator: With Abstract Factory")

        simulate(mallardDuck)
        simulate(redheadDuck)
        simulate(duckCall)
        simulate(rubberDuck)
        simulate(gooseDuck)

        println(
            "The ducks quacked " +
                    QuackCounter.quacks +
                    " times"
        )
    }

    fun simulate(duck: Quackable?) {
        duck!!.quack()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val simulator = DuckSimulator()
            val duckFactory: AbstractDuckFactory = CountingDuckFactory()

            simulator.simulate(duckFactory)
        }
    }
}
