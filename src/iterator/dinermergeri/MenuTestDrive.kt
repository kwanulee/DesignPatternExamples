package iterator.dinermergeri


fun main(args: Array<String>) {
    val pancakeHouseMenu = PancakeHouseMenu()
    val dinerMenu = DinerMenu()
    val waitress = Waitress(pancakeHouseMenu, dinerMenu)
    waitress.printMenu()
    waitress.printVegetarianMenu()

    println("\nCustomer asks, is the Hotdog vegetarian?")
    print("Waitress says: ")
    if (waitress.isItemVegetarian("Hotdog")) {
        println("Yes")
    } else {
        println("No")
    }
    println("\nCustomer asks, are the Waffles vegetarian?")
    print("Waitress says: ")
    if (waitress.isItemVegetarian("Waffles")) {
        println("Yes")
    } else {
        println("No")
    }
}

