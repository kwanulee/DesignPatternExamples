package factory.pizzafm

abstract class Pizza {
    var name: String? = null
    var dough: String? = null
    var sauce: String? = null
    var toppings: ArrayList<String> = ArrayList()

    fun prepare() {
        println("Prepare $name")
        //		System.out.println("Tossing dough...");
//		System.out.println("Adding sauce...");
//		System.out.println("Adding toppings: ");
//		for (String topping : toppings) {
//			System.out.println("   " + topping);
//		}
    }

    fun bake() {
        println("Bake for 25 minutes at 350")
    }

    open fun cut() {
        println("Cut the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in official PizzaStore box")
    }

    override fun toString(): String {
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



