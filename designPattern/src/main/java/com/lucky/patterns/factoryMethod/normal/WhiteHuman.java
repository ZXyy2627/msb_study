package com.lucky.patterns.factoryMethod.normal;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 22:00
 * @Description: com.lucky.patterns.factoryMethod.normal
 * @VERSION: 1.0
 */
public class WhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("我是白种人");
    }

    @Override
    public void talk() {
        System.out.println("我们用屁股交流");
    }
}
