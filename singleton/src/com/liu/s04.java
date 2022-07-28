package com.liu;

/***
 * 采用静态内部类，可以实现按需初始化，但依旧可以通过反射来调用构造方法
 */
public class s04 {
    private s04(){}

    private static class s04Holder{
        private static final s04 INSTANCE = new s04();
    }

    private static s04 getInstance(){
        return s04Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            new Thread(()->{
                System.out.println(s04.getInstance().hashCode());
            }).start();
        }
    }
}
