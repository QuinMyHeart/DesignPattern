package com.liu;

import static java.lang.Thread.sleep;

/***
 * 双重验证，较为完美的办法，但是能被反序列化调用构造方法
 */

public class s03 {
    private static volatile s03 INSTANCE;

    private s03(){}

    private static s03 getInstance(){
        if(INSTANCE == null){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (s03.class){
                if (INSTANCE == null){
                    INSTANCE = new s03();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            new Thread(()->{
                System.out.println(s03.getInstance().hashCode());
            }).start();
        }
    }
}
