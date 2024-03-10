package command.remote

class GarageDoorUpCommand(var garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.up()
    }
}
