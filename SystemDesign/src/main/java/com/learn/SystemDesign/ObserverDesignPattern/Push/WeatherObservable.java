package com.learn.SystemDesign.ObserverDesignPattern.Push;

public interface WeatherObservable {
    void addObserver(WeatherObserver weatherObserver);
    void removeObserver(WeatherObserver weatherObserver);
    void notifyObserver();
    void setWeatherReadings(Double temperature, String humidity);
}
