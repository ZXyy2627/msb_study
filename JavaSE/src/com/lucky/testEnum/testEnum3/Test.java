package com.lucky.testEnum.testEnum3;

/**
 * @Author: lucky_x
 * @Date: 2021/8/12 - 08 - 12 - 9:41
 * @Description: com.lucky.testEnum.testEnum3
 * @VERSION: 1.0
 * 常用的枚举类方法：
 *  static values()获得枚举数组
 *  static valueOf(String name) 通过枚举名获取枚举对象
 */
public class Test {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season);
        Season[] seasons = Season.values();
        for (Season s : seasons) {
            System.out.println(s);
        }

        Season season1 = Season.valueOf("WINTER");
        System.out.println(season1);
    }
}
