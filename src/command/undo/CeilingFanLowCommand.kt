package command.undo

class CeilingFanLowCommand(var ceilingFan: CeilingFan) : Command {
    var prevSpeed: Int = 0

    override fun execute() {
        prevSpeed = ceilingFan.speed
        ceilingFan.low()
    }

    override fun undo() {
        if (prevSpeed == CeilingFan.Companion.HIGH) {
            ceilingFan.high()
        } else if (prevSpeed == CeilingFan.Companion.MEDIUM) {
            ceilingFan.medium()
        } else if (prevSpeed == CeilingFan.Companion.LOW) {
            ceilingFan.low()
        } else if (prevSpeed == CeilingFan.Companion.OFF) {
            ceilingFan.off()
        }
    }
}
