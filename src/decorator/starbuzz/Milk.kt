package decorator.starbuzz

class Milk(beverage: Beverage) : CondimentDecorator(beverage) {
    override var description: String
        get() = beverage.description + ", 밀크"
        set(description) {
            super.description = description
        }

    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}
