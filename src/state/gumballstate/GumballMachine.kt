package state.gumballstate

class GumballMachine(numberGumballs: Int) {
    var soldOutState: State
    var noQuarterState: State
    var hasQuarterState: State
    var soldState: State

    var state: State? = null
    var count: Int = 0

    init {
        soldOutState = SoldOutState(this)
        noQuarterState = NoQuarterState(this)
        hasQuarterState = HasQuarterState(this)
        soldState = SoldState(this)

        this.count = numberGumballs
        state = if (numberGumballs > 0) {
            noQuarterState
        } else {
            soldOutState
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
