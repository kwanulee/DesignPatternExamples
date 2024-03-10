package proxy.gumball

import java.rmi.Naming


fun main(args: Array<String>) {
    var gumballMachine: GumballMachineRemote? = null
    val count: Int

    if (args.size < 2) {
        println("GumballMachine <name> <inventory>")
        System.exit(1)
    }

    try {
        count = args[1].toInt()

        gumballMachine =
            GumballMachine(args[0], count)
        //		Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        Naming.rebind("gumballmachine", gumballMachine)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

