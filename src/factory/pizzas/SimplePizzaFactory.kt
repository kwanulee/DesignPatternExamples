package factory.pizzas

class SimplePizzaFactory {
    fun createPizza(type: String): Pizza? {
        var pizza: Pizza? = null

        if (type == "cheese") {
            pizza = CheesePizza()
        } else if (type == "pepperoni") {
            pizza = PepperoniPizza()
        } else if (type == "clam") {
            pizza = ClamPizza()
        } else if (type == "veggie") {
            pizza = VeggiePizza()
        }
        return pizza
    }
}
