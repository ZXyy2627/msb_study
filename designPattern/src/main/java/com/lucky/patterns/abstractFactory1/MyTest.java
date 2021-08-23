package com.lucky.patterns.abstractFactory1;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 11:05
 * @Description: com.lucky.patterns.abstractFactory1
 * @VERSION: 1.0
 */
public class MyTest {
    public static void main(String[] args) {
        CarFactory benzFactory = new BenzCarFactory();
        CarFactory audiFactory = new AudiCarFactory();
        Car benzNormalCar = benzFactory.createNormalCar();
        benzNormalCar.running();
        Car benzSportsCar = benzFactory.createSportsCar();
        benzSportsCar.running();
        Car audiNormalCar = audiFactory.createNormalCar();
        audiNormalCar.running();
        Car audiSportsCar = audiFactory.createSportsCar();
        audiSportsCar.running();
        //现在来了一个特斯拉公司，也有两种车 电动普通车，电动跑车  这种情况下也容易扩展，添加一个特斯拉工厂即可
    }
}
