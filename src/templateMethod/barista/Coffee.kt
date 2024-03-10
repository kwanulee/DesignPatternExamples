package templateMethod.barista


class Coffee : CaffeineBeverage() {
    public override fun brew() {
        println("Dripping Coffee through filter")
    }

    public override fun addCondiments() {
        println("Adding Sugar and Milk")
    }
}
