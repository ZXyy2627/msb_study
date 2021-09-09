package com.lucky.jucTest.c_007;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lucky_x
 * @Date: 2021/9/9 - 09 - 09 - 14:22
 * @Description: com.lucky.jucTest.c_007
 * @VERSION: 1.0
 *
 * 多个线程可以同时执行该类的同步方法和非同步方法
 */
public class T {

    public synchronized void m1() {
        System.out.println(Thread.currentThread().getName() + "m1 start");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "m1 end");
    }

    public void m2() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "m2 start");
    }

    public static void main(String[] args) {
        T t = new T();
        new Thread(t::m1,"Thread1").start();
        new Thread(t::m2,"Thread2").start();
    }
}
