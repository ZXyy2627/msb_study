package com.lucky.patterns.singleton;

/**
 *  这种方式和Mgr01是一样的，只不过将INSTANCE的初始化放到静态代码块中执行了  静态的代码块也是类加载的时候就会执行
 */
public class Mgr02 {
    private static final Mgr02 INSTANCE;

    static {
        INSTANCE = new Mgr02();
    }

    private Mgr02() {

    }

    public static Mgr02 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }
}
