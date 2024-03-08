package observer.weatherStationObserverPatternExercise

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}
