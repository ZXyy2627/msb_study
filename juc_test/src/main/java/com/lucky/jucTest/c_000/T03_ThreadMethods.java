package com.lucky.jucTest.c_000;

/**
 * @Author: lucky_x
 * @Date: 2021/9/7 - 09 - 07 - 11:17
 * @Description: com.lucky.jucTest.c_000
 * @VERSION: 1.0
 * Thread类的sleep()  yield() join()方法都会让线程进入等待状态
 * sleep等待时间结束就会自动进入RUNNABLE状态
 * yield()放弃当前CPU执行权，但是可能线程调度器马上又把CPU执行权给这个线程
 * join()是让某个线程加入进来执行，等加入进来的这个线程执行完了，才会执行当前线程
 */
public class T03_ThreadMethods {
    public static void main(String[] args) {
        testJoin();
    }

    static void testSleep() {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("A"+i);
            }
        }).start();
    }

    static void testYield() {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("A" + i);
                if(i%10 == 0) Thread.yield();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("B" + i);
                if(i%10 == 0) Thread.yield();
            }
        }).start();
    }

    static void testJoin() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("A" + i);
            }
        });

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("B" + i);
                try {
                    if(i == 5 ) t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        t1.start();
    }
}
