package com.lucky.testPattern.singleton2;

/**
 * 懒汉式
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 10:35
 * @Description: com.lucky.testPattern.singleton2
 * @VERSION: 1.0
 */
public class Singleton_2 {
    private static Singleton_2 INSTANCE;

    private Singleton_2() {

    }

    public static Singleton_2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton_2();
        }
        return INSTANCE;
    }
}
