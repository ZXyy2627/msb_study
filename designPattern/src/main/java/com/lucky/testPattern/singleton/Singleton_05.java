package com.lucky.testPattern.singleton;

/**
 * 使用同步方法解决了线程安全问题，但是效率低下
 */
public class Singleton_05 {
    private static Singleton_05 INSTANCE;

    private Singleton_05() {

    }

    public static Singleton_05 getInstance() {
        if (INSTANCE == null) {
            //使用同步代码块并不能解决线程安全问题
            synchronized (Singleton_05.class) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Singleton_05();
            }
        }
        return INSTANCE;
    }
}
