package com.lucky.jucTest.c_012;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lucky_x
 * @Date: 2021/9/11 - 09 - 11 - 21:31
 * @Description: com.lucky.jucTest.c_012
 * @VERSION: 1.0
 *
 * volatile只能保证可见性，但synchronized可以保证可见性和原子性
 */
public class T05_VolatileVsSync {
    int count = 0;

    synchronized void m() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public static void main(String[] args) {
        T05_VolatileVsSync t = new T05_VolatileVsSync();

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(t::m,"thread"+i));
        }

        threads.forEach(o -> o.start());

        threads.forEach((o) -> {
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println(t.count);
    }
}
