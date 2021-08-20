package com.lucky.testPattern.singleton1;

public class Main {
    public static void main(String[] args) {
//        Singleton_03 singleton_01 = Singleton_03.getInstance();
//        Singleton_03 singleton_02 = Singleton_03.getInstance();
//        System.out.println(singleton_01.hashCode());
//        System.out.println(singleton_02.hashCode());
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton_08.INSTANCE.hashCode());
            }).start();
        }
    }
}
