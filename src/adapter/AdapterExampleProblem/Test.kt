package adapter.AdapterExampleProblem

fun main(args: Array<String>) {
    val vender = Vender()
    val app = MyApp(vender)
    app.run()
}

