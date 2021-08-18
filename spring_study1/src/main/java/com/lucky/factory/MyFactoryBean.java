package com.lucky.factory;

import com.lucky.pojo.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: lucky_x
 * @Date: 2021/8/18 - 08 - 18 - 21:15
 * @Description: com.lucky.factory
 * @VERSION: 1.0
 */
public class MyFactoryBean implements FactoryBean<Person> {
    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setId(9999999);
        return person;
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }
}
