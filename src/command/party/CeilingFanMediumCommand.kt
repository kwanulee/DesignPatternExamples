package command.party

class CeilingFanMediumCommand(var ceilingFan: CeilingFan) : Command {
    var prevSpeed: Int = 0

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.medium()
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
