package proxy.gumball

import java.rmi.Naming


fun main(args: Array<String>) {
    val location: String
    if (args.size > 0) {
        location = "rmi://" + args[0] + "/gumballmachine"

        var monitor: GumballMonitor? = null
        try {
            val machine =
                Naming.lookup(location) as GumballMachineRemote
            monitor = GumballMonitor(machine)
            println(monitor)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        monitor!!.report()
    }
}
