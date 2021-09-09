package com.lucky.jucTest.c_006;

/**
 * @Author: lucky_x
 * @Date: 2021/9/9 - 09 - 09 - 14:12
 * @Description: com.lucky.jucTest.c_006
 * @VERSION: 1.0
 * 对比一下c005种的程序，分析一下这段代码的输出
 *
 * 首先对于当前对象而言，上个程序是所有线程共享一个，也就是所有线程共享的是一把锁，而本例是所有线程拿到一把属于自己的锁
 * 并且操作的不是同一个count，即操作的不是共享的变量
 */
public class T implements Runnable{

    private int count = 10;

    @Override
    public synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            T t = new T();
            new Thread(t,"Thread"+i).start();
        }
    }
}
