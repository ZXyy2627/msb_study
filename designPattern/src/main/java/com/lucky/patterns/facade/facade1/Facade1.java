package com.lucky.patterns.facade.facade1;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 14:28
 * @Description: com.lucky.patterns.facade.facade1
 * @VERSION: 1.0
 */
public class Facade1 {
    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();


    /*
    * 这里不要理解成只是调用一个方法，而应该是一个子系统做的事情
    * 现在我想让某个高层用户，只能调用子系统B做的事情，不想给他其它权限，那么我们应该这样增加一个门面Facade2
    * */
    public void doA() {
        systemA.doSomethingA();
    }

    public void doB() {
        systemB.doSomethingB();
    }

    public void doC() {
        systemC.doSomethingC();
    }
}
