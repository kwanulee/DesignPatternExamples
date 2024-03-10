package command.remote

class GarageDoorDownCommand(var garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.up()
    }
}
