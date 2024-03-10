package factory.pizzaf


class NYPizzaStore : PizzaStore() {
    override fun createPizza(item: String): Pizza? {
        var pizza: Pizza? = null
        val ingredientFactory: PizzaIngredientFactory =
            NYPizzaIngredientFactory()

        if (item == "cheese") {
            pizza = CheesePizza(ingredientFactory)
            pizza.name ="New York Style Cheese Pizza"
        } else if (item == "veggie") {
            pizza = VeggiePizza(ingredientFactory)
            pizza.name ="New York Style Veggie Pizza"
        } else if (item == "clam") {
            pizza = ClamPizza(ingredientFactory)
            pizza.name ="New York Style Clam Pizza"
        } else if (item == "pepperoni") {
            pizza = PepperoniPizza(ingredientFactory)
            pizza.name ="New York Style Pepperoni Pizza"
        }
        return pizza
    }
}
