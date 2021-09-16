package com.lucky.jucTest.c_017;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: lucky_x
 * @Date: 2021/9/16 - 09 - 16 - 10:42
 * @Description: com.lucky.jucTest.c_017
 * @VERSION: 1.0
 *
 * lockInterruptibly()如果当前线程没有被中断，则可以获取锁
 *
 *
 * 从运行结果上看，如果t
 */
public class T04_ReentrantLock4 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Thread t1 = new Thread(()->{
            try {
                lock.lock();
                System.out.println("t1 start");
                TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
                System.out.println("t1 end");
            } catch (Exception e) {
                System.out.println("t1 interrupted");
            } finally {
                lock.unlock();
            }
        },"t1");
        t1.start();

        Thread t2 = new Thread(()->{
            try {
                //lock.lock();
                lock.lockInterruptibly();
                System.out.println("t2 start");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("t2 end");
            } catch (InterruptedException e) {
                System.out.println("t2 interrupted");
            } finally {
                lock.unlock();
            }
        },"t2");
        t2.start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.interrupt();
    }
}
