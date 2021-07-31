package com.lucky.tank;

public class DefaultFactory extends AbstractFactory{
    @Override
    public AbstractTank createTank(int x, int y, Dir dir, Group group, TankFrame tf) {
        return new Tank(x, y, dir, group, tf);
    }

    @Override
    public AbstractBullet createBullet(int x, int y, Dir dir,Group group,TankFrame tf) {
        return new Bullet(x,y,dir,group,tf);
    }

    @Override
    public AbstractExplode createExplode(int x, int y, TankFrame tf) {
        return new Explode(x,y,tf);
    }
}
