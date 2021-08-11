package com.lucky.tank.cor;

import com.lucky.tank.GameObject;

/**
 * @Author: lucky_x
 * @Date: 2021/8/9 - 08 - 09 - 22:07
 * @Description: com.lucky.tank.cor
 * @VERSION: 1.0
 */
public interface Collider {
    boolean collide(GameObject o1,GameObject o2);
}
