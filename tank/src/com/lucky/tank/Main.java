package com.lucky.tank;

import java.awt.*;


/**
 * tank运行主类
 *
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //DefaultFactory defaultFactory = new DefaultFactory();
        TankFrame tf = new TankFrame();

        int initTankCount = Integer.parseInt((String)PropertyMgr.get("initTankCount"));
        for(int i=0;i<initTankCount;i++){
            tf.enemies.add(new Tank(50 + i * 80, 200, Dir.DOWN,Group.BAD, tf));
            //tf.enemies.add((Tank) defaultFactory.createTank(50 + i * 80, 200, Dir.DOWN,Group.BAD, tf));
        }
        while (true){
            Thread.sleep(50);
            tf.repaint();
        }
    }
}
