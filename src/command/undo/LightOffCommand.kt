package command.undo

class LightOffCommand(var light: Light) : Command {
    var level: Int = 0

    override fun execute() {
        level = light.level
        light.off()
    }

    override fun undo() {
        light.dim(level)
    }
}
