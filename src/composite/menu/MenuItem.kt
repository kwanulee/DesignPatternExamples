package composite.menu

class MenuItem(
    override var name: String,
    override var description: String,
    override var isVegetarian: Boolean,
    override var price: Double
) : MenuComponent() {
    override fun print() {
        print("  " + name)
        if (isVegetarian) {
            print("(v)")
        }
        println(", " + price)
        println("     -- " + description)
    }
}
