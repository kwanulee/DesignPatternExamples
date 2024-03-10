package decorator.StarbuzzAlternative

class Decaf : Beverage() {
    init {
        description = "디카페인 커피"
    }

    override fun cost(): Double {
        return 1.05 + super.cost()
    }
}
