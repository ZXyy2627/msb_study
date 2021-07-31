package com.lucky.patterns.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例,JVM保证线程安全
 * 简单实用，推荐使用
 * 唯一缺点就是，不管用到与否，类加载的时候就已经完成初始化
 *
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();
    //单例模式要点1，把构造方法设置为private
    private Mgr01(){
    }

    //对外提供一个返回该类实例的方法
    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }
}
