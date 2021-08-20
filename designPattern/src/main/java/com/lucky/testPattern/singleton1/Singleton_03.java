package com.lucky.testPattern.singleton1;

/**
 * 懒汉式,需要的时候才加载
 */
public class Singleton_03 {
    private static Singleton_03 INSTANCE;

    private Singleton_03() {
    }

    public static Singleton_03 getInstance() {
        if (INSTANCE == null) {
            //懒汉式会带来线程安全问题，让线程睡50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton_03();
        }
        return INSTANCE;
    }
}
