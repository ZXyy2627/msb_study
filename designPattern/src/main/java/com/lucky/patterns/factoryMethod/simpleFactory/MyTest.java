package com.lucky.patterns.factoryMethod.simpleFactory;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 16:46
 * @Description: com.lucky.patterns.factoryMethod.simpleFactory
 * @VERSION: 1.0
 */
public class MyTest {
    public static void main(String[] args) {
        SimpleFactoryOfPerson factory = new SimpleFactoryOfPerson();
        Person employee = factory.createEmployee();
        employee.eat();
        employee.sleep();
        Person student = factory.creatStudent();
        student.eat();
        student.sleep();
    }
}
