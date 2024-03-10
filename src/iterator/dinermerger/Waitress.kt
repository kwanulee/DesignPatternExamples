package iterator.dinermerger

class Waitress(var pancakeHouseMenu: PancakeHouseMenu, var dinerMenu: DinerMenu) {
    fun printMenu() {
        val pancakeIterator = pancakeHouseMenu.createIterator()
        val dinerIterator = dinerMenu.createIterator()

        println("MENU\n----\nBREAKFAST")
        printMenu(pancakeIterator)
        println("\nLUNCH")
        printMenu(dinerIterator)
    }

    private fun printMenu(iterator: Iterator?) {
        while (iterator!!.hasNext()) {
            val menuItem = iterator.next()
            print(menuItem?.name + ", ")
            print(menuItem?.price.toString() + " -- ")
            println(menuItem?.description)
        }
    }

    fun printMenu2() {
        val pancakeHouseMenu = PancakeHouseMenu()
        val breakfastItems: ArrayList<*>? = pancakeHouseMenu.menuItems

        val dinerMenu = DinerMenu()
        val lunchItems = dinerMenu.menuItems

        for (i in breakfastItems!!.indices) {
            val menuItem = breakfastItems[i] as MenuItem
            print(menuItem.name + " ")
        }
        for (i in lunchItems!!.indices) {
            val menuItem = lunchItems!![i]
            print(menuItem?.name + " ")
        }
    }

    fun printVegetarianMenu() {
        printVegetarianMenu(pancakeHouseMenu.createIterator())
        printVegetarianMenu(dinerMenu.createIterator())
    }

    fun isItemVegetarian(name: String): Boolean {
        val breakfastIterator = pancakeHouseMenu.createIterator()
        if (isVegetarian(name, breakfastIterator)) {
            return true
        }
        val dinnerIterator = dinerMenu.createIterator()
        if (isVegetarian(name, dinnerIterator)) {
            return true
        }
        return false
    }


    private fun printVegetarianMenu(iterator: Iterator?) {
        while (iterator!!.hasNext()) {
            val menuItem = iterator.next()
            if (menuItem!!.isVegetarian) {
                print(menuItem.name)
                println("\t\t" + menuItem.price)
                println("\t" + menuItem.description)
            }
        }
    }

    private fun isVegetarian(name: String, iterator: Iterator?): Boolean {
        while (iterator!!.hasNext()) {
            val menuItem = iterator.next()
            if (menuItem?.name == name) {
                if (menuItem!!.isVegetarian) {
                    return true
                }
            }
        }
        return false
    }
}
