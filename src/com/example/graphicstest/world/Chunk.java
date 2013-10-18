package com.example.graphicstest.world;

import com.example.graphicstest.render.Renderer;
import com.example.graphicstest.tiles.Tile;

public class Chunk
{
    short[][] tiles;
    
    public Chunk()
    {
        tiles = new short[16][16];
    }

    public Chunk(short[][] tiles)
    {  
        this.tiles = tiles;
    }

    public void render(Renderer renderer, World world, int chunkX, int chunkY)
    {
        for(int i = 0; i < 16; i++)
        {
            for(int y = 0; y < 16; y++)
            {
                Tile.tileList.get(tiles[i][y]).render(renderer, world, i + chunkX * 16, y + chunkY * 16);
            }
        }
    }

    public Tile getTile(int x, int y)
    {
        return Tile.tileList.get(tiles[x%16][y%16]);
    }
}
