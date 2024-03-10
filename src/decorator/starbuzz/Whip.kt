package decorator.starbuzz

class Whip(beverage: Beverage) : CondimentDecorator(beverage) {
    override var description: String
        get() = beverage.description + ",휘핑"
        set(description) {
            super.description = description
        }

    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}
