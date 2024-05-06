package composite.menu

class MenuItem(
    private var name: String,
    private var description: String,
    private var isVegetarian: Boolean,
    private var price: Double
) : MenuComponent() {

    override fun getName(): String {
        return name
    }
    override fun getDescription(): String {
        return description
    }
    override fun getPrice(): Double {
        return price
    }
    override fun isVegetarian(): Boolean {
        return isVegetarian
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
