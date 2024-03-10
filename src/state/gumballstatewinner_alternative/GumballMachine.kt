package state.gumballstatewinner_alternative

class GumballMachine(numberGumballs: Int) {
    var soldOutState: State
    var noQuarterState: State
    var hasQuarterState: State
    var soldState: State

    var state: State
    var count: Int

    init {
        soldOutState = SoldOutState(this)
        noQuarterState = NoQuarterState(this)
        hasQuarterState = HasQuarterState(this)
        soldState = SoldState(this)

		state = soldOutState
        this.count = numberGumballs
        if (numberGumballs > 0) {
            state = noQuarterState
        }
    }

    fun insertQuarter() {
        state!!.insertQuarter()
    }

    fun ejectQuarter() {
        state!!.ejectQuarter()
    }

    fun turnCrank() {
        state!!.turnCrank()
        state!!.dispense()
    }

    fun releaseBall() {
        println("A gumball comes rolling out the slot...")
        if (count != 0) {
            count = count - 1
        }
    }

    override fun toString(): String {
        val result = StringBuffer()
        result.append("\nMighty Gumball, Inc.")
        result.append("\nJava-enabled Standing Gumball Model #2004")
        result.append("\nInventory: $count gumball")
        if (count != 1) {
            result.append("s")
        }
        result.append("\n")
        result.append("Machine is $state\n")
        return result.toString()
    }
}
