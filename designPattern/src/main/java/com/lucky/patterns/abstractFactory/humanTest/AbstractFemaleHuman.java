package com.lucky.patterns.abstractFactory.humanTest;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 22:44
 * @Description: com.lucky.patterns.abstractFactory.humanTest
 * @VERSION: 1.0
 */
public abstract class AbstractFemaleHuman implements Human{
    @Override
    public void talk() {
        System.out.println("我们都是用嘴说话");
    }
}
