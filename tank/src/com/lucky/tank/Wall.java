package com.lucky.tank;

import java.awt.*;

/**
 * @Author: lucky_x
 * @Date: 2021/8/11 - 08 - 11 - 20:51
 * @Description: com.lucky.tank
 * @VERSION: 1.0
 */
public class Wall extends GameObject{

    int w,h;
    public Rectangle rect;

    public Wall(int x,int y,int w,int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.rect = new Rectangle(x, y, w, h);
    }

    @Override
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.GRAY);
        g.fillRect(x,y,w,h);
        g.setColor(c);
    }

    @Override
    public int getWidth() {
        return w;
    }

    @Override
    public int getHeight() {
        return h;
    }
}
