package Models;

import java.util.ArrayList;
import java.util.List;

public class ConcreteWeatherStation implements WeatherStation{
    private double temperature;
    private double humidity;
    private List<WeatherObserver> observers;

    public ConcreteWeatherStation(){
        observers = new ArrayList<>();

    }

    public void setMeasurements(double temperature, double humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }


    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(WeatherObserver observer : observers){
            observer.update(temperature, humidity);
        }
    }
}
