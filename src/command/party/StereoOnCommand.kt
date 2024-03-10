package command.party

class StereoOnCommand(var stereo: Stereo) : Command {
    override fun execute() {
        stereo.on()
    }

    override fun undo() {
        stereo.off()
    }
}
