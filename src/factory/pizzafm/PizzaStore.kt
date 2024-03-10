package factory.pizzafm

abstract class PizzaStore {
    abstract fun createPizza(item: String): Pizza?

    fun orderPizza(type: String): Pizza? {
        val pizza = createPizza(type)
        println("--- Making a " + pizza?.name + " ---")
        pizza!!.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}
