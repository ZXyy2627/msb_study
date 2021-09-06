package com.lucky.patterns.responsibilityChain.chain1;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 16:23
 * @Description: com.lucky.patterns.responsibilityChain.chain1
 * @VERSION: 1.0
 */
public abstract class Handler {
    public static final int FATHER_LEVEL_REQUEST = 1;
    public static final int HUSBAND_LEVEL_REQUEST = 2;
    public static final int SON_LEVEL_REQUEST = 3;

    //能处理得级别
    private int level = 0;
    //下一个处理者
    private Handler nextHandler;
    //设置下一个处理者
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler(int level) {
        this.level = level;
    }

    public void handlerMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        }else{
            if (this.nextHandler != null) {
                this.nextHandler.handlerMessage(women);
            }else{
                System.out.println("没有人处理了，按不同意处理");
            }
        }
    }

    protected abstract void response(IWomen women);
}
