package com.lucky.jucTest.c_000;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lucky_x
 * @Date: 2021/9/7 - 09 - 07 - 10:48
 * @Description: com.lucky.jucTest.c_000
 * @VERSION: 1.0
 *
 * 创建线程的三种方式
 */
public class T02_HowToCreateThread {
    static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("MyThread");
            }
        }
    }

    static class MyRun implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("MyRun");
            }
        }
    }

    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyRun()).start();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("lambda create");
            }
        }).start();
    }
}
