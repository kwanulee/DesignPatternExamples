package mvc.djview


fun main(args: Array<String>) {
    val heartModel = HeartModel()
    val model: ControllerInterface = HeartController(heartModel)
}

