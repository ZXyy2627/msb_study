package com.lucky.tank;

import java.util.ArrayList;
import java.util.List;

public class MultiFireStrategy implements FireStrategy{
    @Override
    public void fire(Tank tank) {
        int bX = tank.getX()+Tank.WIDTH/2-Bullet.WIDTH/2;
        int bY = tank.getY()+Tank.HEIGHT/2-Bullet.HEIGHT/2;
        List<Bullet> multiBullets = new ArrayList<>();
        multiBullets.add(new Bullet(bX,bY,Dir.DOWN,tank.getGroup(), tank.getGm()));
        multiBullets.add(new Bullet(bX,bY,Dir.UP,tank.getGroup(), tank.getGm()));
        multiBullets.add(new Bullet(bX,bY,Dir.LEFT,tank.getGroup(), tank.getGm()));
        multiBullets.add(new Bullet(bX,bY,Dir.RIGHT,tank.getGroup(), tank.getGm()));
        tank.getGm().bullets.addAll(multiBullets);
    }
}
