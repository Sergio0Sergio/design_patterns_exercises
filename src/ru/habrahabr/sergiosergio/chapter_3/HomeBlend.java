package ru.habrahabr.sergiosergio.chapter_3;

public class HomeBlend extends Beverage {

    public HomeBlend() {
	description = "House Blend Coffee";
    }

    @Override
    public double cost() {
	return 0.89;
    }

}
