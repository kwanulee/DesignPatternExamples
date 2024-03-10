package templateMethod.barista


fun main(args: Array<String>) {
    val tea = Tea()
    val coffee = Coffee()

    println("\nMaking tea...")
    tea.prepareRecipe()

    println("\nMaking coffee...")
    coffee.prepareRecipe()


    val teaHook = TeaWithHook()
    val coffeeHook = CoffeeWithHook()

    println("\nMaking tea...")
    teaHook.prepareRecipe()

    println("\nMaking coffee...")
    coffeeHook.prepareRecipe()
}

