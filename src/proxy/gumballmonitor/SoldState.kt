package proxy.gumballmonitor

class SoldState(var gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("Please wait, we're already giving you a gumball")
    }

    override fun ejectQuarter() {
        println("Sorry, you already turned the crank")
    }

    override fun turnCrank() {
        println("Turning twice doesn't get you another gumball!")
    }

    override fun dispense() {
        gumballMachine.releaseBall()
        try {
            if (gumballMachine.count > 0) {
                gumballMachine.state = gumballMachine.noQuarterState
            } else {
                println("Oops, out of gumballs!")
                gumballMachine.state = gumballMachine.soldOutState
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun toString(): String {
        return "dispensing a gumball"
    }

    companion object {
        private const val serialVersionUID = 2L
    }
}
