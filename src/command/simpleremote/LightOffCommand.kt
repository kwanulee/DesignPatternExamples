package command.simpleremote

class LightOffCommand(var light: Light) : Command {
    override fun execute() {
        light.off()
    }
}
