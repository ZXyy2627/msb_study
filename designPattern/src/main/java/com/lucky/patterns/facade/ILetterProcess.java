package com.lucky.patterns.facade;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 13:53
 * @Description: com.lucky.patterns.facade
 * @VERSION: 1.0
 */
public interface ILetterProcess {
    void writeContext(String context);

    void fillEnvelope(String addresses);

    void letterIntoEnvelope();

    void sendLetter();
}
