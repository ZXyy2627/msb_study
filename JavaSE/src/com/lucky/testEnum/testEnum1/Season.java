package com.lucky.testEnum.testEnum1;

/**
 * @Author: lucky_x
 * @Date: 2021/8/12 - 08 - 12 - 9:22
 * @Description: com.lucky.testEnum.testEnum1
 * @VERSION: 1.0
 *
 * 在JDK1.5之前，就是这么写的，枚举类和普通类的区别就在于，是列举了几个固定的对象，
 */
public class Season {
    //enum枚举类和普通类一样，都可以有属性和方法 只不过属性值是固定的
    private final String seasonName;
    private final String desc;

    private Season(String seasonName, String desc) {
        this.seasonName = seasonName;
        this.desc = desc;
    }

    public static final Season SPRING = new Season("春天", "万物复苏");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "硕果累累");
    public static final Season WINTER = new Season("冬天", "冰天雪地");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
