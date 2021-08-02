package com.lucky.testEnum.enum03;

/**
 * 一般情况下，枚举类没有具体的属性，那么这时候，就只剩下常量名了，也不需要getter方法了，也不需要私有构造器了
 * 多线程中线程状态枚举类就是例子
 */
public enum Season {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;
}
