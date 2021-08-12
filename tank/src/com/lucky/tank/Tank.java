package com.lucky.tank;

import com.lucky.tank.strategy.DefaultFireStrategy;

import java.awt.*;
import java.util.Random;

//public class Tank extends AbstractTank{
public class Tank extends GameObject{
    public  static int WIDTH = ResourceMgr.goodTankD.getWidth();
    public  static int HEIGHT = ResourceMgr.goodTankD.getHeight();

    private static final int SPEED = 3;
    public Dir dir = Dir.DOWN;
    private boolean moving = true;
    private boolean living = true;
    private Random random = new Random();
    int oldX,oldY;
    Rectangle rect = new Rectangle();
    public Group group = Group.BAD;

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


    public Tank(int x, int y, Dir dir, Group group) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.group = group;


        rect.x = this.x;
        rect.y = this.y;
        rect.width = WIDTH;
        rect.height = HEIGHT;

        GameModel.getInstance().add(this);
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
        if(!living) GameModel.getInstance().remove(this);
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

    @Override
    public int getWidth() {
        return WIDTH;
    }

    @Override
    public int getHeight() {
        return HEIGHT;
    }

    public void move(){
        oldX = x;
        oldY = y;
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
        if(this.y < 30) y=30;
        if(this.x > TankFrame.GAME_WIDTH - Tank.WIDTH)  x = TankFrame.GAME_WIDTH - Tank.WIDTH;
        if(this.y > TankFrame.GAME_HEIGHT - Tank.HEIGHT) y = TankFrame.GAME_HEIGHT - Tank.HEIGHT;
    }

    private void randomDir() {
        if(this.group == Group.BAD && random.nextInt(100)>95) this.dir = Dir.values()[random.nextInt(4)];
    }

    public void fire(){
       new DefaultFireStrategy().fire(this);
    }

    public void die() {
        this.living = false;
    }

    public void stop() {
        moving = false;
    }

    public void back() {
        x = oldX;
        y = oldY;
    }
}
