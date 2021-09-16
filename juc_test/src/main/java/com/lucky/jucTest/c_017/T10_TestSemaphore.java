package com.lucky.jucTest.c_017;

import java.util.concurrent.Semaphore;

/**
 * @Author: lucky_x
 * @Date: 2021/9/16 - 09 - 16 - 20:42
 * @Description: com.lucky.jucTest.c_017
 * @VERSION: 1.0
 *
 * Semaphore  最多允许多少个线程同时执行
 * 作用：限流
 */
public class T10_TestSemaphore {
    public static void main(String[] args) {
//        Semaphore s = new Semaphore(1);
        Semaphore s = new Semaphore(2);

        new Thread(() -> {
            try {
                s.acquire();
                System.out.println("t1 start");
                Thread.sleep(200);
                System.out.println("t1 end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                s.release();
            }
        }).start();

        new Thread(() -> {
            try {
                s.acquire();
                System.out.println("t2 start");
                Thread.sleep(200);
                System.out.println(" t2 end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                s.release();
            }
        }).start();
    }
}
