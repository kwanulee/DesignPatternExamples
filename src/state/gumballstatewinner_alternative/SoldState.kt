package state.gumballstatewinner_alternative

import java.util.*

class SoldState(var gumballMachine: GumballMachine) : State {
    var randomWinner: Random = Random(System.currentTimeMillis())

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
        val winner = randomWinner.nextInt(10)
        if ((winner == 0) && (gumballMachine.count > 1)) {
            gumballMachine.releaseBall()
            println("YOU'RE A WINNER! You got two gumballs for your quarter")
        }
        if (gumballMachine.count > 0) {
            gumballMachine.state = gumballMachine.noQuarterState
        } else {
            println("Oops, out of gumballs!")
            gumballMachine.state = gumballMachine.soldOutState
        }
    }

    override fun toString(): String {
        return "dispensing a gumball"
    }
}
