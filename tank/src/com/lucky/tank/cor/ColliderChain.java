package com.lucky.tank.cor;

import com.lucky.tank.GameObject;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: lucky_x
 * @Date: 2021/8/11 - 08 - 11 - 19:11
 * @Description: com.lucky.tank.cor
 * @VERSION: 1.0
 */
public class ColliderChain implements Collider{
    private List<Collider> colliders = new LinkedList<>();

    public ColliderChain() {
        add(new BulletTankCollider());
        add(new TankTankCollider());
        add(new BulletWallCollider());
    }

    public void add(Collider collider) {
        colliders.add(collider);
    }

    public boolean collide(GameObject o1, GameObject o2) {
        for (int i = 0; i < colliders.size(); i++) {
            if(!colliders.get(i).collide(o1,o2)) return false;
        }
        return true;
    }
}
