package com.lucky.jucTest.c_002;

/**
 * @Author: lucky_x
 * @Date: 2021/9/9 - 09 - 09 - 7:14
 * @Description: com.lucky.jucTest.c_002
 * @VERSION: 1.0
 */
public class T {
    private int count = 10;

    public void m() {
        synchronized (this) {//任何线程，想要执行下面的代码就必须拿到锁
            count--;
            System.out.println(Thread.currentThread().getName()+ "count = " + count);
        }
    }
}
