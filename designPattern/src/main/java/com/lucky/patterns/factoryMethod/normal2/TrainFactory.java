package com.lucky.patterns.factoryMethod.normal2;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 10:27
 * @Description: com.lucky.patterns.factoryMethod.normal2
 * @VERSION: 1.0
 */
public class TrainFactory extends AbstractFactory{
    @Override
    public Moveable getInstance() {
        return new Train();
    }
}
