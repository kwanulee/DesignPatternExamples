package singleton.chocolate_threadsafe

class ChocolateBoiler private constructor() {
    var isEmpty: Boolean = true
        private set
    var isBoiled: Boolean = false
        private set

    init {
        println("Creating unique instance of Chocolate Boiler")
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

    companion object {
        private var uniqueInstance: ChocolateBoiler? = null

        @get:Synchronized
        val instance: ChocolateBoiler?
            get() {
                if (uniqueInstance == null) {
                    uniqueInstance = ChocolateBoiler()
                }
                return uniqueInstance
            }
    }
}
