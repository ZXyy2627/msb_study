package com.lucky.patterns.responsibilityChain.chain1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 16:37
 * @Description: com.lucky.patterns.responsibilityChain.chain1
 * @VERSION: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        List<IWomen> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Women(random.nextInt(4), "我要出去逛街"));
        }
        Handler fatherHandler = new FatherHandler();
        Handler husbandHandler = new HusbandHandler();
        Handler sonHandler = new SonHandler();
        fatherHandler.setNextHandler(husbandHandler);
        husbandHandler.setNextHandler(sonHandler);
        for (IWomen women : list) {
            fatherHandler.handlerMessage(women);
            System.out.println("------------------------------");
        }
    }
}
