package com.lucky.patterns.singleton;

/**
 * 懒汉式  在方法上加锁解决线程安全问题后，使用同步代码块的方式解决方法加锁的效率问题
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;

    private Mgr05() {
    }

    public static Mgr05 getInstance() {
        if(INSTANCE == null){
            //事实上，试图通过同步代码块解决效率问题，还是出现了线程安全问题  不可行
            //为什么  分析原因 事实上多个线程在判断的时候，就出现问题 ，为了解决这个问题，使用双重检查  看Mgr06
            synchronized (Mgr05.class) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}
