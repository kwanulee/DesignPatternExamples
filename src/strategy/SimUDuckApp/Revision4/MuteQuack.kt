package strategy.SimUDuckApp.Revision4

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("<< Silence >>")
    }
}
