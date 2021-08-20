package com.lucky.testPattern.singleton2;

/**
 *
 * 解决同步代码块引发的线程安全问题
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 14:04
 * @Description: com.lucky.testPattern.singleton2
 * @VERSION: 1.0
 */
public class S5 {
    private static S5 INSTANCE;

    private S5() {

    }

    public static S5 getInstance() throws InterruptedException {
        if (INSTANCE == null) {
            synchronized (S5.class) {
                if (INSTANCE == null) {
                    Thread.sleep(50);
                    INSTANCE = new S5();
                }
            }
        }
        return INSTANCE;
    }
}
