package iterator.dinermerger


fun main(args: Array<String>) {
    val pancakeHouseMenu = PancakeHouseMenu()
    val dinerMenu = DinerMenu()

    val waitress = Waitress(pancakeHouseMenu, dinerMenu)


    // Without iterators
    //printMenu();

    // With iterators
    waitress.printMenu()
}

/*
 * Without the Waitress, we need the code below...
 */
fun printMenu() {
    val pancakeHouseMenu = PancakeHouseMenu()
    val dinerMenu = DinerMenu()

    val breakfastItems = pancakeHouseMenu.menuItems
    val lunchItems = dinerMenu.menuItems


    // Hiding implementation
    println("USING FOR EACH")
    for (menuItem in breakfastItems) {
        print(menuItem.name)
        println("\t\t" + menuItem.price)
        println("\t" + menuItem.description)
    }
    for (menuItem in lunchItems) {
        print(menuItem?.name)
        println("\t\t" + menuItem?.price)
        println("\t" + menuItem?.description)
    }


    // Exposing implementation
    println("USING FOR LOOPS")
    for (i in breakfastItems.indices) {
        val menuItem = breakfastItems[i]
        print(menuItem.name)
        println("\t\t" + menuItem.price)
        println("\t" + menuItem.description)
    }

    for (i in lunchItems.indices) {
        val menuItem = lunchItems[i]
        print(menuItem?.name)
        println("\t\t" + menuItem?.price)
        println("\t" + menuItem?.description)
    }
}

