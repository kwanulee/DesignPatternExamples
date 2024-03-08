package observer.weatherStationObserverPatternExercise

import java.util.*

fun main(args: Array<String>) {
    var weatherData= WeatherData()
    var temperature: Float = 80.0f
    var humidity: Float = 65.0f
    var pressure: Float = 30.0f

    val currentDisplay = CurrentConditionsDisplay(
        weatherData
    )
    val statisticsDisplay = StatisticsDisplay(weatherData)
    val forecastDisplay = ForecastDisplay(weatherData)


    val jobScheduler = Timer()
    val task: TimerTask = object : TimerTask() {
        override fun run() { // 각 측정 값은 0~0.1 만큼 증가
            temperature = (temperature + Math.random() * 0.1).toFloat()
            humidity = (humidity + Math.random() * 0.1).toFloat()
            pressure = (pressure + Math.random() * 0.1).toFloat()
            weatherData.setMeasurements(temperature, humidity, pressure)
        }
    }
    // 1초마다 온도,습도,압력 측정
    jobScheduler.schedule(task, 0, 1000)
}

