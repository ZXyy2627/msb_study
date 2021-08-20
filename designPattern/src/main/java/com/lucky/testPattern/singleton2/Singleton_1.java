package com.lucky.testPattern.singleton2;

/**
 * 饿汉式  就是立即加载
 * 最普通的饿汉式
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 10:00
 * @Description: com.lucky.testPattern.singleton2
 * @VERSION: 1.0
 */
public class Singleton_1 {
    private static Singleton_1 INSTANCE = new Singleton_1();

    private Singleton_1() {

    }

    /**
     * 返回单例
     * @return INSTANCE
     */
    public static Singleton_1 getInstance() {
        return INSTANCE;
    }
}
