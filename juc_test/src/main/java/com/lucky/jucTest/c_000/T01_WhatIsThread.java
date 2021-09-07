package com.lucky.jucTest.c_000;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lucky_x
 * @Date: 2021/9/7 - 09 - 07 - 10:33
 * @Description: com.lucky.jucTest.c_000
 * @VERSION: 1.0
 * 什么是进程？就是一个可执行程序，例如QQ
 * 什么是线程？开启了多个聊天窗口
 */
public class T01_WhatIsThread {
    static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("MyThread");
            }
        }
    }

    public static void main(String[] args) {
//       new MyThread().run();//这不是多线程
        new MyThread().start();
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
