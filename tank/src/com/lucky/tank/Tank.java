package com.lucky.tank;

import java.awt.*;
import java.util.Random;

public class Tank extends AbstractTank{
    public  static int WIDTH = ResourceMgr.goodTankD.getWidth();
    public  static int HEIGHT = ResourceMgr.goodTankD.getHeight();

    private static final int SPEED = 3;
    private Dir dir = Dir.DOWN;
    private TankFrame tf = null;
    private boolean moving = true;
    private boolean living = true;
    private Random random = new Random();



    public TankFrame getTf() {
        return tf;
    }

    public void setTf(TankFrame tf) {
        this.tf = tf;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Tank(int x, int y, Dir dir, Group group, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.group = group;
        this.tf = tf;

        rect.x = this.x;
        rect.y = this.y;
        rect.width = WIDTH;
        rect.height = HEIGHT;
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
                g.drawImage(this.group == Group.GOOD?ResourceMgr.goodTankU:ResourceMgr.badTankU,x,y,null);
                break;
            case DOWN:
                g.drawImage(this.group == Group.GOOD?ResourceMgr.goodTankD:ResourceMgr.badTankD,x,y,null);
                break;
            case LEFT:
                g.drawImage(this.group == Group.GOOD?ResourceMgr.goodTankL:ResourceMgr.badTankL,x,y,null);
                break;
            case RIGHT:
                g.drawImage(this.group == Group.GOOD?ResourceMgr.goodTankR:ResourceMgr.badTankR,x,y,null);
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


        if(this.group == Group.BAD && random.nextInt(100)>95) this.fire();

        if(this.group == Group.BAD)
            randomDir();

        boundsCheck();
        rect.x = this.x;
        rect.y = this.y;
    }

    private void boundsCheck() {
        if(this.x < 0 ) x=0;
        if(this.y < 60) y=30;
        if(this.x > TankFrame.GAME_WIDTH - Tank.WIDTH)  x = TankFrame.GAME_WIDTH - Tank.WIDTH;
        if(this.y > TankFrame.GAME_HEIGHT - Tank.HEIGHT) y = TankFrame.GAME_HEIGHT - Tank.HEIGHT;
    }

    private void randomDir() {
        if(this.group == Group.BAD && random.nextInt(100)>95) this.dir = Dir.values()[random.nextInt(4)];
    }

    public void fire(){
       new MultiFireStrategy().fire(this);
    }

    public void die() {
        this.living = false;
    }
}
