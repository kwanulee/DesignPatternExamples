package factory.pizzafm

class ChicagoStyleCheesePizza : Pizza() {
    init {
        name = "Chicago Style Deep Dish Cheese Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"

        toppings.add("Shredded Mozzarella Cheese")
    }

    public override fun cut() {
        println("Cutting the pizza into square slices")
    }
}
