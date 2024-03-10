package command.undo

class DimmerLightOffCommand(var light: Light) : Command {
    var prevLevel: Int = 100

    override fun execute() {
        prevLevel = light.level
        light.off()
    }

    override fun undo() {
        light.dim(prevLevel)
    }
}
