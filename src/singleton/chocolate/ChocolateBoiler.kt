package singleton.chocolate

class ChocolateBoiler private constructor() {
    private var isEmpty: Boolean = true
    private var isBoiled: Boolean = false

    init {
        println("Creating unique instance of Chocolate Boiler")
    }

    companion object {
        private var uniqueInstance: ChocolateBoiler? = null

        fun getInstance(): ChocolateBoiler? {
            if (uniqueInstance == null) {
                    uniqueInstance = ChocolateBoiler()
            }
            return uniqueInstance
        }

    }

    fun fill() {
        if (isEmpty) {
            isEmpty = false
            isBoiled = false
            // fill the boiler with a milk/chocolate mixture
        }
    }

    fun drain() {
        if (!isEmpty && isBoiled) {
            // drain the boiled milk and chocolate
            isEmpty = true
        }
    }

    fun boil() {
        if (!isEmpty && !isBoiled) {
            // bring the contents to a boil
            isBoiled = true
        }
    }

}
