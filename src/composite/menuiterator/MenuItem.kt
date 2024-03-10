package composite.menuiterator

class MenuItem(
    override var name: String,
    override var description: String,
    override var isVegetarian: Boolean,
    override var price: Double
) : MenuComponent() {
    override fun createIterator(): Iterator<MenuComponent?> {
        return NullIterator()
    }

    override fun print() {
        print("  " + name)
        if (isVegetarian) {
            print("(v)")
        }
        println(", " + price)
        println("     -- " + description)
    }
}

