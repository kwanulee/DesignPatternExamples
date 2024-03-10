package command.remote

class CeilingFanOffCommand(var ceilingFan: CeilingFan) : Command {
    override fun execute() {
        ceilingFan.off()
    }
}
