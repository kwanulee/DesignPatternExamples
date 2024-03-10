package iterator.dinermergercafe

class Waitress(var menus: ArrayList<Menu>) {
    fun printMenu() {
        val menuIterator: Iterator<Menu> = menus.iterator()
        while (menuIterator.hasNext()) {
            printMenu(menuIterator.next().createIterator())
            println()
        }
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
        println("\nVEGETARIAN MENU\n---------------")
        val menuIterator: Iterator<*> = menus.iterator()
        while (menuIterator.hasNext()) {
            val menu = menuIterator.next() as Menu
            printVegetarianMenu(menu.createIterator())
        }
    }

    fun isItemVegetarian(name: String): Boolean {
        val menuIterator: Iterator<*> = menus.iterator()
        while (menuIterator.hasNext()) {
            val menu = menuIterator.next() as Menu
            val menuItemIterator = menu.createIterator()
            if (isVegetarian(name, menuItemIterator)) {
                return true
            }
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

