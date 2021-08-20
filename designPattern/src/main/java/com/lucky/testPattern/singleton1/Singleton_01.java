package com.lucky.testPattern.singleton1;

/**
 * 饿汉式
 */
public class Singleton_01 {
    private static final Singleton_01 INSTANCE = new Singleton_01();

    private Singleton_01() {

    }

    public static Singleton_01 getInstance() {
        return INSTANCE;
    }
}
