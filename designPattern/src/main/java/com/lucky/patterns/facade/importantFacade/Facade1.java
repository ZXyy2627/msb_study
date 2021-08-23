package com.lucky.patterns.facade.importantFacade;

import com.lucky.patterns.facade.facade1.SystemA;
import com.lucky.patterns.facade.facade1.SystemB;
import com.lucky.patterns.facade.facade1.SystemC;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 14:28
 * @Description: com.lucky.patterns.facade.facade1
 * @VERSION: 1.0
 */
public class Facade1 {
    private final SystemA systemA = new SystemA();
    private final SystemB systemB = new SystemB();
    private final SystemC systemC = new SystemC();
    private final SystemD systemD = new SystemD();

    public void doA() {
        systemA.doSomethingA();
    }

    public void doB() {
        systemB.doSomethingB();
    }

    /*
    * 假设你想在这个方法里加上doSomethingA()的逻辑，那么你不应该在这里添加，永远记住门面模式不参与业务逻辑
    * */
    public void doC() {
        //systemA.doSomethingA(); 这是错误的，应该封装一个子系统来完成这个事情 增加子系统D
        systemC.doSomethingC();
    }

    public void doD() {
        systemD.doD();
    }
}
