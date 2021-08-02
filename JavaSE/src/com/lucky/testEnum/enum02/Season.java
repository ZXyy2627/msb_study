package com.lucky.testEnum.enum02;

/**
 * JDK1.5之后使用enum关键子创建枚举类
 * 首先枚举常量必须放在最上面，多个常量使用逗号分隔
 * 所有的常量都是public static final修饰，在enum中可以省略这些修饰符 后面的new关键字也可以省略
 */
public enum Season {

    SPRING("春天", "万物复苏"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "硕果累累"),
    WINTER("冬天", "冰天雪地");

    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

/*    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }*/
}
