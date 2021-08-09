package com.lucky.testEnum.testaaa;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: lucky_x
 * @Date: 2021/8/7 - 08 - 07 - 21:04
 * @Description: com.lucky.testEnum.testaaa
 * @VERSION: 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        int age = 10;
        System.out.println("age = " + age);
        int b =20;
        int c = 40;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Test1.main");
        System.out.println("args = " + Arrays.deepToString(args));

    }

    public static void sort(int a) {
        System.out.println("a = " + a);
    }

    public static void show(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }

    public static void judge() {
        ArrayList<Object> list = new ArrayList<>();
        if (list != null) {

        }
    }
}
