package com.lucky.patterns.abstractFactory1;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 10:59
 * @Description: com.lucky.patterns.abstractFactory1
 * @VERSION: 1.0
 */
public class AudiNormalCar extends NormalCar{
    @Override
    public void running() {
        System.out.println("我是奥迪普通车，我也正常跑");
    }
}
