package compound.observer

class DuckSimulator {
    fun simulate(duckFactory: AbstractDuckFactory) {
        val redheadDuck = duckFactory.createRedheadDuck()
        val duckCall = duckFactory.createDuckCall()
        val rubberDuck = duckFactory.createRubberDuck()
        val gooseDuck: Quackable = GooseAdapter(Goose())

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

        println("\nDuck Simulator: With Observer")

        val quackologist = Quackologist()
        flockOfDucks.registerObserver(quackologist)

        simulate(flockOfDucks)

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
