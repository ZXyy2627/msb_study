package com.lucky.jucTest.c_001;

/**
 * @Author: lucky_x
 * @Date: 2021/9/9 - 09 - 09 - 7:09
 * @Description: com.lucky.jucTest.c_001
 * @VERSION: 1.0
 * synchronized关键字，是加锁
 * 如果是同步方法 ，锁是当前对象也就是this
 * synchronized锁的都是对象，而不是代码，并且如果锁的是.class那就是Class类的对象
 * 这里只是演示synchronized同步代码块的写法
 */
public class T {
    private int count = 10;
    private final Object o = new Object();

    public void m(){
        synchronized (o) {
            count--;
            System.out.println(Thread.currentThread().getName()+" count:" +count);
        }
    }

}
