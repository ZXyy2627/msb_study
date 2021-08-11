package com.lucky.tank.strategy;

import com.lucky.tank.Bullet;
import com.lucky.tank.GameModel;
import com.lucky.tank.Tank;

public class DefaultFireStrategy implements FireStrategy {

    @Override
    public void fire(Tank tank) {
        int bX = tank.getX()+Tank.WIDTH/2- Bullet.WIDTH/2;
        int bY = tank.getY()+Tank.HEIGHT/2-Bullet.HEIGHT/2;
        GameModel.getInstance().add(new Bullet(bX,bY,tank.getDir(),tank.getGroup()));
    }
}
