package command.simpleremote

class LightOnCommand(var light: Light) : Command {
    override fun execute() {
        light.on()
    }
}
