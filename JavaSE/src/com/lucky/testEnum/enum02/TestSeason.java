package com.lucky.testEnum.enum02;

public class TestSeason {
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        //如果枚举类没有重写toString方法，打印这个枚举对象的时候，就是枚举常量的名字，而不是常规的对象的地址值
        System.out.println(winter);
        //枚举类的上层父类是java.lang.Enum
        //而1.5之前自定义枚举类的上层父类是java.lang.Object
        System.out.println(Season.class.getSuperclass());
        System.out.println(winter.getSeasonName());
    }
}
