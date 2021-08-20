package com.lucky.patterns.factoryMethod.simpleFactory;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 16:45
 * @Description: com.lucky.patterns.factoryMethod.simpleFactory
 * @VERSION: 1.0
 */
public class SimpleFactoryOfPerson {
    public Person creatStudent() {
        return new Student();
    }

    public Person createEmployee() {
        return new Employee();
    }
}
