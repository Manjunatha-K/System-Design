package com.learn.SystemDesign.ObserverDesignPattern.Pull;

public class ForcastDisplay implements WeatherObserver {
    private final WeatherStation weatherStation;

    public ForcastDisplay(WeatherObservable weatherStation) {
        this.weatherStation = (WeatherStation) weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Current Forcast Data is : "+weatherStation.getWeatherData());
    }
}
