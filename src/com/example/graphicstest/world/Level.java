package com.example.graphicstest.world;

import java.util.HashMap;
import java.util.Map;

import android.graphics.Canvas;

import com.example.graphicstest.render.Renderer;
import com.example.graphicstest.util.Coord;

public class Level
{
    private int depth;
    private Map<Coord, Chunk> chunks;

    public Level(int depth)
    {
        chunks = new HashMap<Coord, Chunk>();
        this.depth = depth;
    }
    
    public void addChunk(Chunk chunk, int chunkX, int chunkY)
    {
        chunks.put(new Coord(chunkX, chunkY), chunk);
    }
    
    public Chunk getChunk(int chunkX, int chunkY)
    {
        Coord chunkCoords = new Coord(chunkX, chunkY);
        return chunks.get(chunkCoords);
    }

    public void draw(Canvas canvas)
    {
        // TODO Auto-generated method stub
        
    }

    public void render(Renderer renderer, World world)
    {
        for(Coord coord : chunks.keySet())
        {
            chunks.get(coord).render(renderer, world, coord.getX(), coord.getY());
        }
    }

}
