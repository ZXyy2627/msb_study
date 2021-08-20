package com.lucky.patterns.abstractFactory.humanTest;

/**
 * @Author: lucky_x
 * @Date: 2021/8/20 - 08 - 20 - 22:57
 * @Description: com.lucky.patterns.abstractFactory.humanTest
 * @VERSION: 1.0
 */
public interface GenderHumanFactory {
    AbstractFemaleHuman createFemale();

    AbstractMaleHuman createMale();
}
