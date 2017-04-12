package ru.habrahabr.sergiosergio.chapter_1;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
	System.out.println("<<Silence>>");

    }

}
