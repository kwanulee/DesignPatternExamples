package command.simpleremote

class GarageDoorOpenCommand(var garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.up()
    }
}
