package com.lucky.juc.c_000;

/**
 * @Author: lucky_x
 * @Date: 2021/9/6 - 09 - 06 - 16:55
 * @Description: com.lucky.juc.c_000
 * @VERSION: 1.0
 *
 * 如何创建线程
 */
public class T02_HowToCreateThread {

    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("Hello MyThread");
        }
    }

    static class MyRun implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello MyRun");
        }
    }

    public static void main(String[] args) {
        //创建线程的三种方式
        new MyThread().start();
        new Thread(new MyRun()).start();
        new Thread(() -> {
            System.out.println("lambda run");
        }).start();
    }
}
