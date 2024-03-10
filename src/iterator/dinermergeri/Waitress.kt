package iterator.dinermergeri

class Waitress(var pancakeHouseMenu: Menu, var dinerMenu: Menu) {
    fun printMenu() {
        val pancakeIterator = pancakeHouseMenu.createIterator()
        val dinerIterator = dinerMenu.createIterator()

        println("MENU\n----\nBREAKFAST")
        printMenu(pancakeIterator)
        println("\nLUNCH")
        printMenu(dinerIterator)
    }

    private fun printMenu(iterator: Iterator<MenuItem?>?) {
        while (iterator!!.hasNext()) {
            val menuItem = iterator.next()
            print(menuItem?.name + ", ")
            print(menuItem?.price.toString() + " -- ")
            println(menuItem?.description)
        }
    }

    fun printVegetarianMenu() {
        println("\nVEGETARIAN MENU\n----\nBREAKFAST")
        printVegetarianMenu(pancakeHouseMenu.createIterator())
        println("\nLUNCH")
        printVegetarianMenu(dinerMenu.createIterator())
    }

    fun isItemVegetarian(name: String): Boolean {
        val pancakeIterator = pancakeHouseMenu.createIterator()
        if (isVegetarian(name, pancakeIterator)) {
            return true
        }
        val dinerIterator = dinerMenu.createIterator()
        if (isVegetarian(name, dinerIterator)) {
            return true
        }
        return false
    }


    private fun printVegetarianMenu(iterator: Iterator<MenuItem?>?) {
        while (iterator!!.hasNext()) {
            val menuItem = iterator.next()
            if (menuItem!!.isVegetarian) {
                print(menuItem.name)
                println("\t\t" + menuItem.price)
                println("\t" + menuItem.description)
            }
        }
    }

    private fun isVegetarian(name: String, iterator: Iterator<MenuItem?>?): Boolean {
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
