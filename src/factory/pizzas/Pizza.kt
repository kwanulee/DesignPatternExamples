package factory.pizzas

abstract class Pizza {
    var name: String? = null
    var dough: String? = null
    var sauce: String? = null
    var toppings: ArrayList<String> = ArrayList()

    fun prepare() {
        println("Preparing $name")
    }

    fun bake() {
        println("Baking $name")
    }

    fun cut() {
        println("Cutting $name")
    }

    fun box() {
        println("Boxing $name")
    }

    override fun toString(): String {
        // code to display pizza name and ingredients
        val display = StringBuffer()
        display.append("---- $name ----\n")
        display.append("\t" + dough + "\n")
        display.append("\t" + sauce + "\n")
        for (topping in toppings) {
            display.append("\t" + topping + "\n")
        }
        return display.toString()
    }
}

