package com.example.graphicstest.world;

import java.util.ArrayList;
import java.util.List;

import com.example.graphicstest.render.Renderer;
import com.example.graphicstest.tiles.Tile;
import com.example.graphicstest.util.Coord;
import com.example.graphicstest.world.generators.WorldGenerator;

public class World
{
    WorldGenerator generator;
    List<Level> levels;
    int maxLevels;
    
    public World(int maxLevels, WorldGenerator generator)
    {
        levels = new ArrayList<Level>();
        this.maxLevels = maxLevels;
        this.generator = generator;
    }
    
    public Tile getTile(int depth, int x, int y)
    {        
        Chunk chunk = getChunk(depth, x/16, y/16);
        return chunk.getTile(x%16, y%16);
    }
    
    public Chunk getChunk(int depth, int chunkX, int chunkY)
    {
        Level level = getLevel(depth);
        if(level.getChunk(chunkX, chunkY) == null)
        {
            level.addChunk(generator.generateChunk(new Coord(chunkX, chunkY), depth), chunkX, chunkY);
        }
        
        return level.getChunk(chunkX, chunkY);
    }
    
    public Level getLevel(int level)
    {
        if(!levels.contains(level))
            levels.add(new Level(level));
        
        return levels.get(level);
    }
    
    public void render(Renderer renderer)
    {
        for(Level level : levels)
        {
            level.render(renderer, this);
        }
    }
}
