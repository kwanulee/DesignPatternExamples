package singleton.chocolate_kotlinObject


    fun main(args: Array<String>) {
        val thread1: Thread = object : Thread() {
            override fun run() {
                ChocolateBoiler.fill()
                ChocolateBoiler.boil()
                ChocolateBoiler.drain()
            }
        }

        val thread2: Thread = object : Thread() {
            override fun run() {
                ChocolateBoiler.fill()
                ChocolateBoiler.boil()
                ChocolateBoiler.drain()
            }
        }

        thread1.start()
        thread2.start()
    }
