package compound.adapter

class DuckSimulator {
    fun simulate() {
        val mallardDuck: Quackable = MallardDuck()
        val redheadDuck: Quackable = RedheadDuck()
        val duckCall: Quackable = DuckCall()
        val rubberDuck: Quackable = RubberDuck()
        val gooseDuck: Quackable = GooseAdapter(Goose())

        println("\nDuck Simulator: With Goose Adapter")

        simulate(mallardDuck)
        simulate(redheadDuck)
        simulate(duckCall)
        simulate(rubberDuck)
        simulate(gooseDuck)
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
