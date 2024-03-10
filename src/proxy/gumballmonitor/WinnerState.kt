package proxy.gumballmonitor

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
        println("YOU'RE A WINNER! You get two gumballs for your quarter")
        try {
            if (gumballMachine.count == 0) {
                gumballMachine.state=gumballMachine.soldOutState
            } else {
                gumballMachine.releaseBall()
                if (gumballMachine.count > 0) {
                    gumballMachine.state= gumballMachine.noQuarterState
                } else {
                    println("Oops, out of gumballs!")
                    gumballMachine.state = gumballMachine.soldOutState
                }
            }
        }  catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun toString(): String {
        return "despensing two gumballs for your quarter, because YOU'RE A WINNER!"
    }

    companion object {
        private const val serialVersionUID = 2L
    }
}
