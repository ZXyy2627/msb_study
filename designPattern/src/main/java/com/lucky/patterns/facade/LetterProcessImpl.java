package com.lucky.patterns.facade;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 13:55
 * @Description: com.lucky.patterns.facade
 * @VERSION: 1.0
 */
public class LetterProcessImpl implements ILetterProcess{
    @Override
    public void writeContext(String context) {
        System.out.println("信的内容是:"+context);
    }

    @Override
    public void fillEnvelope(String addresses) {
        System.out.println("信的地址是:"+addresses);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放到信封中");
    }

    @Override
    public void sendLetter() {
        System.out.println("发送信件");
    }
}
