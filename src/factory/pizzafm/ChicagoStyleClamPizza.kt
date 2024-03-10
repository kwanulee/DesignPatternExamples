package factory.pizzafm

class ChicagoStyleClamPizza : Pizza() {
    init {
        name = "Chicago Style Clam Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"

        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Frozen Clams from Chesapeake Bay")
    }

    public override fun cut() {
        println("Cutting the pizza into square slices")
    }
}
