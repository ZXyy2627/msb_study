package com.lucky.patterns.singleton;

/**
 * 懒汉式
 * 就是什么时候用到这个类的对象 什么时候才加载这个实例
 * 但是这样带来了线程安全问题
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03() {

    }
    //只有在用到的时候才初始化，否则不初始化实例
    public static Mgr03 getInstance() {
        if(INSTANCE == null){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread( ()-> {
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
