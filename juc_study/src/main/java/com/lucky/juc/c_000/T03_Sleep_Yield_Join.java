package com.lucky.juc.c_000;

/**
 * @Author: lucky_x
 * @Date: 2021/9/6 - 09 - 06 - 17:08
 * @Description: com.lucky.juc.c_000
 * @VERSION: 1.0
 *
 * 线程的三个方法：
 * sleep:
 * yield:
 * join:
 */
public class T03_Sleep_Yield_Join {

    public static void main(String[] args) {
        testSleep();
        testYield();
        testJoin();
    }

    static void testSleep() {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("A"+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    static void testYield() {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("A"+i);
                if(i%10 == 0) Thread.yield();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("B"+i);
                if(i%10 == 0) Thread.yield();
            }
        }).start();
    }

    static void testJoin() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("A"+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
