package com.lucky.tank;

import java.awt.*;

public class Tank {
    public  static int WIDTH = ResourceMgr.tankD.getWidth();
    public  static int HEIGHT = ResourceMgr.tankD.getHeight();

    private int x=200,y=200;
    private static final int SPEED = 5;
    private Dir dir = Dir.DOWN;
    private TankFrame tf = null;
    private boolean moving = false;
    private boolean living = true;
    public Tank(int x, int y, Dir dir,TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
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
        if(!living) tf.enemies.remove(this);
        switch (dir) {
            case UP:
                g.drawImage(ResourceMgr.tankU,x,y,null);
                break;
            case DOWN:
                g.drawImage(ResourceMgr.tankD,x,y,null);
                break;
            case LEFT:
                g.drawImage(ResourceMgr.tankL,x,y,null);
                break;
            case RIGHT:
                g.drawImage(ResourceMgr.tankR,x,y,null);
                break;
        }
        move();
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

    public void fire(){
        int bX = x+Tank.WIDTH/2-Bullet.WIDTH/2;
        int bY = y+Tank.HEIGHT/2-Bullet.HEIGHT/2;
        tf.bullets.add(new Bullet(bX,bY,this.dir,this.tf));
    }

    public void die() {
        this.living = false;
    }
}
