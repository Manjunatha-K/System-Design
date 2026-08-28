package com.learn.SystemDesign.ObserverDesignPattern.Pull;

public class CurrentConditionsDisplay implements WeatherObserver {

    private final WeatherStation weatherStation;

    public CurrentConditionsDisplay(WeatherObservable weatherStation) {
        this.weatherStation = (WeatherStation) weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Current Weather Data is : "+weatherStation.getWeatherData());
    }
}
