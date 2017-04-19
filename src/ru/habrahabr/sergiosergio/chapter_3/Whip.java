package ru.habrahabr.sergiosergio.chapter_3;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
	this.beverage = beverage;

    }

    @Override
    public String getDescription() {

	return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {

	return 0.25 + beverage.cost();
    }

}
