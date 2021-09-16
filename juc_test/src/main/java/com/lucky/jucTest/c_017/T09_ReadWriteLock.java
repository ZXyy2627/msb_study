package com.lucky.jucTest.c_017;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: lucky_x
 * @Date: 2021/9/16 - 09 - 16 - 17:32
 * @Description: com.lucky.jucTest.c_017
 * @VERSION: 1.0
 *
 * ReadWriteLock的概念主要就是共享锁和排它锁
 */
public class T09_ReadWriteLock {

    static Lock lock = new ReentrantLock();
    private static int value = 0;

    static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    static Lock readLock = readWriteLock.readLock();
    static Lock  writeLock = readWriteLock.writeLock();

    public static void main(String[] args) {
        //Runnable read = () -> read(lock);
        Runnable read = () -> read(readLock);
        //Runnable write = () -> write(lock,new Random().nextInt(100));
        Runnable write = () -> write(writeLock,new Random().nextInt(100));

        for (int i = 0; i < 18; i++) {
            new Thread(read).start();
        }
        for (int i = 0; i < 2; i++) {
            new Thread(write).start();
        }
    }

    private static void read(Lock lock) {
        try {
            lock.lock();
            TimeUnit.SECONDS.sleep(1);
            System.out.println("read over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    private static void write(Lock lock,int v) {
        try {
            lock.lock();
            TimeUnit.SECONDS.sleep(1);
            value = v;
            System.out.println("write over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
