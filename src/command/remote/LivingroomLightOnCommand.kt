package command.remote

class LivingroomLightOnCommand(var light: Light) : Command {
    override fun execute() {
        light.on()
    }
}
