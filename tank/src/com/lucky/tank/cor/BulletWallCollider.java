package com.lucky.tank.cor;

import com.lucky.tank.*;

/**
 * @Author: lucky_x
 * @Date: 2021/8/9 - 08 - 09 - 22:09
 * @Description: com.lucky.tank.cor
 * @VERSION: 1.0
 */
public class BulletWallCollider implements Collider{
    @Override
    public boolean collide(GameObject o1, GameObject o2) {
        if(o1 instanceof Bullet && o2 instanceof Wall){
            Bullet b = (Bullet) o1;
            Wall w = (Wall) o2;
            if (b.rect.intersects(w.rect)) {
                b.die();
            }
        } else if (o1 instanceof Wall && o2 instanceof Bullet) {
            return collide(o2, o1);
        }
        return true;
    }
}
