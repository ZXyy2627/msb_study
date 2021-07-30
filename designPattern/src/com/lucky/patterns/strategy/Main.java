package com.lucky.patterns.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] a = {new Cat(3,9),new Cat(5,5),new Cat(1,6)};
        //Dog[] a = {new Dog(5), new Dog(7), new Dog(2)};
        Sorter<Cat> sorter = new Sorter<Cat>();
        sorter.sort(a,new CatHeightComparator());
        System.out.println(Arrays.toString(a));
    }
}
