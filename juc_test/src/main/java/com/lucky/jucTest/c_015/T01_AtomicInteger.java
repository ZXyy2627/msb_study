package com.lucky.jucTest.c_015;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: lucky_x
 * @Date: 2021/9/14 - 09 - 14 - 21:07
 * @Description: com.lucky.jucTest.c_015
 * @VERSION: 1.0
 * 使用AtomicXXX类，这个类的方法是原子操作  相当于优化了volatile的功能
 * volatile可以保证可见性，但无法保证原子性
 */
public class T01_AtomicInteger {
    AtomicInteger count  = new AtomicInteger();

    void m() {
        for (int i = 0; i < 10000; i++) {
            count.incrementAndGet();
        }
    }

    public static void main(String[] args) {
        T01_AtomicInteger t = new T01_AtomicInteger();

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(t::m,"thread"+i));
        }

        threads.forEach(o->o.start());

        threads.forEach((o)->{
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println(t.count);
    }
}
