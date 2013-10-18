package com.example.graphicstest;

import com.example.graphicstest.render.Renderer;
import com.example.graphicstest.world.World;

public class Player
{
    private int x;
    private int y;
    
    private World currentWorld;
    private int currentLevel;
    
    public Player()
    {
        x = 100;
        y = 100;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public int getLevel()
    {
        return currentLevel;
    }
    
    public World getWorld()
    {
        return currentWorld;
    }
    
    public void setLevel(int level)
    {
        currentLevel = level;
    }
    
    public void setWorld(World world)
    {
        currentWorld = world;
    }
    
    public void render(Renderer renderer)
    {
        renderer.drawSprite("player", x, y);
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}
