package command.party

//
// This is the invoker
//
class RemoteControl {
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
        var i = 0
        i = 0
        while (i < onCommands.size) {
            stringBuff.append(
                "[slot" + i + "]" + "( " + 2 * i + ") " + onCommands[i]!!.javaClass.name
                        + "      \t" + "( " + (2 * i + 1) + ") " + offCommands[i]!!.javaClass.name + "\n"
            )
            i++
        }
        stringBuff.append("[undo] (" + 2 * i + ") " + undoCommand!!.javaClass.name + "\n")
        return stringBuff.toString()
    }
}
