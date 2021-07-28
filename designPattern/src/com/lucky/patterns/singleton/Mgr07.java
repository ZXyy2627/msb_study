package com.lucky.patterns.singleton;

/**
 * 这是一种近乎完美的额写法
 *
 * JVM保证单例
 * 加载外部类时不会加载静态内部类，只有调用getInstance方法时才会加载静态内部类
 */
public class Mgr07 {

    private Mgr07() {
    }

    private static class Mgr07Holder{
        private final static Mgr07 INSTANCE = new Mgr07();
    }

    public static Mgr07 getInstance() {
        return Mgr07Holder.INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();
        }
    }
}
