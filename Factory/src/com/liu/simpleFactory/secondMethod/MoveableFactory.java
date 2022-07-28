package com.liu.simpleFactory.secondMethod;

import com.liu.simpleFactory.firstMethod.Car;
import com.liu.simpleFactory.firstMethod.Plane;

//此时可以自由控制生产过程，但是依旧扩展性很差，即每次新增对象需要修改代码
public class MoveableFactory {
    private static final MoveableFactory INSTANCE = new MoveableFactory();

    private MoveableFactory(){}

    public static MoveableFactory getInstance(){
        return INSTANCE;
    }

    public Car createCar(){
        System.out.println("A car cteated!");
        return new Car();
    }

    public Plane createPlane(){
        System.out.println("A plane cteated!");
        return new Plane();
    }
}
