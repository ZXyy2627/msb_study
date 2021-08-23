package com.lucky.patterns.facade.importantFacade;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 14:56
 * @Description: com.lucky.patterns.facade.importantFacade
 * @VERSION: 1.0
 */
public class SystemD {
    private final SystemA systemA = new SystemA();
    private final SystemC systemC = new SystemC();

    public void doD() {
        systemA.doSomethingA();
        systemC.doSomethingC();
    }
}
