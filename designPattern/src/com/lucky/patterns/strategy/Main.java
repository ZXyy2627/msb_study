package com.lucky.patterns.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Cat[] a = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
        Dog[] a = {new Dog(5), new Dog(7), new Dog(2)};
        Sorter sorter = new Sorter();
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
