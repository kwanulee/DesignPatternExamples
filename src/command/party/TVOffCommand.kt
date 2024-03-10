package command.party

class TVOffCommand(var tv: TV) : Command {
    override fun execute() {
        tv.off()
    }

    override fun undo() {
        tv.on()
    }
}
