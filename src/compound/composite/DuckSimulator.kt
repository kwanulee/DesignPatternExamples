package compound.composite

class DuckSimulator {
    fun simulate(duckFactory: AbstractDuckFactory) {
        val redheadDuck = duckFactory.createRedheadDuck()
        val duckCall = duckFactory.createDuckCall()
        val rubberDuck = duckFactory.createRubberDuck()
        val gooseDuck: Quackable = GooseAdapter(Goose())

        println("\nDuck Simulator: With Composite - Flocks")

        val flockOfDucks = Flock()

        flockOfDucks.add(redheadDuck)
        flockOfDucks.add(duckCall)
        flockOfDucks.add(rubberDuck)
        flockOfDucks.add(gooseDuck)

        val flockOfMallards = Flock()

        val mallardOne = duckFactory.createMallardDuck()
        val mallardTwo = duckFactory.createMallardDuck()
        val mallardThree = duckFactory.createMallardDuck()
        val mallardFour = duckFactory.createMallardDuck()

        flockOfMallards.add(mallardOne)
        flockOfMallards.add(mallardTwo)
        flockOfMallards.add(mallardThree)
        flockOfMallards.add(mallardFour)

        flockOfDucks.add(flockOfMallards)

        println("\nDuck Simulator: Whole Flock Simulation")
        simulate(flockOfDucks)

        println("\nDuck Simulator: Mallard Flock Simulation")
        simulate(flockOfMallards)

        println(
            """
The ducks quacked ${QuackCounter.quacks} times"""
        )
    }

    fun simulate(duck: Quackable) {
        duck.quack()
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
