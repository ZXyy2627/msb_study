package com.lucky.patterns.factoryMethod.normal2;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 10:28
 * @Description: com.lucky.patterns.factoryMethod.normal2
 * @VERSION: 1.0
 */
public class MyTest {
    public static void main(String[] args) {
        //一开始我们只有两个产品，plane和car
        CarFactory carFactory = new CarFactory();
        PlaneFactory planeFactory = new PlaneFactory();
        Moveable car = carFactory.getInstance();
        Moveable plane = planeFactory.getInstance();
        car.move();
        plane.move();
        TrainFactory trainFactory = new TrainFactory();
        Moveable train = trainFactory.getInstance();
        train.move();
    }
}
