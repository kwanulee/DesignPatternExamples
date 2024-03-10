package command.remote

class StereoOnWithCDCommand(var stereo: Stereo) : Command {
    override fun execute() {
        stereo.on()
        stereo.setCD()
        stereo.setVolume(11)
    }
}
