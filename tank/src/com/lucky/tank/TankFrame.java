package com.lucky.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.ArrayList;

public class TankFrame extends Frame {
    static final int GAME_WIDTH = 800,GAME_HEIGHT = 600;
    Tank tank = new Tank(200,400,Dir.DOWN, Group.GOOD,this);
    List<Bullet> bullets = new ArrayList<Bullet>();
    List<Tank> enemies = new ArrayList<>();
    List<Explode> explodes = new ArrayList<>();

    //Explode e = new Explode(100, 100, this);
    public TankFrame(){
        setVisible(true);
        setSize(800,600);
        setResizable(false);
        setTitle("坦克大战");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //添加键盘监听
        addKeyListener(new MyKeyListener());
    }

    Image offScreenImage = null;

    @Override
    public void update(Graphics g) {
        if (offScreenImage == null) {
            offScreenImage = this.createImage(GAME_WIDTH,GAME_HEIGHT);
        }
        Graphics gOffScreen = offScreenImage.getGraphics();
        Color color = gOffScreen.getColor();
        gOffScreen.setColor(Color.BLACK);
        gOffScreen.fillRect(0,0,GAME_WIDTH,GAME_HEIGHT);
        gOffScreen.setColor(color);
        paint(gOffScreen);
        g.drawImage(offScreenImage, 0, 0, null);
    }

    @Override
    public void paint(Graphics g) {
        Color color = g.getColor();
        g.setColor(Color.WHITE);
        g.drawString("子弹的数量是:"+bullets.size(),10,60);
        g.drawString("坦克的数量是:"+enemies.size(),10,90);
        g.drawString("爆炸额数量是:"+explodes.size(),10,120);
        g.setColor(color);
        tank.paint(g);
        for (int i = 0; i < bullets.size(); i++) {
            bullets.get(i).paint(g);
        }

        for (int i = 0; i < enemies.size(); i++) {
            enemies.get(i).paint(g);
        }

        for (int i = 0; i < explodes.size(); i++) {
            explodes.get(i).paint(g);
        }
        //碰撞检测
        for (int i = 0; i < bullets.size(); i++) {
            for (int j = 0; j < enemies.size(); j++) {
                bullets.get(i).collideWith(enemies.get(j));
            }
        }




    }

    class MyKeyListener extends KeyAdapter{
        boolean up = false;
        boolean down = false;
        boolean left = false;
        boolean right = false;
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_UP:
                    up = true;
                    break;
                case KeyEvent.VK_DOWN:
                    down = true;
                    break;
                case KeyEvent.VK_LEFT:
                    left = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    right = true;
                    break;
                default:
                    break;
            }
            setMainTankDir();
        }



        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_UP:
                    up = false;
                    break;
                case KeyEvent.VK_DOWN:
                    down = false;
                    break;
                case KeyEvent.VK_LEFT:
                    left = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    right = false;
                    break;
                case KeyEvent.VK_CONTROL:
                    tank.fire();
                default:
                    break;
            }
            setMainTankDir();
        }

        private void setMainTankDir() {
            if(!up && !down && !left && !right){
                tank.setMoving(false);
            }else{
                tank.setMoving(true);
                if(up) tank.setDir(Dir.UP);
                if(down) tank.setDir(Dir.DOWN);
                if(left) tank.setDir(Dir.LEFT);
                if(right) tank.setDir(Dir.RIGHT);
            }
        }
    }
}
