package command.party

class LivingroomLightOnCommand(var light: Light) : Command {
    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}
