package com.lucky.patterns.abstractFactory.humanTest;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 23:00
 * @Description: com.lucky.patterns.abstractFactory.humanTest
 * @VERSION: 1.0
 */
public class WhiteHumanFactory implements GenderHumanFactory {
    @Override
    public AbstractFemaleHuman createFemale() {
        return new WhiteFemaleHuman();
    }

    @Override
    public AbstractMaleHuman createMale() {
        return new WhiteMaleHuman();
    }
}
