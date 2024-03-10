package proxy.gumball

import java.rmi.RemoteException

class GumballMonitor(var machine: GumballMachineRemote) {
    fun report() {
        try {
            println("Gumball Machine: " + machine.location)
            println("Current inventory: " + machine.count + " gumballs")
            println("Current state: " + machine.state)
        } catch (e: RemoteException) {
            e.printStackTrace()
        }
    }
}
