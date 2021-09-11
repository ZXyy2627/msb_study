package com.lucky.jucTest.c_013;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lucky_x
 * @Date: 2021/9/11 - 09 - 11 - 21:48
 * @Description: com.lucky.jucTest.c_013
 * @VERSION: 1.0
 *
 * synchronized优化
 * 将不是操作共享资源的代码进行更细粒度的优化
 */
public class T01_FineCoarseLock {
    int count = 0;
    synchronized void m1() {
        //模拟做其它操作消耗的时间
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //业务逻辑中只有下面这句需要sync，这时不应该给整个方法上锁
        count++;
        //模拟做其它操作消耗的时间
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void m2() {
        //模拟做其它操作消耗的时间
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //业务逻辑中只有下面这句需要sync，这时不应该给整个方法上锁
        //采用细粒度的锁，可以使线程争用时间变短，从而提高效率
        synchronized (this) {
            count++;
        }

        //模拟做其它操作消耗的时间
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
