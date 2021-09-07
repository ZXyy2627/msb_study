package com.lucky.juc.c_000;

/**
 * @Author: lucky_x
 * @Date: 2021/9/6 - 09 - 06 - 22:31
 * @Description: com.lucky.juc.c_000
 * @VERSION: 1.0
 *
 * NEW RUNNABLE  BLOCKED  WAITING TIMED_WAITING TERMINATED
 * JDK中有个enum，就叫State  自己画图
 * 状态之间的转换
 */
public class T04_ThreadState {
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println(this.getState()); //RUNNABLE
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new MyThread();
        System.out.println(t.getState()); //NEW
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getState());//TERMINATED
    }
}
