package proxy.gumballmonitor


fun main(args: Array<String>) {
    var count = 0

    if (args.size < 2) {
        println("GumballMachine <name> <inventory>")
        System.exit(1)
    }

    try {
        count = args[1].toInt()
    } catch (e: Exception) {
        e.printStackTrace()
        System.exit(1)
    }
    val gumballMachine = GumballMachine(args[0], count)

    val monitor = GumballMonitor(gumballMachine)


    //		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
    monitor.report()
}
