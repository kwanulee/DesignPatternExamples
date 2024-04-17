package adapter.ObjectAdapterExample

class ConcreteVender: Vender {
    override fun request() {
        println("A request is served by Vender")
    }
}