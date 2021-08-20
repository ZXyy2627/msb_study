package com.lucky.patterns.abstractFactory.humanTest;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 22:52
 * @Description: com.lucky.patterns.abstractFactory.humanTest
 * @VERSION: 1.0
 */
public class WhiteMaleHuman extends AbstractMaleHuman{
    @Override
    public void getColor() {
        System.out.println("我是白色女人");
    }
}
