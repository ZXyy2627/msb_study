package com.lucky.patterns.responsibilityChain.chain1;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 16:34
 * @Description: com.lucky.patterns.responsibilityChain.chain1
 * @VERSION: 1.0
 */
public class HusbandHandler extends Handler{
    public HusbandHandler() {
        super(HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("----妻子向丈夫请求----");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是:同意");
    }
}
