package factory.pizzas


fun main(args: Array<String>) {
    val factory = SimplePizzaFactory()
    val store: PizzaStore = PizzaStore(factory)

    var pizza = store.orderPizza("cheese")
    println("We ordered a $pizza\n")

    //System.out.println(pizza);
    pizza = store.orderPizza("veggie")
    println("We ordered a $pizza\n")
    //System.out.println(pizza);
}

