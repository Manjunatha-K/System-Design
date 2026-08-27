package com.learn.SystemDesign.ObserverDesignPattern.Push;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {
    private List<WeatherObserver> observers;
    private WeatherData weatherData;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
        observers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        observers.remove(weatherObserver);
    }

    @Override
    public void notifyObserver() {
        for (WeatherObserver observer : observers)
            observer.update(weatherData);
    }

    @Override
    public void setWeatherReadings(Double temperature, String humidity) {
        this.weatherData = new WeatherData(humidity, temperature);
        notifyObserver();
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }
}
