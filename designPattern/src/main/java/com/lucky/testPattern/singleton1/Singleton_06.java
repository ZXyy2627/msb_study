package com.lucky.testPattern.singleton1;

/**
 * 使用双重检查解决同步代码块的线程安全问题
 */
public class Singleton_06 {
    private static Singleton_06 INSTANCE;

    private Singleton_06() {

    }

    public static Singleton_06 getInstance() {
        if(INSTANCE == null){
            synchronized (Singleton_06.class) {

                if(INSTANCE == null){
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton_06();
                }
            }
        }
        return INSTANCE;
    }
}
