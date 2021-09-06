package com.lucky.patterns.responsibilityChain.chain1;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 16:36
 * @Description: com.lucky.patterns.responsibilityChain.chain1
 * @VERSION: 1.0
 */
public class SonHandler extends Handler{
    public SonHandler() {
        super(SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("----母亲向儿子请示----");
        System.out.println(women.getRequest());
        System.out.println("儿子的回复是:同意");
    }
}
