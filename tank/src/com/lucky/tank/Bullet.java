package com.lucky.tank;

import java.awt.*;

public class Bullet {
    public  static int WIDTH = ResourceMgr.bulletD.getWidth();
    public  static int HEIGHT = ResourceMgr.bulletD.getHeight();
    private int x,y;
    private static final int SPEED = 10;
    private Dir dir = Dir.DOWN;
    private boolean live = true;
    private TankFrame tf = null;

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public Bullet(int x, int y, Dir dir,TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
    }

    public void paint(Graphics g){
        if(!live){
            tf.bullets.remove(this);
        }
        switch (dir) {
            case UP:
                g.drawImage(ResourceMgr.bulletU,x,y,null);
                break;
            case DOWN:
                g.drawImage(ResourceMgr.bulletD,x,y,null);
                break;
            case LEFT:
                g.drawImage(ResourceMgr.bulletL,x,y,null);
                break;
            case RIGHT:
                g.drawImage(ResourceMgr.bulletR,x,y,null);
                break;
        }
        move();
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
        if(x<0 || y<0 || x>TankFrame.GAME_WIDTH || y > TankFrame.GAME_HEIGHT) live = false;
    }
}
