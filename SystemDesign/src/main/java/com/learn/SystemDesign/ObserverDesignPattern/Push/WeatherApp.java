package com.learn.SystemDesign.ObserverDesignPattern.Push;

public class WeatherApp {
    public static void main(String[] args){
        WeatherObservable weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        ForcastDisplay forcastDisplay = new ForcastDisplay();

        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(forcastDisplay);
        weatherStation.setWeatherReadings(30.2,"MILD");

        weatherStation.removeObserver(forcastDisplay);
    }
}
