package observer.weatherStationObservable

import java.util.*

class StatisticsDisplay(observable: Observable) : Observer, DisplayElement {
    private var maxTemp = 0.0f
    private var minTemp = 200f
    private var tempSum = 0.0f
    private var numReadings = 0

    init {
        observable.addObserver(this)
    }

    override fun update(observable: Observable, arg: Any?) {
        if (observable is WeatherData) {
            val temp = observable.temperature
            tempSum += temp
            numReadings++

            if (temp > maxTemp) {
                maxTemp = temp
            }

            if (temp < minTemp) {
                minTemp = temp
            }

            display()
        }
    }

    override fun display() {
        println(
            "Avg/Max/Min temperature = " + (tempSum / numReadings)
                    + "/" + maxTemp + "/" + minTemp
        )
    }
}
