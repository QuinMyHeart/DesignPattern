package com.liu.simpleFactory.thirdMethod;

import com.liu.simpleFactory.firstMethod.Car;

public class CarFactory implements Factory<Car>{
    private CarFactory(){}

    private static volatile CarFactory INSTANCE = null;

    public static CarFactory getINSTANCE(){
        if(INSTANCE == null){
            synchronized (CarFactory.class){
                if (INSTANCE == null){
                    INSTANCE = new CarFactory();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public Car getInstance() {
        return new Car();
    }
}
