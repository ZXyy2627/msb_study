package com.lucky.jucTest.c_003;

/**
 * @Author: lucky_x
 * @Date: 2021/9/9 - 09 - 09 - 7:23
 * @Description: com.lucky.jucTest.c_003
 * @VERSION: 1.0
 */
public class T {
    private int count = 10;

    public synchronized void m() { //同步方法相当与synchronized(this)
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }
}
