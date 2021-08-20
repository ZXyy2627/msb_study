package com.lucky.patterns.abstractFactory.humanTest;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 23:07
 * @Description: com.lucky.patterns.abstractFactory.humanTest
 * @VERSION: 1.0
 */
public class MyTest {
    public static void main(String[] args) {
        WhiteHumanFactory whiteHumanFactory = new WhiteHumanFactory();
        AbstractFemaleHuman whiteFemale = whiteHumanFactory.createFemale();
        whiteFemale.getColor();
        AbstractMaleHuman whiteMale = whiteHumanFactory.createMale();
        whiteMale.getColor();

    }
}
