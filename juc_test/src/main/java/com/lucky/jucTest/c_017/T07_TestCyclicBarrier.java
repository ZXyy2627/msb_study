package com.lucky.jucTest.c_017;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author: lucky_x
 * @Date: 2021/9/16 - 09 - 16 - 16:39
 * @Description: com.lucky.jucTest.c_017
 * @VERSION: 1.0
 *
 * 循环栅栏，一旦到达设定值，放倒栅栏，
 */
public class T07_TestCyclicBarrier {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(20,()->System.out.println("满人，发车"));

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    barrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
