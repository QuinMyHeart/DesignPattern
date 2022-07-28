package com.liu.simpleFactory;

import com.liu.simpleFactory.thirdMethod.CarFactory;
import com.liu.simpleFactory.thirdMethod.PlaneFactory;

public class Main {
    public static void main(String[] args) {
        //利用简单的多态来实现控制不同新建对象，但是依旧需要修改代码
//        Moveable m = new Plane();
//        m.move();

        //利用单例简单工厂来获取对象
//        MoveableFactory.getInstance().createPlane().move();

        //将工厂进行拆分，有新的对象时新建工厂时即可
            PlaneFactory.getINSTANCE().getInstance().move();
    }
}
