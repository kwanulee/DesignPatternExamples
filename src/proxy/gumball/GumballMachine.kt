package proxy.gumball

import java.rmi.RemoteException
import java.rmi.server.UnicastRemoteObject

class GumballMachine
    (location: String, numberGumballs: Int) : UnicastRemoteObject(), GumballMachineRemote {
    var soldOutState: State = SoldOutState(this)
    var noQuarterState: State = NoQuarterState(this)
    var hasQuarterState: State = HasQuarterState(this)
    var soldState: State = SoldState(this)
    var winnerState: State = WinnerState(this)

    @get:Throws(RemoteException::class)
    override var state: State? = soldOutState

    @get:Throws(RemoteException::class)
    override var count: Int = 0

    @get:Throws(RemoteException::class)
    override var location: String

    init {
        this.count = numberGumballs
        if (numberGumballs > 0) {
            state = noQuarterState
        }
        this.location = location
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

    fun refill(count: Int) {
        this.count = count
        state = noQuarterState
    }

    override fun toString(): String {
        val result = StringBuffer()
        result.append("\nMighty Gumball, Inc.")
        result.append("\nJava-enabled Standing Gumball Model #2014")
        result.append("\nInventory: $count gumball")
        if (count != 1) {
            result.append("s")
        }
        result.append("\n")
        result.append("Machine is $state\n")
        return result.toString()
    }

    companion object {
        private const val serialVersionUID = 2L
    }
}
