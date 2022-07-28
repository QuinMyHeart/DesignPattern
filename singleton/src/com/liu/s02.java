package com.liu;

import static java.lang.Thread.sleep;

/***
 * 懒汉式，虽然实现了按需初始化的要求，但是有多线程的隐患
 */
public class s02 {
    private static s02 INSTANCE;

    private s02(){}

    private static s02 getInstance(){
        if(INSTANCE == null){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new s02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0; i<100; i++){
            new Thread(()->{
                System.out.println(s02.getInstance().hashCode());
            }).start();
        }
    }

}
