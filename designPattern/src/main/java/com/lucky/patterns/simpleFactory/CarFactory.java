package com.lucky.patterns.simpleFactory;

public class CarFactory {
    public static Moveable createCar(){
        System.out.println("a car created");
        return new Car();
    }
}
