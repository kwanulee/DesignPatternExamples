package command.remote

class HottubOffCommand(var hottub: Hottub) : Command {
    override fun execute() {
        hottub.cool()
        hottub.off()
    }
}
