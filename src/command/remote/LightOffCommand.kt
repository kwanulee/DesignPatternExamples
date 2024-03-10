package command.remote

class LightOffCommand(var light: Light) : Command {
    override fun execute() {
        light.off()
    }
}
