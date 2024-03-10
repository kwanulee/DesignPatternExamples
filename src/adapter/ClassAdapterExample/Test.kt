package adapter.ClassAdapterExample

fun main(args: Array<String>) {
    val vender: Vender = VenderFactory.Companion.instance!!.createVender()
    val app = MyApp(vender)
    app.run()
}

