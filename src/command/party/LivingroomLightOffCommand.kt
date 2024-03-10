package command.party

class LivingroomLightOffCommand(var light: Light) : Command {
    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}
