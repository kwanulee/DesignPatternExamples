package proxy.gumballmonitor

class GumballMonitor(var machine: GumballMachine) {
    fun report() {
        println("Gumball Machine: " + machine.location)
        println("Current inventory: " + machine.count + " gumballs")
        println("Current state: " + machine.state)
    }
}
