package com.lucky.patterns.facade;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 14:08
 * @Description: com.lucky.patterns.facade
 * @VERSION: 1.0
 */
public class PoliceCheck {
    public void checkContext(ILetterProcess letterProcess) {
        System.out.println(letterProcess+"完成新建内容的检查，可以发送信件");
    }
}
