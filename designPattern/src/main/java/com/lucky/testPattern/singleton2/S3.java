package com.lucky.testPattern.singleton2;

/**
 * 使用同步方法解决懒汉式线程安全问题
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 13:42
 * @Description: com.lucky.testPattern.singleton2
 * @VERSION: 1.0
 */
public class S3 {
    private static S3 INSTANCE;

    private S3() {

    }

    public synchronized static S3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new S3();
        }
        return INSTANCE;
    }
}
