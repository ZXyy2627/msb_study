package com.lucky.testPattern.singleton;

/**
 * 使用同步方法解决线程安全问题
 */
public class Singleton_04 {
    private static Singleton_04 INSTANCE;

    private Singleton_04() {
    }

    public synchronized static Singleton_04 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton_04();
        }
        return INSTANCE;
    }

}
