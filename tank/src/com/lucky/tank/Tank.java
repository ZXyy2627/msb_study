package com.lucky.tank;

import java.awt.*;

public class Tank {
    private int x=200,y=200;
    private static final int SPEED = 5;
    private Dir dir = Dir.DOWN;
    private TankFrame tf = null;
    private boolean moving = false;
    public Tank(int x, int y, Dir dir,TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
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

        Bullet bullet = null;
        switch (dir){
            case UP:
                bullet = new Bullet(x+25,y,dir,tf);
               break;
            case DOWN:
                bullet = new Bullet(x+25,y+50,dir,tf);
                break;
            case LEFT:
                bullet = new Bullet(x,y+25,dir,tf);
                break;
            case RIGHT:
                bullet = new Bullet(x+50,y+25,dir,tf);
                break;
            default:
                break;
        }
        tf.bullets.add(bullet);
    }
}
