package com.lucky.patterns.singleton;

/**
 * 懒汉式出现了线程安全问题
 * 解决办法就是加锁
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04() {
    }

    //static  synchronized 加的class锁  而不是当前对象
    //但是在方法上加锁 会导致效率低  接下来，用同步代码块的方式来解决效率问题Mgr05
    public static synchronized Mgr04 getInstance() {
        if(INSTANCE == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
