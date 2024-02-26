package observer.weatherStationObserverPattern

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}
