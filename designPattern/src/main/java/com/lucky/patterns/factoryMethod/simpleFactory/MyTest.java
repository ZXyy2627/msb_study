package com.lucky.patterns.factoryMethod.simpleFactory;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 16:46
 * @Description: com.lucky.patterns.factoryMethod.simpleFactory
 * @VERSION: 1.0
 */
public class MyTest {
    public static void main(String[] args) {
        Person employee = SimpleFactoryOfPerson.createEmployee();
        employee.eat();
        employee.sleep();
        Person student = SimpleFactoryOfPerson.creatStudent();
        student.eat();
        student.sleep();
    }
}
