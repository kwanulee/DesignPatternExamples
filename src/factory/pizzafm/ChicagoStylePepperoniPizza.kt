package factory.pizzafm

class ChicagoStylePepperoniPizza : Pizza() {
    init {
        name = "Chicago Style Pepperoni Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"

        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Black Olives")
        toppings.add("Spinach")
        toppings.add("Eggplant")
        toppings.add("Sliced Pepperoni")
    }

    public override fun cut() {
        println("Cutting the pizza into square slices")
    }
}
