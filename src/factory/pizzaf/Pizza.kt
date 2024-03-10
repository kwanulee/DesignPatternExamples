package factory.pizzaf


abstract class Pizza(var ingredientFactory: PizzaIngredientFactory?) {
    var name: String? = null

    var dough: Dough? = null
    var sauce: Sauce? = null
    var veggies: Array<Veggies>? = null
    var cheese: Cheese? = null
    var pepperoni: Pepperoni? = null
    var clam: Clams? = null

    abstract fun prepare()

    fun bake() {
        println("Bake for 25 minutes at 350")
    }

    fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in official PizzaStore box")
    }

    override fun toString(): String {
        val result = StringBuffer()
        result.append("---- $name ----\n")
        if (dough != null) {
            result.append("\t")
            result.append(dough)
            result.append("\n")
        }
        if (sauce != null) {
            result.append("\t")
            result.append(sauce)
            result.append("\n")
        }
        if (cheese != null) {
            result.append("\t")
            result.append(cheese)
            result.append("\n")
        }
        if (veggies != null) {
            result.append("\t")
            for (i in veggies!!.indices) {
                result.append(veggies!![i])
                if (i < veggies!!.size - 1) {
                    result.append(", ")
                }
            }
            result.append("\n")
        }
        if (clam != null) {
            result.append("\t")
            result.append(clam)
            result.append("\n")
        }
        if (pepperoni != null) {
            result.append("\t")
            result.append(pepperoni)
            result.append("\n")
        }
        return result.toString()
    }
}
