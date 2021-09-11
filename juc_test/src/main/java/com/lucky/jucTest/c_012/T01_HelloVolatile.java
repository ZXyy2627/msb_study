package com.lucky.jucTest.c_012;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lucky_x
 * @Date: 2021/9/11 - 09 - 11 - 10:01
 * @Description: com.lucky.jucTest.c_012
 * @VERSION: 1.0
 *
 * 对比加不加volatile关键字代码运行的效果：
 * 1.当不加volatile关键字的时候，发现程序一直在运行，说明仍然在循环，也就是说main线程修改了flag的值，但是thread线程
 * 并未获取到修改的值
 *
 * 2.当加了volatile关键字的时候，发现程序按照预想的，1秒后就停了，原因就是thread线程看到了被main线程修改的flag的值
 *
 * 所以volatile的作用1：保证线程间的可见性，强制CPU去内存中读取变量，而不是获取一开始copy的那一份
 */
public class T01_HelloVolatile {

    private volatile boolean flag = true;

    public void m() {
        System.out.println("m start");
        while (flag) {

        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        T01_HelloVolatile t = new T01_HelloVolatile();
        new Thread(t::m,"thread").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.flag = false;
    }
}
