package com.example.graphicstest.util;

public class Coord implements Comparable<Coord>
{
    private int x;
    private int y;
    
    public Coord(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public Coord(Coord coord)
    {
        this.x = coord.getX();
        this.y = coord.getY();
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
    
    @Override
    public boolean equals(Object other)
    {
        if(other instanceof Coord)
        {
            Coord c = (Coord) other;
            return c.x == x && c.y == y;
        }
        
        return false;
    }
    
    @Override
    public int compareTo(Coord o)
    {
        if(x == o.x)
        {
            return y - o.y;
        }
        
        return x - o.x;
    }
    
    @Override
    public int hashCode()
    {
        return (x << 16) | ((y << 16) >> 16);
    }

    public Object copy()
    {
        return new Coord(x, y);
    }
}
