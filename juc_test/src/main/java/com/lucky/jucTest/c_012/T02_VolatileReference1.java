package com.lucky.jucTest.c_012;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lucky_x
 * @Date: 2021/9/11 - 09 - 11 - 20:21
 * @Description: com.lucky.jucTest.c_012
 * @VERSION: 1.0
 *
 * volatile修饰引用类型的变量 ，只能保证该引用在线程间的可见性，不能保证该引用内部的数据在线程间的可见性
 *
 * 从代码中可以看到，volatile修饰的引用类型变量T的属性running被main线程修改后，线程T并没有停止，而是继续运行，
 * 说明线程T并没有看见running属性被修改为false
 *
 */
public class T02_VolatileReference1 {
    boolean running = true;

    volatile static T02_VolatileReference1 T = new T02_VolatileReference1();

    void m() {
        System.out.println("m start");
        while (running) {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        new Thread(T::m,"t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        T.running = false;
    }

}
