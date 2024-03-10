package adapter.ObjectAdapterExample

class VenderFactory private constructor() {
    fun createVender(): Vender {
        return VenderAdapter(Vender2())
    }

    companion object {
        var instance: VenderFactory? = null
            get() {
                if (field == null) field = VenderFactory()
                return field
            }
            private set
    }
}
