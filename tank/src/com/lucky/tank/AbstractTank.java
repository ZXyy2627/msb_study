package com.lucky.tank;

import java.awt.*;

public abstract class AbstractTank {
    int x=200,y=200;
    Rectangle rect = new Rectangle();
    Group group = Group.BAD;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Rectangle getRect() {
        return rect;
    }

    public void setRect(Rectangle rect) {
        this.rect = rect;
    }

    public abstract void paint(Graphics g);
    public abstract void move();
    public abstract void fire();
    public abstract void die();
}
