package com.company;

/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    //Сравнение двух точек
    public boolean equals(Object o)
    {
        Location location = (Location) o;
        return ((xCoord==location.xCoord)&&(yCoord==location.yCoord));
    }
    //Возврващение кода
    public int hashCode()
    {
        return(xCoord+yCoord);
    }
}
