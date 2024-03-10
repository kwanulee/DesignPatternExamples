package factory.pizzafm

class NYPizzaStore : PizzaStore() {
    public override fun createPizza(item: String): Pizza? {
        return if (item == "cheese") {
            NYStyleCheesePizza()
        } else if (item == "veggie") {
            NYStyleVeggiePizza()
        } else if (item == "clam") {
            NYStyleClamPizza()
        } else if (item == "pepperoni") {
            NYStylePepperoniPizza()
        } else null
    }
}
