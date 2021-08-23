package com.lucky.patterns.abstractFactory1;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 11:02
 * @Description: com.lucky.patterns.abstractFactory1
 * @VERSION: 1.0
 */
public interface CarFactory {
    Car createNormalCar();

    Car createSportsCar();
}
