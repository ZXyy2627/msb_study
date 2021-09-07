package com.lucky.juc.c_001;

/**
 * @Author: lucky_x
 * @Date: 2021/9/6 - 09 - 06 - 17:40
 * @Description: com.lucky.juc.c_001
 * @VERSION: 1.0
 */
public class T {
    private int count = 10;
    private Object o = new Object();

    public void m() {
        synchronized (o){
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }
}
