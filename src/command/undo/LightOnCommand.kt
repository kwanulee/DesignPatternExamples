package command.undo

class LightOnCommand(var light: Light) : Command {
    var level: Int = 0

    override fun execute() {
        level = light.level
        light.on()
    }

    override fun undo() {
        light.dim(level)
    }
}
