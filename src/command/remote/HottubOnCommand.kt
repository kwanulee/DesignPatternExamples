package command.remote

class HottubOnCommand(var hottub: Hottub) : Command {
    override fun execute() {
        hottub.on()
        hottub.heat()
        hottub.bubblesOn()
    }
}
