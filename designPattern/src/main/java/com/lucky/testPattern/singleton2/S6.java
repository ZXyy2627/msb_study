package com.lucky.testPattern.singleton2;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 14:24
 * @Description: com.lucky.testPattern.singleton2
 * @VERSION: 1.0
 */
public class S6 {
    private static S6 INSTANCE;

    static {
        INSTANCE = new S6();
    }

    private S6() {

    }

    public static S6 getInstance() {
        return INSTANCE;
    }


}
