package com.lucky.testPattern.singleton;

/**
 * 饿汉式：使用静态代码块加载，当类加载的时候，就加载这个对象
 */
public class Singleton_02 {
    private static Singleton_02 INSTANCE;

    static {
        INSTANCE = new Singleton_02();
    }

    private Singleton_02() {

    }

    public static Singleton_02 getInstance() {
        return INSTANCE;
    }
}
