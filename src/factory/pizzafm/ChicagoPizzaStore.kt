package factory.pizzafm

class ChicagoPizzaStore : PizzaStore() {
    public override fun createPizza(item: String): Pizza? {
        return if (item == "cheese") {
            ChicagoStyleCheesePizza()
        } else if (item == "veggie") {
            ChicagoStyleVeggiePizza()
        } else if (item == "clam") {
            ChicagoStyleClamPizza()
        } else if (item == "pepperoni") {
            ChicagoStylePepperoniPizza()
        } else null
    }
}
