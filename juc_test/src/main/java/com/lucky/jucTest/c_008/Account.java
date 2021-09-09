package com.lucky.jucTest.c_008;

/**
 * @Author: lucky_x
 * @Date: 2021/9/9 - 09 - 09 - 14:30
 * @Description: com.lucky.jucTest.c_008
 * @VERSION: 1.0
 *
 * 面试题：模拟银行账户对读方法不加锁，对写方法加锁，这样行不行？
 * 不行，会产生脏读
 */
public class Account {
    private String name;
    private double balance;

    public synchronized void set(String name, double balance) {
        this.name = name;
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        Account a = new Account();
        new Thread(() -> a.set("zhangSan",100.0)).start();

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println( a.getBalance());

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(a.getBalance());
    }
}
