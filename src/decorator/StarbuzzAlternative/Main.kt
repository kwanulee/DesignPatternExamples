package decorator.StarbuzzAlternative


fun main(args: Array<String>) {
    val beverage: Beverage = Espresso()
    println(
        beverage.description
                + " $" + beverage.cost()
    )

    val beverage2: Beverage = DarkRoast()
    beverage2.mocha = true
    beverage2.whip = true
    println(
        beverage2.description
                + " $" + beverage2.cost()
    )

    val beverage3: Beverage = HouseBlend()
    beverage3.soy = true
    beverage3.mocha = true
    beverage3.whip = true
    println(
        beverage3.description
                + " $" + beverage3.cost()
    )
}

