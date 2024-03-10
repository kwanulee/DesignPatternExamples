package composite.menu

class Waitress(var allMenus: MenuComponent) {
    fun printMenu() {
        allMenus.print()
    }
}
