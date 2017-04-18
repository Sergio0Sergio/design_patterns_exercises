package ru.habrahabr.sergiosergio.chapter_2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {

    Observable observable;
    private float tempetature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
	this.observable = observable;
	observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
	if (obs instanceof WeatherData) {
	    WeatherData weatherData = (WeatherData) obs;
	    this.tempetature = weatherData.getTemperature();
	    this.humidity = weatherData.getHumidity();
	    display();
	}

    }

    public void display() {
	System.out.println("Current conditions: " + tempetature + "F degrees and " + humidity + "% humidity");
    }

}
