package com.learn.SystemDesign.ObserverDesignPattern.Pull;

public class WeatherData {
    Double temperature;
    String humidity;

    public WeatherData() {
    }

    public WeatherData(String humidity, Double temperature) {
        this.humidity = humidity;
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temperature +
                ", humidity='" + humidity + '\'' +
                '}';
    }
}
