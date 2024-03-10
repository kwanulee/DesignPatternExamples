package templateMethod.barista


class Tea : CaffeineBeverage() {
    public override fun brew() {
        println("Steeping the tea")
    }

    public override fun addCondiments() {
        println("Adding Lemon")
    }
}
