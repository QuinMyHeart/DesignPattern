package com.liu.simpleFactory.firstMethod;

public class Plane implements Moveable {
    @Override
    public void move() {
        System.out.println("Plane is moving");
    }
}
