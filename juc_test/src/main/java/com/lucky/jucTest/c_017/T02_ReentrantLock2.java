package com.lucky.jucTest.c_017;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: lucky_x
 * @Date: 2021/9/14 - 09 - 14 - 22:14
 * @Description: com.lucky.jucTest.c_017
 * @VERSION: 1.0
 *
 * 改写上一个程序，使用ReentrantLock类，
 *
 * 重要的事情说三遍：使用ReentrantLock必须手动释放锁
 */
public class T02_ReentrantLock2 {
    Lock lock = new ReentrantLock();
    void m1() {
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i == 2) {
                    m2();
                }
            }
        } finally {
            lock.unlock();
        }
    }

    void m2() {
        lock.lock();
        System.out.println("m2 ......");
        lock.unlock();
    }


    public static void main(String[] args) {
        T02_ReentrantLock2 t = new T02_ReentrantLock2();

        new Thread(t::m1).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(t::m2).start();
    }
}
