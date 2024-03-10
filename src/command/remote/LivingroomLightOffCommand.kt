package command.remote

class LivingroomLightOffCommand(var light: Light) : Command {
    override fun execute() {
        light.off()
    }
}
