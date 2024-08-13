import java.util.ArrayList;

public class WeatherStation {
    private ArrayList<WeatherObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
