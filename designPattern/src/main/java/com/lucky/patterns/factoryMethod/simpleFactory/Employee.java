package com.lucky.patterns.factoryMethod.simpleFactory;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 16:44
 * @Description: com.lucky.patterns.factoryMethod.simpleFactory
 * @VERSION: 1.0
 */
public class Employee implements Person {
    @Override
    public void eat() {
        System.out.println("自己解决吃饭问题");
    }

    @Override
    public void sleep() {
        System.out.println("回家睡觉");
    }
}
