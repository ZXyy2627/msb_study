package com.lucky.testPattern.singleton2;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 13:48
 * @Description: com.lucky.testPattern.singleton2
 * @VERSION: 1.0
 */
public class MainTest {
    public static void main(String[] args) {
            for (int i = 0; i < 100; i++) {
                new Thread(() -> {
                    try {
                        Thread.sleep(50);
                        System.out.println(S7.getInstance());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
    }
}
