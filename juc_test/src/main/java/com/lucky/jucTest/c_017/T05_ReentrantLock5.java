package com.lucky.jucTest.c_017;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: lucky_x
 * @Date: 2021/9/16 - 09 - 16 - 15:42
 * @Description: com.lucky.jucTest.c_017
 * @VERSION: 1.0
 *
 * 可以指定ReentrantLock为公平锁，构造参数true
 *
 * 公平锁就是队列的方式，线程进入等待队列，先来的先得到锁，后来的后得到锁
 */
public class T05_ReentrantLock5 extends Thread{
    //这个锁可以指定为公平锁
    Lock lock = new ReentrantLock(true);

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName()+"获得锁");
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        T05_ReentrantLock5 t = new T05_ReentrantLock5();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }
}
