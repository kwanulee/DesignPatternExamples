package command.remote

class Hottub {
    var _on: Boolean = false
    var _temperature: Int = 0

    fun on() {
        _on = true
    }

    fun off() {
        _on = false
    }

    fun bubblesOn() {
        if (_on) {
            println("Hottub is bubbling!")
        }
    }

    fun bubblesOff() {
        if (_on) {
            println("Hottub is not bubbling")
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
        this._temperature = temperature
    }

    fun heat() {
        _temperature = 105
        println("Hottub is heating to a steaming 105 degrees")
    }

    fun cool() {
        _temperature = 98
        println("Hottub is cooling to 98 degrees")
    }
}
