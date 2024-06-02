package mvc.djview

fun main(args: Array<String>) {
        val model: BeatModelInterface = BeatModel()
        val controller: ControllerInterface = BeatController(model)
}
