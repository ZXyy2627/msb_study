package com.lucky.jucTest.c_005;

/**
 * @Author: lucky_x
 * @Date: 2021/9/9 - 09 - 09 - 14:05
 * @Description: com.lucky.jucTest.c_005
 * @VERSION: 1.0
 * volatile只保证线程间的可见性，不保证原子性
 * synchronized关键字加锁，可以保证在执行run方法时，没有其它线程参与
 */
public class T implements Runnable{
    private volatile int count = 100;

    @Override
    public synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName()+" count = "+count);
    }

    public static void main(String[] args) {
        T t = new T();
        for (int i = 0; i < 100; i++) {
            new Thread(t,"THREAD"+i).start();
        }
    }
}
