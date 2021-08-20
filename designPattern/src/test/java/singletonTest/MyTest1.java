package singletonTest;

import com.lucky.testPattern.singleton2.S3;
import com.lucky.testPattern.singleton2.S6;
import org.junit.Test;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 10:49
 * @Description: singletonTest
 * @VERSION: 1.0
 */
public class MyTest1 {

    /**
     * 测试饿汉式
     */
    @Test
    public void test1() {
        S3 s1 = S3.getInstance();
        S3 s2 = S3.getInstance();
        System.out.println(s1 == s2);
        S6 s3 = S6.getInstance();
        S6 s4 = S6.getInstance();
        System.out.println(s1 == s2);
    }

    /**
     * 多线程测试
     */
    @Test
    public void test2() {

    }
}
