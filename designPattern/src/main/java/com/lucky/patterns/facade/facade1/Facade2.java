package com.lucky.patterns.facade.facade1;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 14:36
 * @Description: com.lucky.patterns.facade.facade1
 * @VERSION: 1.0
 */
public class Facade2 {
    private final Facade1 facade1 = new Facade1();

    /*
    * 在这里，Facade2就只提供了子系统B做的事情，没有其它子系统的权限
    * */
    public void doB() {
        facade1.doB();
    }
}
