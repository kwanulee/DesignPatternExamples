package compound.decorator

class QuackCounter(var duck: Quackable) : Quackable {
    override fun quack() {
        duck.quack()
        quacks++
    }

    override fun toString(): String {
        return duck.toString()
    }

    companion object {
        var quacks: Int = 0
    }
}
