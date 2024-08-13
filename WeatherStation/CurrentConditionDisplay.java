public class CurrentConditionsDisplay implements WeatherObserver {
    private float temperature;
    private float humidity;
    private WeatherStation weatherStation;

    // Constructor to register this display as an observer
    public CurrentConditionsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    // The update method gets called when the WeatherStation notifies observers
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    // Method to display the current weather conditions
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
