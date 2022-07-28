package com.Liu;

public class Dog {
    int height;

    public Dog(){}

    public Dog(int height){
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                '}';
    }
}
