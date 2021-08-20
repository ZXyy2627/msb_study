package com.lucky.patterns.factoryMethod.normal;

/**
 * 工厂方法模式：工厂类
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 21:04
 * @Description: com.lucky.patterns.factoryMethod.normal
 * @VERSION: 1.0
 */
public abstract class AbstractFactory {
    public abstract <T extends Human> T createHuman(Class<T> clazz);
}
