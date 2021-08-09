package com.lucky.tank;

import java.awt.*;
import java.util.ArrayList;

public class GameModel {

    Tank tank = new Tank(200,400,Dir.DOWN, Group.GOOD,this);

    public java.util.List<GameObject> objects = new ArrayList<>();

    public void add(GameObject gameObject) {
        this.objects.add(gameObject);
    }

    public void addAll(java.util.List<GameObject> list){
        this.objects.addAll(list);
    }

    public void remove(GameObject gameObject) {
        this.objects.remove(gameObject);
    }

    public GameModel() {
        int initTankCount = Integer.parseInt((String)PropertyMgr.get("initTankCount"));
        for(int i=0;i<initTankCount;i++){
            add(new Tank(50 + i * 80, 200, Dir.DOWN,Group.BAD, this));
            //tf.enemies.add((Tank) defaultFactory.createTank(50 + i * 80, 200, Dir.DOWN,Group.BAD, tf));
        }
    }


    public void paint(Graphics g) {
        Color color = g.getColor();
        g.setColor(Color.WHITE);
//        g.drawString("子弹的数量是:"+bullets.size(),10,60);
//        g.drawString("坦克的数量是:"+enemies.size(),10,90);
//        g.drawString("爆炸额数量是:"+explodes.size(),10,120);
        g.setColor(color);
        tank.paint(g);
        for (int i = 0; i < objects.size(); i++) {
            objects.get(i).paint(g);
        }
        //碰撞检测
//        for (int i = 0; i < bullets.size(); i++) {
//            for (int j = 0; j < enemies.size(); j++) {
//                bullets.get(i).collideWith(enemies.get(j));
//            }
//        }

    }

    public Tank getMainTank() {
        return tank;
    }
}
