package com.kxl.atu.nineclockview.bean;

import java.io.Serializable;

/**
 * Description:
 * Author:ATU
 * Date:2017/10/10  9:52
 */
public class Point implements Serializable
{
    private float x;
    private float y;

    public Point(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public float getX()
    {
        return x;
    }

    public void setX(float x)
    {
        this.x = x;
    }

    public float getY()
    {
        return y;
    }

    public void setY(float y)
    {
        this.y = y;
    }
}
