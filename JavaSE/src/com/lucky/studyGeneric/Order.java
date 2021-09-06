package com.lucky.studyGeneric;

/**
 * @Author: lucky_x
 * @Date: 2021/8/27 - 08 - 27 - 17:33
 * @Description: com.lucky.studyGeneric
 * @VERSION: 1.0
 */
public class Order<T> {
    String orderName;
    int orderId;
    T orderT;

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }
}
