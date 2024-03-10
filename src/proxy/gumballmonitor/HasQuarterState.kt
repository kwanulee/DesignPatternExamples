package proxy.gumballmonitor

import java.util.*

class HasQuarterState(var gumballMachine: GumballMachine) : State {
    var randomWinner: Random = Random(System.currentTimeMillis())

    override fun insertQuarter() {
        println("You can't insert another quarter")
    }

	override fun ejectQuarter() {
		println("Quarter returned")
		gumballMachine.state = gumballMachine.noQuarterState
	}

	override fun turnCrank() {
		println("You turned...")
		val winner = randomWinner.nextInt(10)
		if ((winner == 0) && (gumballMachine.count > 1)) {
			gumballMachine.state = gumballMachine.winnerState
		} else {
			gumballMachine.state = gumballMachine.soldState
		}
	}

    override fun dispense() {
        println("No gumball dispensed")
    }

    override fun toString(): String {
        return "waiting for turn of crank"
    }

    companion object {
        private const val serialVersionUID = 2L
    }
}
