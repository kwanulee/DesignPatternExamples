package compound.ducks

class DuckSimulator {
    fun simulate() {
        val mallardDuck: Quackable = MallardDuck()
        val redheadDuck: Quackable = RedheadDuck()
        val duckCall: Quackable = DuckCall()
        val rubberDuck: Quackable = RubberDuck()

        println("\nDuck Simulator")

        simulate(mallardDuck)
        simulate(redheadDuck)
        simulate(duckCall)
        simulate(rubberDuck)
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
