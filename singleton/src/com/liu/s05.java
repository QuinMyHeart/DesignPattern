package com.liu;

/***
 * 最完美解法，使用枚举
 */
public enum s05 {

    INSTANCE;

    public static void main(String[] args) {
        for(int i = 0;i<100;i++){
            new Thread(()->{
                System.out.println(s05.INSTANCE.hashCode());
            }).start();
        }
    }
}
