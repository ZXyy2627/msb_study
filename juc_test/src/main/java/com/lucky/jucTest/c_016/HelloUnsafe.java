package com.lucky.jucTest.c_016;

import sun.misc.Unsafe;

/**
 * @Author: lucky_x
 * @Date: 2021/9/14 - 09 - 14 - 21:52
 * @Description: com.lucky.jucTest.c_016
 * @VERSION: 1.0
 */
public class HelloUnsafe {
    static class M {
        private M() {

        }

        int i = 0;
    }

    public static void main(String[] args) throws InstantiationException {
        Unsafe unsafe = Unsafe.getUnsafe();
        M m = (M) unsafe.allocateInstance(M.class);
        m.i = 9;
        System.out.println(m.i);
    }
}
