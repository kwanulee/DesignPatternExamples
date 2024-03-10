package mvc.djview

object HeartTestDrive {
    @JvmStatic
    fun main(args: Array<String>) {
        val heartModel = HeartModel()
        val model: ControllerInterface = HeartController(heartModel)
    }
}
