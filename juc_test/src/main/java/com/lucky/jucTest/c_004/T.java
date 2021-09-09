package com.lucky.jucTest.c_004;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lucky_x
 * @Date: 2021/9/9 - 09 - 09 - 13:57
 * @Description: com.lucky.jucTest.c_004
 * @VERSION: 1.0
 *
 * static synchronized方法锁的当前类的class对象
 * 对比静态方法 锁T.class对象是否是同一个锁
 */
public class T {
    static synchronized void m(){
        for (int i = 0; i < 10; i++) {
            System.out.println("m" + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static void mm(){
        synchronized (T.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println("mm"+i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(T::m).start();

        new Thread(T::mm).start();
    }
}
