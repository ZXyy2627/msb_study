package com.lucky.testPattern.singleton2;

/**
 * 为了解决同步方法效率问题
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 13:51
 * @Description: com.lucky.testPattern.singleton2
 * @VERSION: 1.0
 */
public class S4 {
    private static S4 INSTANCE;

    private S4() {

    }

    /**
     * 为了解决同步方法效率低的问题，使用同步代码块
     * @return
     */
    public static S4 getInstance() throws InterruptedException {
        if(INSTANCE == null){
            synchronized (S4.class) {
                Thread.sleep(50);
                INSTANCE = new S4();
            }
        }
        return INSTANCE;
    }
}
