package command.undo

class LightOffCommand(var light: Light) : Command {

    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}
