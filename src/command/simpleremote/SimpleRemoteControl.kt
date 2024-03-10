package command.simpleremote

//
// This is the invoker
//
class SimpleRemoteControl {
    var slot: Command? = null

    fun setCommand(command: Command?) {
        slot = command
    }

    fun buttonWasPressed() {
        slot!!.execute()
    }
}
