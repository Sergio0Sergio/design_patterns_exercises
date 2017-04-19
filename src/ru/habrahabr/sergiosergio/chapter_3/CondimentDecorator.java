package ru.habrahabr.sergiosergio.chapter_3;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    @Override
    public abstract String getDescription();

}
