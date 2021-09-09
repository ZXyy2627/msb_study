package com.lucky.jucTest.c_009;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lucky_x
 * @Date: 2021/9/9 - 09 - 09 - 21:08
 * @Description: com.lucky.jucTest.c_009
 * @VERSION: 1.0
 *
 *  证明synchronized锁是可重入的
 *  如何证明？
 *  在一个同步方法中，调用另一个同步方法
 */
public class T {

    public synchronized void m1() {
        System.out.println("m1 start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m2();
        System.out.println("m1 end");
    }

    /*public synchronized void m2() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m2 end");
    }*/

    public void m2() {
        synchronized (this) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("m2 end");
        }
    }

    public static void main(String[] args) {
        T t = new T();
        new Thread(t::m1).start();
    }
}
