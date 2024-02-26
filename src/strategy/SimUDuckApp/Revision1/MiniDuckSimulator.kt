package strategy.SimUDuckApp.Revision1


fun main() {
    val ducks = ArrayList<Duck>()

    ducks.add(MallardDuck())
    ducks.add(RedheadDuck())
    ducks.add(RubberDuck())
    ducks.add(DecoyDuck())

    for (d in ducks) {
        d.display()
        d.swim()
        d.quack()
        d.fly()
        println()
    }
}

