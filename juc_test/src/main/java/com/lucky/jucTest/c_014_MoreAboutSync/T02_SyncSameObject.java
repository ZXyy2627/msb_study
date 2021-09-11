package com.lucky.jucTest.c_014_MoreAboutSync;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lucky_x
 * @Date: 2021/9/11 - 09 - 11 - 22:04
 * @Description: com.lucky.jucTest.c_014_MoreAboutSync
 * @VERSION: 1.0
 */
public class T02_SyncSameObject {
    //最好用final修饰锁对象，可以防止它被改变
    final Object o = new Object();

    void m() {
        synchronized (o) {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        T02_SyncSameObject t = new T02_SyncSameObject();

        new Thread(t::m,"t1").start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2 = new Thread(t::m, "t2");

        //锁对象发生改变，所以t2线程得以执行，如果注释掉这句话，线程2将永远得不到执行机会
        //t.o = new Object();


        t2.start();


    }
}
