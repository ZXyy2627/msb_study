package com.lucky.jucTest.c_011;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lucky_x
 * @Date: 2021/9/9 - 09 - 09 - 21:43
 * @Description: com.lucky.jucTest.c_011
 * @VERSION: 1.0
 *
 * 在程序出现异常的时候，锁在默认情况下会被自动释放，所以在处理业务逻辑时，应该对异常情况特别小心 而不是让锁自动释放产生其它问题
 *
 * 从打印结果可以看到，当线程t1产生异常以后，将锁自动释放了，线程t2获得了锁，继续执行，但是在业务逻辑中，这种情况应该特别小心
 *
 * 如果将异常捕获，那么线程t1就继续执行下去，没有释放锁，
 */
public class T {
    int count  = 0;

    synchronized void m() {
        System.out.println(Thread.currentThread().getName() + " start");
        while (true) {
            count++;
            System.out.println(Thread.currentThread().getName() + " count = "+count);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                if (count == 5) {
                    int i = 1/0;
                    System.out.println(i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        T t = new T();
        new Thread(t::m,"t1").start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(t::m,"t2").start();
    }
}
