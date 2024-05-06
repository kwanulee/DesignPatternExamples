package composite.menu

class Menu(private var name: String, private var description: String) : MenuComponent() {
    var menuComponents: ArrayList<MenuComponent> = ArrayList()

    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponents.remove(menuComponent)
    }

    override fun getChild(i: Int): MenuComponent {
        return menuComponents[i]
    }

    override fun getName(): String {
        return name
    }

    override fun getDescription(): String {
        return description
    }

    override fun print() {
        print("\n "+ name)
        println(", " + description)
        println("---------------------")

        val iterator: Iterator<MenuComponent> = menuComponents.iterator()
        while (iterator.hasNext()) {
            iterator.next().print()
        }
    }
}
