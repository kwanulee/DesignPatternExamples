package command.remote

//
// This is the invoker
//
class RemoteControl {
    var onCommands: Array<Command?> = arrayOfNulls(7)
    var offCommands: Array<Command?> = arrayOfNulls(7)

    init {
        val noCommand: Command = NoCommand()
        for (i in 0..6) {
            onCommands[i] = noCommand
            offCommands[i] = noCommand
        }
    }

    fun setCommand(slot: Int, onCommand: Command?, offCommand: Command?) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot]!!.execute()
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot]!!.execute()
    }

    override fun toString(): String {
        val stringBuff = StringBuffer()
        stringBuff.append("\n------ Remote Control -------\n")
        for (i in onCommands.indices) {
            stringBuff.append(
                "[slot " + i + "] " + onCommands[i]!!.javaClass.name
                        + "    " + offCommands[i]!!.javaClass.name + "\n"
            )
        }
        return stringBuff.toString()
    }
}
