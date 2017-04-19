package ru.habrahabr.sergiosergio.chapter_3;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
	this.beverage = beverage;
    }

    @Override
    public String getDescription() {

	return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {

	return 0.10 + beverage.cost();
    }

}
