package state.gumballstate

class SoldOutState(gumballMachine: GumballMachine?) : State {
    var gumballMachine: GumballMachine? = null

    override fun insertQuarter() {
    }

    override fun ejectQuarter() {
    }

    override fun turnCrank() {
    }

    override fun dispense() {
    }

    override fun toString(): String {
        return "sold out"
    }
}
