package com.lucky.tank.cor;

import com.lucky.tank.Bullet;
import com.lucky.tank.GameObject;
import com.lucky.tank.Tank;

/**
 * @Author: lucky_x
 * @Date: 2021/8/9 - 08 - 09 - 22:09
 * @Description: com.lucky.tank.cor
 * @VERSION: 1.0
 */
public class BulletTankCollider  implements Collider{
    @Override
    public boolean collide(GameObject o1, GameObject o2) {
        if(o1 instanceof Bullet && o2 instanceof Tank){
            Bullet b = (Bullet) o1;
            Tank t = (Tank) o2;
            if (b.collideWith(t)) {
                return false;
            }
        } else if (o1 instanceof Tank && o2 instanceof Bullet) {
            return collide(o2, o1);
        }
        return true;
    }
}
