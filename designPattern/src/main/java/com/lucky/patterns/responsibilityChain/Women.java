package com.lucky.patterns.responsibilityChain;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 15:38
 * @Description: com.lucky.patterns.responsibilityChain
 * @VERSION: 1.0
 */
public class Women implements IWomen{

    private int type = 0;
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
