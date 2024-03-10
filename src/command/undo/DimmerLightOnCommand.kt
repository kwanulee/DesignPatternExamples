package command.undo

class DimmerLightOnCommand(var light: Light) : Command {
    var prevLevel: Int = 0

    override fun execute() {
        prevLevel = light.level
        light.dim(75)
    }

    override fun undo() {
        light.dim(prevLevel)
    }
}
