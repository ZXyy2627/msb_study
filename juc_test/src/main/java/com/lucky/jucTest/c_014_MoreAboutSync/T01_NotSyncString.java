package com.lucky.jucTest.c_014_MoreAboutSync;

/**
 * @Author: lucky_x
 * @Date: 2021/9/11 - 09 - 11 - 21:59
 * @Description: com.lucky.jucTest.c_014_MoreAboutSync
 * @VERSION: 1.0
 *
 * 使用synchronized时，不要用String类型作为锁
 *
 * 假设下面的代码中，你把"Hello"作为锁，你可能也会使用其它的类库  因为你看不到类库的源码，可能它也是使用"Hello"作为锁
 * 这样会造成非常诡异的死锁现象
 */
public class T01_NotSyncString {
    String s1 = "Hello";
    String s2 = "Hello";

    void m1() {
        synchronized (s1) {

        }
    }

    void m2() {
        synchronized (s2) {

        }
    }
}
