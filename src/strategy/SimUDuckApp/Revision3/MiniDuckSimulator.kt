package strategy.SimUDuckApp.Revision3


fun main() {
    val ducks = ArrayList<Duck>()
    val d: MallardDuck = MallardDuck()

    ducks.add(MallardDuck())
    ducks.add(RedheadDuck())
    ducks.add(RubberDuck())
    ducks.add(DecoyDuck())

    for (d in ducks) {
        d.display()
        d.swim()
        if (d is Quackable) (d as Quackable).quack()
        if (d is Flyable) (d as Flyable).fly()
        println()
    }
}

