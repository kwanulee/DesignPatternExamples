package factory.pizzas

class PizzaStore(var factory: SimplePizzaFactory) {
    fun orderPizza(type: String): Pizza? {
        val pizza = factory.createPizza(type)

        pizza!!.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }
}
