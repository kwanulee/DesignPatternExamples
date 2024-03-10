package command.party

class CeilingFanHighCommand(var ceilingFan: CeilingFan) : Command {
    var prevSpeed: Int = 0

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.high()
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
