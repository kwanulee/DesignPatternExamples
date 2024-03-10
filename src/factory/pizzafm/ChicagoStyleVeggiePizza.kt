package factory.pizzafm

class ChicagoStyleVeggiePizza : Pizza() {
    init {
        name = "Chicago Deep Dish Veggie Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"

        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Black Olives")
        toppings.add("Spinach")
        toppings.add("Eggplant")
    }

    public override fun cut() {
        println("Cutting the pizza into square slices")
    }
}
