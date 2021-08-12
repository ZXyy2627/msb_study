package com.lucky.studyEnum.enum01;

/**
 * 其实枚举也是一个类，也可以有属性，构造器和方法
 * 但是注意枚举类的对象是确定的，也就是说它的某个对象的属性值是不能变的 所以用final修饰
 * 构造器私有化
 * 然后在类的内部创建出几个固定的对象，就是枚举类了
 * 也可以提供对外的get方法，不要提供set方法就可以了
 *
 * 这是JDK1.5之前自定义枚举类
 */
public class Season {
    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public static final Season SPRING = new Season("春天", "万物复苏");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "硕果累累");
    public static final Season WINTER = new Season("冬天", "冰天雪地");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
