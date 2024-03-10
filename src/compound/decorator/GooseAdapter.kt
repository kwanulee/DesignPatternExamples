package compound.decorator

class GooseAdapter(var goose: Goose) : Quackable {
    override fun quack() {
        goose.honk()
    }

    override fun toString(): String {
        return "Goose pretending to be a Duck"
    }
}
