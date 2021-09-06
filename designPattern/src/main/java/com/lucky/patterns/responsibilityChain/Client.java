package com.lucky.patterns.responsibilityChain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: lucky_x
 * @Date: 2021/8/23 - 08 - 23 - 15:44
 * @Description: com.lucky.patterns.responsibilityChain
 * @VERSION: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        List<Women> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Women(random.nextInt(4), "我要出去逛街"));
        }
        Handler fatherHandler = new FatherHandler();
        Handler husbandHandler = new HusbandHandler();
        Handler sonHandler = new SonHandler();

        for (IWomen women : list) {
            if (women.getType() == 1) {
                fatherHandler.handleMessage(women);
            } else if (women.getType() == 2) {
                husbandHandler.handleMessage(women);
            } else if (women.getType() == 3) {
                sonHandler.handleMessage(women);
            }else{
                System.out.println("类型不对，按不同意处理");
            }
        }
        /*
        * 缺点：职责不清晰，女儿的请求应该在父亲类中做出处理，而不是在客户端去处理，也就是说现在的逻辑是
        * 在客户端中组装出来的，这个请求应该在每个Handler中判断并做出处理，
        * 应该是假设妻子发送请求到父亲，父亲得到了女儿的状态已经出嫁了，那么他不处理，交给它的丈夫去处理
        *
        * 另外，代码耦合度过高，客户端不应该有这么多if else去处理逻辑并且，如果你新增了一个Handler ,那么
        * 你就得改造客户端，继续增加if else
        *
        * 所以必须修改:
        * 父亲，丈夫，儿子每个节点应该有两个选择：要么承担处理得责任，要么交给下一个人处理
        * */
    }
}
