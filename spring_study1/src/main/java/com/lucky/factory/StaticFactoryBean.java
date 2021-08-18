package com.lucky.factory;

import com.lucky.pojo.Person;

/**
 * @Author: lucky_x
 * @Date: 2021/8/18 - 08 - 18 - 14:16
 * @Description: com.lucky.factory
 * @VERSION: 1.0
 */
public class StaticFactoryBean {
    public static Person getInstance() {
        Person person = new Person();
        person.setId(7);
        person.setName("胡八");
        return person;
    }
}
