package com.lucky.tank;

import java.awt.*;

public abstract class AbstractBullet {
    public abstract void paint(Graphics g);

    public abstract void move();

    public abstract void collideWith(AbstractTank tank);

}
