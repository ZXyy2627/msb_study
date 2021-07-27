package com.lucky.tank;

import java.awt.*;

public class Bullet {
    public  static int WIDTH = ResourceMgr.bulletD.getWidth();
    public  static int HEIGHT = ResourceMgr.bulletD.getHeight();
    private int x,y;
    private static final int SPEED = 10;
    private Dir dir = Dir.DOWN;
    private boolean living = true;
    private TankFrame tf = null;
    private Group group = Group.BAD;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public Bullet(int x, int y, Dir dir,Group group,TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.group = group;
        this.tf = tf;
    }

    public void paint(Graphics g){
        if(!living){
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
        if(x<0 || y<0 || x>TankFrame.GAME_WIDTH || y > TankFrame.GAME_HEIGHT) living = false;
    }

    public void collideWith(Tank tank) {
        if(this.group == tank.getGroup()) return;

        //每次做碰撞检测的时候，都new一个Rectangle对象，其实应该只用一个 不该使用多个  这是一个小BUG
        Rectangle rect1 = new Rectangle(this.x ,this.y , WIDTH, HEIGHT);
        Rectangle rect2 = new Rectangle(tank.getX(), tank.getY(),Tank.WIDTH, Tank.HEIGHT);
        if (rect1.intersects(rect2)) {
            tank.die();
            this.die();
            int eX = tank.getX() + Tank.WIDTH / 2 - Explode.WIDTH / 2;
            int eY = tank.getY() + Tank.HEIGHT/2-Explode.HEIGHT/2;
            tf.explodes.add(new Explode(eX, eY, tf));
        }
    }

    private void die() {
        this.living = false;
    }
}
