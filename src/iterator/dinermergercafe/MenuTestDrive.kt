package iterator.dinermergercafe

fun main(args: Array<String>) {
    val pancakeHouseMenu = PancakeHouseMenu()
    val dinerMenu = DinerMenu()
    val cafeMenu = CafeMenu()

    val menus: ArrayList<Menu> = ArrayList<Menu>()
    menus.add(pancakeHouseMenu)
    menus.add(dinerMenu)
    menus.add(cafeMenu)

    val waitress = Waitress(menus)

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

