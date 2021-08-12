package com.lucky.studyEnum.enum03;

/**
 * 测试枚举类的常见方法
 * 1.toString方法 获取枚举的名字 当然也可以不使用toString 直接使用枚举常量名即可
 * 2.valueOf方法 通过枚举的名字获取这个枚举对象
 * 3.values方法  获取所有的枚举对象，返回对象数组
 */
public class Main {
    public static void main(String[] args) {

        Season summer = Season.SUMMER;
        System.out.println(summer); //SUMMER
        System.out.println(summer.toString());//SUMMER

        Season autumn = Season.valueOf("AUTUMN");
        System.out.println(autumn);

        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season);
        }

    }
}
