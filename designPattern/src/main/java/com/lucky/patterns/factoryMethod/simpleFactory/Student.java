package com.lucky.patterns.factoryMethod.simpleFactory;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 16:42
 * @Description: com.lucky.patterns.factoryMethod.simpleFactory
 * @VERSION: 1.0
 */
public class Student implements Person {
    @Override
    public void eat() {
        System.out.println("在学校食堂吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("在寝室睡觉");
    }
}
