package com.liu.simpleFactory.firstMethod;

public class Car implements Moveable {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
