package com.lucky.testPattern.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(5, 7), new Cat(3, 3), new Cat(1, 9)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(cats,new CatHeightComparator());
        System.out.println(Arrays.toString(cats));
    }
}
