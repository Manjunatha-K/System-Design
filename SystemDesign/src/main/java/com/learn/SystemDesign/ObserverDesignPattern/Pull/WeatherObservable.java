package com.learn.SystemDesign.ObserverDesignPattern.Pull;

public interface WeatherObservable {
    void addObserver(WeatherObserver weatherObserver);
    void removeObserver(WeatherObserver weatherObserver);
    void notifyObserver();
    void setWeatherReadings(Double temperature, String humidity);
}
