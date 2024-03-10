package singleton.chocolate_dcl

import kotlin.concurrent.Volatile

class ChocolateBoiler private constructor() {

    companion object {
        @Volatile
        private var uniqueInstance: ChocolateBoiler? = null

        fun getInstance(): ChocolateBoiler? {
            if (uniqueInstance == null) {
                synchronized(ChocolateBoiler::class.java) {
                    if (uniqueInstance == null) {
                        uniqueInstance = ChocolateBoiler()
                    }
                }
            }
            return uniqueInstance
        }
    }

    private var isEmpty: Boolean = true
    private var isBoiled: Boolean = false

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


}
