package com.lucky.factory;

import com.lucky.pojo.Person;

/**
 * @Author: lucky_x
 * @Date: 2021/8/18 - 08 - 18 - 20:57
 * @Description: com.lucky.factory
 * @VERSION: 1.0
 */
public class InstanceFactory {
    public Person getInstance(String name) {
        Person person = new Person();
        person.setId(9);
        person.setName(name);
        return person;
    }

    public Person getInstance() {
        Person person = new Person();
        person.setId(99);
        person.setName("余99");
        return person;
    }
}
