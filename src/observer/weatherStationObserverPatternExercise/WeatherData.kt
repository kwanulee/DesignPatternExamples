package observer.weatherStationObserverPatternExercise

class WeatherData : Subject {
    private val observers = ArrayList<Observer>()
    var temperature: Float = 0f
        private set
    var humidity: Float = 0f
        private set
    var pressure: Float = 0f
        private set
    private val changed = false

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

    fun measurementsChanged() {
        notifyObservers()
    }


    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}
