package command.party

class TVOnCommand(var tv: TV) : Command {
    override fun execute() {
        tv.on()
        tv.setInputChannel()
    }

    override fun undo() {
        tv.off()
    }
}
