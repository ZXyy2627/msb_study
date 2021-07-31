package com.lucky.patterns.abstractFactory;

import com.lucky.patterns.simpleFactory.CarFactory;
import com.lucky.patterns.simpleFactory.Moveable;

public class Main {
    public static void main(String[] args) {
        //如果要替换，只需要将new 的Factory修改一下即可 ，下面的代码无需修改
        AbstractFactory f = new ModernFactory();
        Vehicle vehicle = f.createVehicle();
        vehicle.go();
        Food food = f.createFood();
        food.eat();
        Weapon weapon = f.createWeapon();
        weapon.shoot();
    }
}
