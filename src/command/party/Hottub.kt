package command.party

class Hottub {
    var _on: Boolean = false
    var _temperature: Int = 0

    fun on() {
        _on = true
        println("Hottub is on")
    }

    fun off() {
        _on = false
        println("Hottub is off")
    }

    fun circulate() {
        if (_on) {
            println("Hottub is bubbling!")
        }
    }

    fun jetsOn() {
        if (_on) {
            println("Hottub jets are on")
        }
    }

    fun jetsOff() {
        if (_on) {
            println("Hottub jets are off")
        }
    }

    fun setTemperature(temperature: Int) {
        if (temperature > this._temperature) {
            println("Hottub is heating to a steaming $temperature degrees")
        } else {
            println("Hottub is cooling to $temperature degrees")
        }
        this._temperature = temperature
    }
}
