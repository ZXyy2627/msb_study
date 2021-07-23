package com.lucky.tank;

import java.awt.*;

public class Bullet {
    private int x = 200,y=200;
    private static final int SPEED = 10;
    private Dir dir = Dir.DOWN;

    public Bullet(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g){
        Color color = g.getColor();
        g.setColor(Color.RED);
        g.fillOval(x,y,10,10);
        g.setColor(color);
    }

    public void move(){
        switch (dir) {
            case UP:
                y-=SPEED;
                break;
            case DOWN:
                y+=SPEED;
                break;
            case LEFT:
                x-=SPEED;
                break;
            case RIGHT:
                x+=SPEED;
                break;
        }
    }
}
