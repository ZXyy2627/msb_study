package com.lucky.patterns.abstractFactory1;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 11:04
 * @Description: com.lucky.patterns.abstractFactory1
 * @VERSION: 1.0
 */
public class AudiCarFactory implements CarFactory{
    @Override
    public Car createNormalCar() {
        return new AudiNormalCar();
    }

    @Override
    public Car createSportsCar() {
        return new AudiSportsCar();
    }
}
