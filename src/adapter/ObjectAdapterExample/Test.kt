package adapter.ObjectAdapterExample

fun main(args: Array<String>) {
    val vender: Vender = VenderAdapter(Vender2())
    //Vender vender = VenderFactory.getInstance().createVender();
    val app = MyApp(vender)
    app.run()
}
