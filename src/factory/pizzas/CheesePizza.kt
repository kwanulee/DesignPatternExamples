package factory.pizzas

class CheesePizza : Pizza() {
    init {
        name = "Cheese Pizza"
        dough = "Regular Crust"
        sauce = "Marinara Pizza Sauce"
        toppings.add("Fresh Mozzarella")
        toppings.add("Parmesan")
    }
}
