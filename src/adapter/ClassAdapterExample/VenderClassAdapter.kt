package adapter.ClassAdapterExample

class VenderClassAdapter : Vender2(), Vender {
    override fun request() {
        super.specificRequest()
    }
}
