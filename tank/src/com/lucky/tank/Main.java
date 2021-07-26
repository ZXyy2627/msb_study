package com.lucky.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * tank运行主类
 *
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();
        for(int i=0;i<5;i++){
            tf.enemies.add(new Tank(50 + i * 80, 200, Dir.DOWN,Group.BAD, tf));
        }
        while (true){
            Thread.sleep(50);
            tf.repaint();
        }
    }
}
