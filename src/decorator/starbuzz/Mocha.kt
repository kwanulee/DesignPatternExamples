package decorator.starbuzz

class Mocha(beverage: Beverage) : CondimentDecorator(beverage) {
    override var description: String
        get() = beverage.description + ", 모카"
        set(description) {
            super.description = description
        }

    override fun cost(): Double {
        return .20 + beverage.cost()
    }
}
