package com.lucky.tank;

import java.awt.*;

/**
 * @Author: lucky_x
 * @Date: 2021/8/9 - 08 - 09 - 21:27
 * @Description: com.lucky.tank
 * @VERSION: 1.0
 */
public abstract class GameObject {
    public int x,y;

    public abstract void paint(Graphics g);

    public abstract int getWidth();
    public abstract int getHeight();
}
