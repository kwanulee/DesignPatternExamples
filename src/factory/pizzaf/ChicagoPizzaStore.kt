package factory.pizzaf


class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(item: String): Pizza? {
        var pizza: Pizza? = null
        val ingredientFactory: PizzaIngredientFactory =
            ChicagoPizzaIngredientFactory()

        if (item == "cheese") {
            pizza = CheesePizza(ingredientFactory)
            pizza.name ="Chicago Style Cheese Pizza"
        } else if (item == "veggie") {
            pizza = VeggiePizza(ingredientFactory)
            pizza.name ="Chicago Style Veggie Pizza"
        } else if (item == "clam") {
            pizza = ClamPizza(ingredientFactory)
            pizza.name ="Chicago Style Clam Pizza"
        } else if (item == "pepperoni") {
            pizza = PepperoniPizza(ingredientFactory)
            pizza.name ="Chicago Style Pepperoni Pizza"
        }
        return pizza
    }
}
