package com.lucky.jucTest.c_015;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * @Author: lucky_x
 * @Date: 2021/9/14 - 09 - 14 - 21:19
 * @Description: com.lucky.jucTest.c_015
 * @VERSION: 1.0
 *
 * 对比synchronized和atomicXXX类，以及LongAdder的效率
 * 每次都启动1000个线程，每次循环100000次
 */
public class T02_AtomicVsSyncVsLongAdder {
    static long count2 = 0L;
    static AtomicLong count1 = new AtomicLong(0L);
    static LongAdder count3 = new LongAdder();

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10000];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread( () -> {
                for (int j = 0; j < 100000; j++) count1.incrementAndGet();
            });
        }

        long start = System.currentTimeMillis();
        for (Thread thread : threads) thread.start();
        for (Thread thread : threads) thread.join();
        long end  = System.currentTimeMillis();
        System.out.println("AtomicLong :" + count1 + " 耗时: "+(end-start));
        //------------------------------------------------------------------------
        final Object lock = new Object();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int k = 0; k < 100000; k++) {
                        synchronized (lock) {
                            count2++;
                        }
                    }
                }
            });
        }
        start = System.currentTimeMillis();
        for (Thread thread : threads) thread.start();
        for (Thread thread : threads) thread.join();
        end  = System.currentTimeMillis();
        System.out.println("synchronized "+ count2 +" 耗时： "+(end-start));
        //-------------------------------------------------------------------
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int k = 0; k < 100000; k++) {
                    count3.increment();
                }
            });
        }

        start = System.currentTimeMillis();
        for (Thread thread : threads) thread.start();
        for (Thread thread : threads) thread.join();
        end  = System.currentTimeMillis();
        System.out.println("LongAdder "+ count3 +" 耗时： "+(end-start));



    }
}
