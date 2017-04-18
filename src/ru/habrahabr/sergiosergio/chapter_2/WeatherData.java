package ru.habrahabr.sergiosergio.chapter_2;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public void measurmentChanged() {

	setChanged();
	notifyObservers();

    }

    public void setMeasurments(float temperature, float humidity, float pressure) {

	this.temperature = temperature;
	this.humidity = humidity;
	this.pressure = pressure;
	measurmentChanged();

    }

    public float getTemperature() {
	return temperature;
    }

    public float getHumidity() {
	return humidity;
    }

    public float getPressure() {
	return pressure;
    }

}