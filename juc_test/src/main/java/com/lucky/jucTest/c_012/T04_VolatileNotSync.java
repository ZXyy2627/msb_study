package com.lucky.jucTest.c_012;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lucky_x
 * @Date: 2021/9/11 - 09 - 11 - 20:59
 * @Description: com.lucky.jucTest.c_012
 * @VERSION: 1.0
 *
 * 证明volatile只是能保证可见性，但是不能保证数据的一致性
 */
public class T04_VolatileNotSync {
    volatile int count = 0;


    void m() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public static void main(String[] args) {
        T04_VolatileNotSync t = new T04_VolatileNotSync();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(t::m,"thread"+i));
        }
        threads.forEach((o)->o.start());

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
