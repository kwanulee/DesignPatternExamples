package state.gumball

class GumballMachine(count: Int) {
    var state: Int = SOLD_OUT
    var count: Int = 0

    init {
        this.count = count
        if (count > 0) {
            state = NO_QUARTER
        }
    }

    fun insertQuarter() {
        if (state == HAS_QUARTER) {
            println("You can't insert another quarter")
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER
            println("You inserted a quarter")
        } else if (state == SOLD_OUT) {
            println("You can't insert a quarter, the machine is sold out")
        } else if (state == SOLD) {
            println("Please wait, we're already giving you a gumball")
        }
    }

    fun ejectQuarter() {
        if (state == HAS_QUARTER) {
            println("Quarter returned")
            state = NO_QUARTER
        } else if (state == NO_QUARTER) {
            println("You haven't inserted a quarter")
        } else if (state == SOLD) {
            println("Sorry, you already turned the crank")
        } else if (state == SOLD_OUT) {
            println("You can't eject, you haven't inserted a quarter yet")
        }
    }

    fun turnCrank() {
        if (state == SOLD) {
            println("Turning twice doesn't get you another gumball!")
        } else if (state == NO_QUARTER) {
            println("You turned but there's no quarter")
        } else if (state == SOLD_OUT) {
            println("You turned, but there are no gumballs")
        } else if (state == HAS_QUARTER) {
            println("You turned...")
            state = SOLD
            dispense()
        }
    }

    private fun dispense() {
        if (state == SOLD) {
            println("A gumball comes rolling out the slot")
            count = count - 1
            if (count == 0) {
                println("Oops, out of gumballs!")
                state = SOLD_OUT
            } else {
                state = NO_QUARTER
            }
        }
    }

    override fun toString(): String {
        val result = StringBuffer()
        result.append("\nMighty Gumball, Inc.")
        result.append("\nJava-enabled Standing Gumball Model #2004\n")
        result.append("Inventory: $count gumball")
        if (count != 1) {
            result.append("s")
        }
        result.append("\nMachine is ")
        if (state == SOLD_OUT) {
            result.append("sold out")
        } else if (state == NO_QUARTER) {
            result.append("waiting for quarter")
        } else if (state == HAS_QUARTER) {
            result.append("waiting for turn of crank")
        } else if (state == SOLD) {
            result.append("delivering a gumball")
        }
        result.append("\n")
        return result.toString()
    }

    companion object {
        const val SOLD_OUT: Int = 0
        const val NO_QUARTER: Int = 1
        const val HAS_QUARTER: Int = 2
        const val SOLD: Int = 3
    }
}


