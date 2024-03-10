package adapter.ObjectAdapterExample

class VenderAdapter(var vender: Vender2) : Vender {
    override fun request() {
        vender.specificRequest()
    }
}
