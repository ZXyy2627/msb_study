package com.lucky.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: lucky_x
 * @Date: 2021/8/18 - 08 - 18 - 21:54
 * @Description: com.lucky.pojo
 * @VERSION: 1.0
 */
public class PersonPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化前方法被调用");
        System.out.println(beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化后方法被调用");
        System.out.println(beanName);
        return bean;
    }
}
