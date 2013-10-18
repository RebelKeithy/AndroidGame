package com.example.graphicstest.render;

import com.example.graphicstest.GameEngine;
import com.example.graphicstest.Player;

public class Camera
{
    private int x;
    private int y;
    
    private float speed;
    private static float maxSpeed = 9;
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void update()
    {
        Player player = GameEngine.instance().getPlayer();
        
        int dx = player.getX() - x;
        int dy = player.getY() - y;
        
        float mag = (float) Math.sqrt(dx*dx + dy*dy);
        
        if(speed < maxSpeed)
        {
            speed += 1;
        }
        
        if(mag > speed)
        {
            dx *= speed/mag;
            dy *= speed/mag;
            
            x += dx;
            y += dy;
        } 
        else 
        {
            speed = 0;
            x = player.getX();
            y = player.getY();
        }
    }
}
