package com.lucky.jucTest.c_012;

/**
 * @Author: lucky_x
 * @Date: 2021/9/11 - 09 - 11 - 20:46
 * @Description: com.lucky.jucTest.c_012
 * @VERSION: 1.0
 *
 * 继续验证volatile修饰引用类型对象，其中的属性值改变不可见
 */
public class T03_VolatileReference2 {

    private static class Data {
        int a,b;

        public Data(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    volatile static Data data;

    public static void main(String[] args) {
        Thread writer = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                data = new Data(i, i);
            }
        });

        Thread reader = new Thread(() -> {
            while(data == null ) {}
            int x = data.a;
            int y = data.b;
            if (x != y) {
                System.out.printf("a=%s , b=%s%n",x,y);
            }
        });

        reader.start();
        writer.start();

        try {
            reader.join();
            writer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }

}
