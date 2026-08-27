package com.learn.SystemDesign.ObserverDesignPattern.Push;

public class CurrentConditionsDisplay implements WeatherObserver{
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("Current Weather Data is : "+ weatherData);
    }
}
