package iterator.dinermerger

class MenuItem(
    var name: String,
    var description: String,
    var isVegetarian: Boolean,
    var price: Double
) {
    override fun toString(): String {
        return ("$name, $$price\n   $description")
    }
}
