package com.lucky.jucTest.c_000;

/**
 * @Author: lucky_x
 * @Date: 2021/9/7 - 09 - 07 - 16:01
 * @Description: com.lucky.jucTest.c_000
 * @VERSION: 1.0
 *
 * 首先我们知道有6种线程状态:
 * NEW RUNNABLE WAITING TIMED_WAITING BLOCKED TERMINATED
 */
public class T04_ThreadState {
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println(this.getState());//调用了start方法就是RUNNABLE状态了
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

    public static void main(String[] args){
        Thread t1 = new MyThread();
        System.out.println(" 1: " + t1.getState());//NEW  线程对象刚刚创建还未启动的时候就是NEW状态
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getState());//main线程调用join方法，就是让t1线程来执行，main线程进入WAITING状态
    }
}
