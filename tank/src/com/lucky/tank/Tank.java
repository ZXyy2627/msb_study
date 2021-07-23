package com.lucky.tank;

import java.awt.*;

public class Tank {
    private int x=200,y=200;
    private static final int SPEED = 5;
    private Dir dir = Dir.DOWN;

    private boolean moving = false;
    public Tank(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public void paint(Graphics g){
        //画一个方块代替坦克 颜色是黄色
        Color color = g.getColor();
        g.setColor(Color.YELLOW);
        g.fillRect(x,y,50,50);
        g.setColor(color);
    }

    public void move(){
        if(!moving) return;
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
