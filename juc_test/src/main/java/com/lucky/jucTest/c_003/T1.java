package com.lucky.jucTest.c_003;

/**
 * @Author: lucky_x
 * @Date: 2021/9/9 - 09 - 09 - 7:25
 * @Description: com.lucky.jucTest.c_003
 * @VERSION: 1.0
 *
 * 同步方法被锁了，多个线程可以同时执行同步方法和非同步方法，因为m2不需要获取锁就可以执行
 */
public class T1 {
    private int count = 10;

    public synchronized void m() {
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

    public void m1() {
        count++;
    }
}
