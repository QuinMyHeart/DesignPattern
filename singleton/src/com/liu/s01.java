package com.liu;

import static java.lang.Thread.sleep;

/***
 * 饿汉式，最为简单
 * 缺点，无法控制初始化，可能造成浪费
 */

public class s01 {
    private static final s01 INSTANCE = new s01();

    private s01(){}

    private static s01 getInstance(){
        try {
            sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            new Thread(()->{
                    System.out.println(s01.getInstance().hashCode());
            }).start();
        }
    }
}
