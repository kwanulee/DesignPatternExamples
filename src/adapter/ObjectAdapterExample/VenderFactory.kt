package adapter.ObjectAdapterExample

class VenderFactory private constructor() {
    fun createVender(): Vender {
        return VenderAdapter(Vender2())
        //return ConcreteVender()
    }

    companion object {
        private var instance: VenderFactory? = null
        fun getInstance() : VenderFactory? {
            if (instance == null) instance = VenderFactory()
            return instance
        }
    }
}
