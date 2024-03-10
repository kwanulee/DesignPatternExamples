package decorator.StarbuzzAlternative

open class Beverage {
    var description: String? = null
    var milk: Boolean = false
    var soy: Boolean = false
    var mocha: Boolean = false
    var whip: Boolean = false

    open fun cost(): Double {
        var cost = 0.0
        if (hasMilk()) cost += .10
        if (hasSoy()) cost += .15
        if (hasMocha()) cost += .20
        if (hasWhip()) cost += .10
        return cost
    }

    fun hasMilk(): Boolean {
        return milk
    }

    fun hasSoy(): Boolean {
        return soy
    }

    fun hasMocha(): Boolean {
        return mocha
    }


    fun hasWhip(): Boolean {
        return whip
    }

}
