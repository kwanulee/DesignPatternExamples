package command.remote

class StereoOffCommand(var stereo: Stereo) : Command {
    override fun execute() {
        stereo.off()
    }
}
