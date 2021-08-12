package com.lucky.tank.decrator;

import com.lucky.tank.GameObject;

import java.awt.*;

/**
 * @Author: lucky_x
 * @Date: 2021/8/11 - 08 - 11 - 22:12
 * @Description: com.lucky.tank.decrator
 * @VERSION: 1.0
 */
public abstract class GODecorator extends GameObject {
    GameObject go;

    public GODecorator(GameObject go) {
        this.go = go;
    }

    @Override
    public void paint(Graphics g) {
        go.paint(g);
    }
}
