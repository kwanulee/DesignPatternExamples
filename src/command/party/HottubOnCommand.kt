package command.party

class HottubOnCommand(var hottub: Hottub) : Command {
    override fun execute() {
        hottub.on()
        hottub.setTemperature(104)
        hottub.circulate()
    }

    override fun undo() {
        hottub.off()
    }
}
