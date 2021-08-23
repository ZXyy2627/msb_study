package com.lucky.patterns.abstractFactory1;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 10:58
 * @Description: com.lucky.patterns.abstractFactory1
 * @VERSION: 1.0
 */
public class BenzNormalCar extends NormalCar{
    @Override
    public void running() {
        System.out.println("我是奔驰普通车，我正常跑");
    }
}
