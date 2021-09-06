package com.lucky.patterns.responsibilityChain;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 15:43
 * @Description: com.lucky.patterns.responsibilityChain
 * @VERSION: 1.0
 */
public class SonHandler implements Handler{
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("母亲的请求是:"+women.getRequest());
        System.out.println("儿子的答复是:同意");
    }
}
