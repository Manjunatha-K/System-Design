package com.learn.SystemDesign.ObserverDesignPattern.Push;

public class ForcastDisplay implements  WeatherObserver{
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("Current Forcast Data is : "+ weatherData);
    }
}
