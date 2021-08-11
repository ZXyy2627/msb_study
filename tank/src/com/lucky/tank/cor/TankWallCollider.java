package com.lucky.tank.cor;

import com.lucky.tank.GameObject;
import com.lucky.tank.Tank;
import com.lucky.tank.Wall;

/**
 * @Author: lucky_x
 * @Date: 2021/8/11 - 08 - 11 - 21:09
 * @Description: com.lucky.tank.cor
 * @VERSION: 1.0
 */
public class TankWallCollider implements Collider{
    @Override
    public boolean collide(GameObject o1, GameObject o2) {
        if(o1 instanceof Tank && o2 instanceof Wall){
            Tank t = (Tank) o1;
            Wall w = (Wall) o2;
            if (t.getRect().intersects(w.rect)) {
                t.back();
            }
        } else if (o1 instanceof Wall && o2 instanceof Tank) {
            return collide(o2, o1);
        }
        return true;
    }
}
