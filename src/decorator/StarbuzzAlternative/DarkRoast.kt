package decorator.StarbuzzAlternative

class DarkRoast : Beverage() {
    init {
        description = "다크 로스트 커피"
    }

    override fun cost(): Double {
        return .99 + super.cost()
    }
}
