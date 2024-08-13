public class ForecastDisplay implements WeatherObserver {
    private float pressure;
    private WeatherStation weatherStation;

    // Constructor to register this display as an observer
    public ForecastDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    // The update method gets called when the WeatherStation notifies observers
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }

    // Method to display the forecast based on pressure
    public void display() {
        System.out.println("Forecast pressure: " + pressure + " Pa");
    }
}
