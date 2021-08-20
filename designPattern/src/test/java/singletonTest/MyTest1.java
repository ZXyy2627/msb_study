package singletonTest;

import com.lucky.testPattern.singleton2.Singleton_2;
import org.junit.Test;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 10:49
 * @Description: singletonTest
 * @VERSION: 1.0
 */
public class MyTest1 {

    /**
     * 测试懒汉式
     */
    @Test
    public void test1() {
        Singleton_2 s1 = Singleton_2.getInstance();
        Singleton_2 s2 = Singleton_2.getInstance();
        System.out.println(s1 == s2);
    }
}
