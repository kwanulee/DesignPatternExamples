package command.remote

class CeilingFanOnCommand(var ceilingFan: CeilingFan) : Command {
    override fun execute() {
        ceilingFan.high()
    }
}
