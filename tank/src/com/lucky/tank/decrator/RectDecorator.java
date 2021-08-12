package com.lucky.tank.decrator;

import com.lucky.tank.GameObject;

import java.awt.*;

/**
 * @Author: lucky_x
 * @Date: 2021/8/11 - 08 - 11 - 22:14
 * @Description: com.lucky.tank.decrator
 * @VERSION: 1.0
 */
public class RectDecorator extends GODecorator{
    public RectDecorator(GameObject go) {
        super(go);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Color c = g.getColor();
        g.setColor(Color.YELLOW);
        g.drawRect(super.go.x,super.go.y,super.go.getWidth()+2,super.go.getHeight()+2);
    }

    @Override
    public int getWidth() {
        return super.go.getWidth();
    }

    @Override
    public int getHeight() {
        return super.go.getHeight();
    }
}
