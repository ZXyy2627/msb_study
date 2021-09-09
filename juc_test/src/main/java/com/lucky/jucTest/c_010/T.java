package com.lucky.jucTest.c_010;

import java.util.concurrent.TimeUnit;

/**
 * @Author: lucky_x
 * @Date: 2021/9/9 - 09 - 09 - 21:21
 * @Description: com.lucky.jucTest.c_010
 * @VERSION: 1.0
 *
 * 如果synchronized方法被子类重写，也有可重入性，也就是在子类调用父类的同步方法，也具有可重入性
 */
public class T {
    public synchronized void m() {
        System.out.println("m start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        new TT().m();
    }
}

class TT extends T{
    @Override
    public synchronized void m() {
        System.out.println("child m start");
        super.m();
        System.out.println("child m end");
    }
}
