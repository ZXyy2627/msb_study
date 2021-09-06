package com.lucky.patterns.responsibilityChain.chain1;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 16:30
 * @Description: com.lucky.patterns.responsibilityChain.chain1
 * @VERSION: 1.0
 */
public class FatherHandler extends Handler{

    public FatherHandler() {
        super(FATHER_LEVEL_REQUEST);
    }


    @Override
    protected void response(IWomen women) {
        System.out.println("----女儿向父亲请示----");
        System.out.println(women.getRequest());
        System.out.println("父亲得答复是:同意");
    }
}
