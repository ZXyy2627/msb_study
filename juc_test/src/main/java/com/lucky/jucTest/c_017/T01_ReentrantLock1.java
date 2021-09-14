package com.lucky.jucTest.c_017;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lucky_x
 * @Date: 2021/9/14 - 09 - 14 - 22:04
 * @Description: com.lucky.jucTest.c_017
 * @VERSION: 1.0
 */
public class T01_ReentrantLock1 {
    synchronized void m1() {
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 2) {
                m2();
            }
        }
    }

    synchronized void m2() {
        System.out.println("m2 ........");
    }

    public static void main(String[] args) {
        T01_ReentrantLock1 r1 = new T01_ReentrantLock1();
        new Thread(r1::m1,"thread").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
