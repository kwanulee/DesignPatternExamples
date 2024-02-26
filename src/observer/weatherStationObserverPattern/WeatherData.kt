package observer.weatherStationObserverPattern

class WeatherData : Subject {
    private val observers = ArrayList<Observer>()
    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var pressure: Float = 0f

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        val i = observers.indexOf(o)
        if (i >= 0) {
            observers.removeAt(i)
        }
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(temperature, humidity, pressure)
        }
    }

    private fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}
