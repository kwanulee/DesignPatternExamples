package command.remote

class LightOnCommand(var light: Light) : Command {
    override fun execute() {
        light.on()
    }
}
