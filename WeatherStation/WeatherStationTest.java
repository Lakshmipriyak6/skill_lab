public class WeatherStationTest {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherStation);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherStation);

        weatherStation.setMeasurements(80, 65, 30.4f);
        weatherStation.setMeasurements(82, 70, 29.2f);
        weatherStation.setMeasurements(78, 90, 29.2f);
    }
}