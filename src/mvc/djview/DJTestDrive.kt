package mvc.djview

object DJTestDrive {
    @JvmStatic
    fun main(args: Array<String>) {
        val model: BeatModelInterface = BeatModel()
        val controller: ControllerInterface = BeatController(model)
    }
}
