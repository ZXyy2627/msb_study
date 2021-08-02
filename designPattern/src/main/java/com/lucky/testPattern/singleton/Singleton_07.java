package com.lucky.testPattern.singleton;

/**
 * 使用静态内部类的方式加载单例
 */
public class Singleton_07 {

    private static class SingletonHolder{
        private static Singleton_07 INSTANCE = new Singleton_07();
    }

    private Singleton_07() {

    }

    public static Singleton_07 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
