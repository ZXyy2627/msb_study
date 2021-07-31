package com.lucky.tank;

public abstract class AbstractFactory {
    public abstract AbstractTank createTank(int x, int y, Dir dir, Group group, TankFrame tf);
    public abstract AbstractBullet createBullet(int x, int y, Dir dir,Group group,TankFrame tf);
    public abstract AbstractExplode createExplode(int x, int y, TankFrame tf);
}
