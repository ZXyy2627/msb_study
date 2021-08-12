package com.lucky.testEnum.testEnum2;

/**
 * @Author: lucky_x
 * @Date: 2021/8/12 - 08 - 12 - 9:30
 * @Description: com.lucky.testEnum.testEnum2
 * @VERSION: 1.0
 * JDK1.5之后出现了enum关键字，我们便不需要再像1那样写枚举类对象了
 * 但是要注意，枚举对象，必须放在最前面，并且不需要通过new 关键子来创建对象
 * 其实toString方法也没有必要使用了，但是还是可以有getter和setter
 * 没有toString方法直接打印的是枚举对象的变量名
 */
public enum Season {

    SPRING("春天", "万物复苏"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "硕果累累"),
    WINTER("冬天", "冰天雪地");


    private final String seasonName;
    private final String desc;

    private Season(String seasonName, String desc) {
        this.seasonName = seasonName;
        this.desc = desc;
    }

}
