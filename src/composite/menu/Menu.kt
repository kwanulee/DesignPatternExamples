package composite.menu

class Menu(override var name: String, override var description: String) : MenuComponent() {
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

    override fun print() {
        print(
            """
    
    ${name}
    """.trimIndent()
        )
        println(", " + description)
        println("---------------------")

        val iterator: Iterator<MenuComponent> = menuComponents.iterator()
        while (iterator.hasNext()) {
            iterator.next().print()
        }
    }
}
