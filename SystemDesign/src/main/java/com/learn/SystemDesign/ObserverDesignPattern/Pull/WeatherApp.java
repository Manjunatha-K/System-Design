package com.learn.SystemDesign.ObserverDesignPattern.Pull;

public class WeatherApp {
    public static void main(String[] args){
        WeatherObservable weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherStation);
        ForcastDisplay forcastDisplay = new ForcastDisplay(weatherStation);

        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(forcastDisplay);
        weatherStation.setWeatherReadings(30.2,"MILD");
        weatherStation.removeObserver(forcastDisplay);
    }
}
