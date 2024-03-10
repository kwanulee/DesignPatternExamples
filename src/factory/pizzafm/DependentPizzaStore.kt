package factory.pizzafm

class DependentPizzaStore {
    fun createPizza(style: String, type: String): Pizza? {
        var pizza: Pizza? = null
        if (style == "NY") {
            if (type == "cheese") {
                pizza = NYStyleCheesePizza()
            } else if (type == "veggie") {
                pizza = NYStyleVeggiePizza()
            } else if (type == "clam") {
                pizza = NYStyleClamPizza()
            } else if (type == "pepperoni") {
                pizza = NYStylePepperoniPizza()
            }
        } else if (style == "Chicago") {
            if (type == "cheese") {
                pizza = ChicagoStyleCheesePizza()
            } else if (type == "veggie") {
                pizza = ChicagoStyleVeggiePizza()
            } else if (type == "clam") {
                pizza = ChicagoStyleClamPizza()
            } else if (type == "pepperoni") {
                pizza = ChicagoStylePepperoniPizza()
            }
        } else {
            println("Error: invalid type of pizza")
            return null
        }
        pizza!!.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}
