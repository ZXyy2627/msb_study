package com.lucky.patterns.abstractFactory;

public abstract class AbstractFactory {
    abstract Food createFood();

    abstract Vehicle createVehicle();

    abstract Weapon createWeapon();
}
