package command.party

class StereoOffCommand(var stereo: Stereo) : Command {
    override fun execute() {
        stereo.off()
    }

    override fun undo() {
        stereo.on()
    }
}
