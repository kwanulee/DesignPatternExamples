package factory.pizzaf


class PepperoniPizza(ingredientFactory: PizzaIngredientFactory?) : Pizza(ingredientFactory) {
    public override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory!!.createDough()
        sauce = ingredientFactory!!.createSauce()
        cheese = ingredientFactory!!.createCheese()
        veggies = ingredientFactory!!.createVeggies()
        pepperoni = ingredientFactory!!.createPepperoni()
    }
}
