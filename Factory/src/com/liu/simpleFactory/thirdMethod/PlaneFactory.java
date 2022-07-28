package com.liu.simpleFactory.thirdMethod;

import com.liu.simpleFactory.firstMethod.Plane;

import static java.lang.Thread.sleep;

public class PlaneFactory implements Factory<Plane> {
    private static volatile PlaneFactory INSTANCE;

    private PlaneFactory(){}

    public static PlaneFactory getINSTANCE(){
        if(INSTANCE == null){
            synchronized (PlaneFactory.class){
                if(INSTANCE == null){
                    return INSTANCE = new PlaneFactory();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public Plane getInstance() {
        return new Plane();
    }
}
