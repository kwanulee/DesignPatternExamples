package state.gumballstatewinner_alternative

class NoQuarterState(var gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("You inserted a quarter")
        gumballMachine.state = gumballMachine.hasQuarterState
    }

    override fun ejectQuarter() {
        println("You haven't inserted a quarter")
    }

    override fun turnCrank() {
        println("You turned, but there's no quarter")
    }

    override fun dispense() {
        println("You need to pay first")
    }

    override fun toString(): String {
        return "waiting for quarter"
    }
}
