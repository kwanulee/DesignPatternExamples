package command.undo

//
// This is the invoker
//
class RemoteControlWithUndo {
    var onCommands: Array<Command?> = arrayOfNulls(7)
    var offCommands: Array<Command?> = arrayOfNulls(7)
    var undoCommand: Command?

    init {
        val noCommand: Command = NoCommand()
        for (i in 0..6) {
            onCommands[i] = noCommand
            offCommands[i] = noCommand
        }
        undoCommand = noCommand
    }

    fun setCommand(slot: Int, onCommand: Command?, offCommand: Command?) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot]!!.execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot]!!.execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        undoCommand!!.undo()
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
        stringBuff.append("[undo] " + undoCommand!!.javaClass.name + "\n")
        return stringBuff.toString()
    }
}
