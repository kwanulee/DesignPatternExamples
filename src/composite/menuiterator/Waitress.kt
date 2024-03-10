package composite.menuiterator

class Waitress(var allMenus: MenuComponent) {
    fun printMenu() {
        allMenus.print()
    }

    fun printVegetarianMenu() {
        val iterator = allMenus.createIterator()

        println("\nVEGETARIAN MENU\n----")
        while (iterator!!.hasNext()) {
            val menuComponent = iterator.next()
            try {
                if (menuComponent!!.isVegetarian) {
                    menuComponent.print()
                }
            } catch (e: UnsupportedOperationException) {
            }
        }
    }
}
