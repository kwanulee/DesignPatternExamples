package decorator.starbuzz

class Soy(beverage: Beverage) : CondimentDecorator(beverage) {
    override var description: String
        get() = beverage.description + ", 두유"
        set(description) {
            super.description = description
        }

    override fun cost(): Double {
        return .15 + beverage.cost()
    }
}
