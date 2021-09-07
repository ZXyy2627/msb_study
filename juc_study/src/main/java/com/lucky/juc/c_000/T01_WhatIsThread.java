package com.lucky.juc.c_000;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lucky_x
 * @Date: 2021/9/6 - 09 - 06 - 16:25
 * @Description: com.lucky.juc.c_000
 * @VERSION: 1.0
 *
 *  什么是线程?一个程序里不同的执行线路
 */
public class T01_WhatIsThread {
    private static class T1 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("T1");
            }
        }
    }

    public static void main(String[] args) {
        //new T1().run();//这是单线程
        new T1().start();//这才是多线程
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main");
        }
    }
}
