package observer.weatherStationObservable

import java.util.*

class ForecastDisplay(observable: Observable) : Observer, DisplayElement {
    private var currentPressure = 29.92f
    private var lastPressure = 0f

    init {
        observable.addObserver(this)
    }

    override fun update(observable: Observable, arg: Any?) {
        if (observable is WeatherData) {
            lastPressure = currentPressure
            currentPressure = observable.pressure
            display()
        }
    }

    override fun display() {
        print("Forecast: ")
        if (currentPressure > lastPressure) {
            println("Improving weather on the way!")
        } else if (currentPressure == lastPressure) {
            println("More of the same")
        } else if (currentPressure < lastPressure) {
            println("Watch out for cooler, rainy weather")
        }
    }
}
