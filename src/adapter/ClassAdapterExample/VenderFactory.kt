package adapter.ClassAdapterExample

class VenderFactory private constructor() {
    fun createVender(): Vender {
        return VenderClassAdapter()
        //	return new Vender();
        //	return new VenderAdapter( new Vender2());
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
