package com.lucky.testPattern.singleton2;

/**
 * 静态内部类
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 14:29
 * @Description: com.lucky.testPattern.singleton2
 * @VERSION: 1.0
 */
public class S7 {

    private static class S7Holder{
        private static S7 INSTANCE = new S7();
    }

    private S7() {

    }

    public static S7 getInstance() {
        return S7Holder.INSTANCE;
    }
}
