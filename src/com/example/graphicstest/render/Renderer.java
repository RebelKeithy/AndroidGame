package com.example.graphicstest.render;

import android.graphics.Canvas;

import com.example.graphicstest.GameEngine;
import com.example.graphicstest.util.Coord;

public class Renderer
{
    Canvas canvas;
    Coord center;
    
    public Renderer(Canvas canvas)
    {
        this.canvas = canvas;
        center = new Coord(0, 0);
    }
    
    public void render()
    {
        GameEngine.instance().getWorld().render(this);
        GameEngine.instance().getPlayer().render(this);
    }
    
    public void drawSprite(String name, int x, int y)
    {
        SpriteTile sprite = SpriteManager.instance().getSprite(name);
        
        if(sprite == null)
        {
            System.out.println("Error: Sprit " + name + " not found");
        }
        
        sprite.draw(canvas, x*32 - center.getX(), y*32 - center.getY());
    }

    public void setCenter(int x, int y)
    {
        center = new Coord(x - canvas.getWidth()/2, y - canvas.getHeight()/2);
    }
}
