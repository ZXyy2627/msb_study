package com.lucky.jucTest.c_017;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @Author: lucky_x
 * @Date: 2021/9/16 - 09 - 16 - 21:41
 * @Description: com.lucky.jucTest.c_017
 * @VERSION: 1.0
 */
public class T13_TestLockSupport {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println(i);
                    if(i == 5) LockSupport.park();
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();

        /*LockSupport.unpark(t);*/

        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after 8  seconds");
        LockSupport.unpark(t);
    }
}
