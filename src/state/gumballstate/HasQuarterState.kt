package state.gumballstate

class HasQuarterState(var gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("You can't insert another quarter")
    }

    override fun ejectQuarter() {
        println("Quarter returned")
        gumballMachine.state = gumballMachine.noQuarterState
    }

    override fun turnCrank() {
        println("You turned...")
        gumballMachine.state = gumballMachine.soldState
    }

    override fun dispense() {
        println("No gumball dispensed")
    }


    override fun toString(): String {
        return "waiting for turn of crank"
    }
}
