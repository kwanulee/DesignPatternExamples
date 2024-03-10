package command.party

class MacroCommand(var commands: Array<Command>) : Command {
    override fun execute() {
        for (i in commands.indices) {
            commands[i].execute()
        }
    }

    override fun undo() {
    }
}

