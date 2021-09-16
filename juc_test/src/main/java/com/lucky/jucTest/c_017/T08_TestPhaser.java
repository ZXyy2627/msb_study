package com.lucky.jucTest.c_017;

import java.util.Random;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * @Author: lucky_x
 * @Date: 2021/9/16 - 09 - 16 - 16:58
 * @Description: com.lucky.jucTest.c_017
 * @VERSION: 1.0
 *
 * 阶梯：多个栅栏，就像过关一样，所有人都做完了才能过这一关
 */
public class T08_TestPhaser {
    static Random r = new Random();
    static MarryPhaser marryPhaser = new MarryPhaser();

    public static void main(String[] args) {
        //比如有包括新郎新娘7个人参加婚礼
        marryPhaser.bulkRegister(7);

        new Thread(new Person("新郎")).start();
        new Thread(new Person("新娘")).start();

        for (int i = 0; i < 5; i++) {
            new Thread(new Person("p"+i)).start();
        }
    }

    static void millisecondsSleep(int milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class MarryPhaser extends Phaser {
        @Override
        protected boolean onAdvance(int phase, int registeredParties) {
            switch (phase) {
                case 0:
                    System.out.println("所有人都到达了"+registeredParties);
                    System.out.println();
                    return false;
                case 1:
                    System.out.println("所有人都吃完了"+registeredParties);
                    System.out.println();
                    return false;
                case 2:
                    System.out.println("所有人都离开了"+registeredParties);
                    System.out.println();
                    return false;
                case 3:
                    System.out.println("婚礼结束，新郎新娘入洞房！"+registeredParties);
                    return true;
                default:
                    return true;
            }
        }
    }


    static class Person implements Runnable{
        String name;

        public Person(String name) {
            this.name = name;
        }

        private void arrive() {
            millisecondsSleep(r.nextInt(1000));
            System.out.printf("%s 到达现场了 \n",name);
            marryPhaser.arriveAndAwaitAdvance();
        }

        private void eat() {
            millisecondsSleep(r.nextInt(1000));
            System.out.printf("%s 吃完了 \n",name);
            marryPhaser.arriveAndAwaitAdvance();
        }

        private void leave() {
            millisecondsSleep(r.nextInt(1000));
            System.out.printf("%s 离开了 \n",name);
            marryPhaser.arriveAndAwaitAdvance();
        }

        private void hug() {
            if ("新郎".equals(name) || "新娘".equals(name)) {
                millisecondsSleep(r.nextInt(1000));
                System.out.printf(" %s 洞房 \n",name);
                marryPhaser.arriveAndAwaitAdvance();
            }else{
                marryPhaser.arriveAndDeregister();
            }
        }

        @Override
        public void run() {
            arrive();
            eat();
            leave();
            hug();
        }
    }
}
