package composite.menuiterator

class Menu(override var name: String, override var description: String) : MenuComponent() {
    var iterator: Iterator<MenuComponent?>? = null
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


    override fun createIterator(): Iterator<MenuComponent?> {
        if (iterator == null) {
            iterator = CompositeIterator(menuComponents.iterator())
        }
        return iterator!!
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
            val menuComponent = iterator.next()
            menuComponent.print()
        }
    }
}
