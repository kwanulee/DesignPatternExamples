package state.gumballstatewinner_alternative

class HasQuarterState(//	Random randomWinner = new Random(System.currentTimeMillis());
    var gumballMachine: GumballMachine
) : State {
    override fun insertQuarter() {
        println("You can't insert another quarter")
    }

    override fun ejectQuarter() {
        println("Quarter returned")
        gumballMachine.state = gumballMachine.noQuarterState
    }

    override fun turnCrank() {
        println("You turned...")
        //		int winner = randomWinner.nextInt(10);
//		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
//			gumballMachine.setState(gumballMachine.getWinnerState());
//		} else {
        gumballMachine.state = gumballMachine.soldState
        //		}
    }

    override fun dispense() {
        println("No gumball dispensed")
    }

    override fun toString(): String {
        return "waiting for turn of crank"
    }
}
