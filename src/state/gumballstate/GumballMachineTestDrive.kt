package state.gumballstate

    fun main(args: Array<String>) {
        val gumballMachine = GumballMachine(2)

        println(gumballMachine)

        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()

        println(gumballMachine)

        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()
        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()

        gumballMachine.insertQuarter()
        gumballMachine.turnCrank()

        println(gumballMachine)
    }
