package strategy.SimUDuckApp.Revision4


fun main(args: Array<String>) {
    val ducks = ArrayList<Duck>()

    ducks.add(MallardDuck())
    ducks.add(RedheadDuck())
    ducks.add(RubberDuck())
    ducks.add(DecoyDuck())
    ducks.add(ModelDuck())

    for (d in ducks) {
        d.display()
        d.swim()
        d.performQuack()
        if (d is ModelDuck)
            d.flyBehavior = FlyRocketPowered()
        d.performFly()
        println()
    }
}

