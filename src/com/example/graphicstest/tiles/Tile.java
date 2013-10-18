package com.example.graphicstest.tiles;

import java.util.HashMap;
import java.util.Map;

import com.example.graphicstest.Player;
import com.example.graphicstest.render.Renderer;
import com.example.graphicstest.world.World;

public class Tile
{
    public static Map<Short, Tile> tileList = new HashMap<Short, Tile>();
    public static Tile wall = new Tile(0).setImage("wall");
    public static Tile dirt_uncovered = new Tile(1).setImage("dirt");
    public static Tile dirt_unmined = new Tile(2).setImage("dirt");
    public static Tile rock = new Tile(3).setImage("wall");
    public static Tile hole = new Tile(4).setImage("wall");
    
    private short id;
    private String image;
    
    public Tile(int id)
    {
        this.id = (short) id;
        
        tileList.put(this.id, this);
    }
    
    private Tile setImage(String image)
    {
        this.image = image;
        return this;
    }
    
    public short tileID()
    {
        return id;
    }
    
    public boolean isDestroyable(World world, int x, int y, int level)
    {
        return false;
    }
    
    public void onDestroyed(World world, int x, int y, int level, Player player)
    {
        
    }

    public void render(Renderer renderer, World world, int x, int y)
    {
        renderer.drawSprite(image, x, y);
    }
}
