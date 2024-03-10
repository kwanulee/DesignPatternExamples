package decorator.starbuzz

abstract class Beverage {
    open var description: String = "Unknown Beverage"

    abstract fun cost(): Double
}
