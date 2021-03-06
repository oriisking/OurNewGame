package com.example.user.newgame;

/**
 * Created by user on 07/07/2017.
 */
import java.math.*;

public class Point {

    //Data Members
    private int x;
    private int y;

    //Constructors

    /**
     * Building a new instance of a point, and initializing the coordinates to 0.
     */
    public Point()
    {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Building a new instance of a point using 2 coordinates
     *
     * @param x - The x coordinate of the point
     * @param y - The y coordinate of the point
     */
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Returning the value of the x coordinate
     *
     * @return
     */
    public int getX() {
        return this.x;
    }


    /**
     * Returning the value of the y coordinate
     *
     * @return
     */
    public int getY() {
        return this.y;
    }


    /**
     * Setting the x coordinate
     *
     * @param x
     */
    public void setX(int x)
    {
        this.x = x;
    }



    /**
     * Setting the y coordinate
     *
     * @param y
     */
    public void setY(int y)
    {
        this.y = y;
    }


    /**
     * A method to calculate the distance between this point and another point.
     *
     * @param p - A new point to use for distance
     * @return a double with the distance included
     */
    public double distance(Point p)
    {
        double dX = (double)this.x - (double)p.x;
        double dY = (double)this.y - (double)p.y;
        return Math.sqrt((Math.pow(dX,2) + Math.pow(dY,2)));
    }



}
