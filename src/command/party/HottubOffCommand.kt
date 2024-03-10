package command.party

class HottubOffCommand(var hottub: Hottub) : Command {
    override fun execute() {
        hottub.setTemperature(98)
        hottub.off()
    }

    override fun undo() {
        hottub.on()
    }
}
