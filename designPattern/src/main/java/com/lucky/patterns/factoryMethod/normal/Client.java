package com.lucky.patterns.factoryMethod.normal;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 22:14
 * @Description: com.lucky.patterns.factoryMethod.normal
 * @VERSION: 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory humanFactory = new HumanFactory();
        BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        WhiteHuman whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        YellowHuman yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
