package com.lucky.patterns.abstractFactory;

public class MagicFactory extends AbstractFactory{
    @Override
    Food createFood() {
        return new Rice();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
