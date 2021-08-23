package com.lucky.patterns.factoryMethod.normal2;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 10:21
 * @Description: com.lucky.patterns.factoryMethod.normal2
 * @VERSION: 1.0
 */
public class Car implements Moveable{
    @Override
    public void move() {
        System.out.println("running .....");
    }
}
