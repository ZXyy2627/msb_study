package com.lucky.patterns.factoryMethod.normal;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 22:06
 * @Description: com.lucky.patterns.factoryMethod.normal
 * @VERSION: 1.0
 */
public class HumanFactory extends AbstractFactory{
    @Override
    public <T extends Human> T createHuman(Class<T> clazz) {
        Human human = null;
        try {
            human =(T)Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("产生人种错误");
        }
        return (T)human;
    }
}
