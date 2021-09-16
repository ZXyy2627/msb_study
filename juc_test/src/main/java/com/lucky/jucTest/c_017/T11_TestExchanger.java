package com.lucky.jucTest.c_017;

import java.util.concurrent.Exchanger;

/**
 * @Author: lucky_x
 * @Date: 2021/9/16 - 09 - 16 - 20:57
 * @Description: com.lucky.jucTest.c_017
 * @VERSION: 1.0
 *
 * 只能两个线程之间两两交换
 */
public class T11_TestExchanger {

    static Exchanger<String> exchanger = new Exchanger<>();
    public static void main(String[] args) {
        new Thread( () -> {
            String s = "s1111";
            try {
                s = exchanger.exchange(s);
                System.out.println(Thread.currentThread().getName()+": s = " + s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1").start();

        new Thread( () -> {
            String s = "s2222";
            try {
                s = exchanger.exchange(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": s = " + s);
        },"t2").start();

    }
}
