package decorator.StarbuzzAlternative

class HouseBlend : Beverage() {
    init {
        description = "하우스 블렌드 커피"
    }

    override fun cost(): Double {
        return super.cost() + 0.89
    }
}
