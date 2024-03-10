package singleton.chocolate_threadsafe


fun main(args: Array<String>) {
    val thread1: Thread = object : Thread() {
        override fun run() {
            val boiler = ChocolateBoiler.getInstance()
            boiler!!.fill()
            boiler.boil()
            boiler.drain()
        }
    }

    val thread2: Thread = object : Thread() {
        override fun run() {
            val boiler = ChocolateBoiler.getInstance()
            boiler!!.fill()
            boiler.boil()
            boiler.drain()
        }
    }

    thread1.start()
    thread2.start()
}
