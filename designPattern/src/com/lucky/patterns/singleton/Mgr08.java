package com.lucky.patterns.singleton;

/**
 * 这是完美中的完美，使用枚举单例 不仅可以解决线程安全问题，还可以防止反序列化
 */
public enum Mgr08 {
    INSTANCE;

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }
}
