package command.party

class CeilingFanOffCommand(var ceilingFan: CeilingFan) : Command {
    var prevSpeed: Int = 0

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.off()
    }

    override fun undo() {
        when (prevSpeed) {
            CeilingFan.Companion.HIGH -> ceilingFan.high()
            CeilingFan.Companion.MEDIUM -> ceilingFan.medium()
            CeilingFan.Companion.LOW -> ceilingFan.low()
            else -> ceilingFan.off()
        }
    }
}
