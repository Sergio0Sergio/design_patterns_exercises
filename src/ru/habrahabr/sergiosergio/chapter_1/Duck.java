package ru.habrahabr.sergiosergio.chapter_1;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
	this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
	this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performQuack() {
	quackBehavior.quack();
    }

    public void perfoformFly() {
	flyBehavior.fly();
    }

    public void swim() {

	System.out.println("All ducks float, even deckoys!");
    }

}
