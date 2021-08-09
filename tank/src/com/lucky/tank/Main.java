package com.lucky.tank;


/**
 * tank运行主类
 *
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //DefaultFactory defaultFactory = new DefaultFactory();
        TankFrame tf = new TankFrame();
        while (true){
            Thread.sleep(50);
            tf.repaint();
        }
    }
}
