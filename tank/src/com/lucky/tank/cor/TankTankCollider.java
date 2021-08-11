package com.lucky.tank.cor;

import com.lucky.tank.GameObject;
import com.lucky.tank.Tank;

/**
 * @Author: lucky_x
 * @Date: 2021/8/11 - 08 - 11 - 19:23
 * @Description: com.lucky.tank.cor
 * @VERSION: 1.0
 */
public class TankTankCollider implements Collider {
    @Override
    public boolean collide(GameObject o1, GameObject o2) {
        if (o1 instanceof Tank && o2 instanceof Tank) {
            Tank t1 = (Tank) o1;
            Tank t2 = (Tank) o2;
            if (t1.getRect().intersects(t2.getRect())) {
                t1.back();
                t2.back();
                //t2.stop();
            }
        }
        return true;
    }
}
