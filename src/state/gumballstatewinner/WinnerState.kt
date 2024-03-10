package state.gumballstatewinner

class WinnerState(var gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("Please wait, we're already giving you a Gumball")
    }

    override fun ejectQuarter() {
        println("Please wait, we're already giving you a Gumball")
    }

    override fun turnCrank() {
        println("Turning again doesn't get you another gumball!")
    }

    override fun dispense() {
        println("YOU'RE A WINNER! You got two gumballs for your quarter")
        gumballMachine.releaseBall()
        gumballMachine.releaseBall()
        if (gumballMachine.count == 0) {
            gumballMachine.state = gumballMachine.soldOutState
        } else {
            gumballMachine.state = gumballMachine.noQuarterState
        }
    }

    override fun toString(): String {
        return "despensing two gumballs for your quarter, because YOU'RE A WINNER!"
    }
}
