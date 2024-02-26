package observer.weatherStationObservable

import java.util.*

class CurrentConditionsDisplay(private var observable: Observable) : Observer, DisplayElement {
    private var temperature = 0f
    private var humidity = 0f

    init {
        observable.addObserver(this)
    }

    override fun update(obs: Observable, arg: Any?) {
        if (obs is WeatherData) {
            this.temperature = obs.temperature
            this.humidity = obs.humidity
            display()
        }
    }

    override fun display() {
        println(
            "Current conditions: " + temperature
                    + "F degrees and " + humidity + "% humidity"
        )
    }
}
