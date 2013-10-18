package com.example.graphicstest.world.generators;

import com.example.graphicstest.tiles.Tile;
import com.example.graphicstest.util.Coord;
import com.example.graphicstest.world.Chunk;

public class WorldGeneratorBox implements WorldGenerator
{

    @Override
    public Chunk generateChunk(Coord chunkCoords, int depth)
    {
        short[][] tiles = new short[16][16];
        
        for(int x = 0; x < 16; x++)
        {
            for(int y = 0; y < 16; y++)
            {
                if(x == 0 || x == 15 || y == 0 || y == 15)
                {
                    tiles[x][y] = Tile.wall.tileID();
                }
                else if(chunkCoords.getX() == 0 && chunkCoords.getY() == 0)
                {
                    tiles[x][y] = Tile.dirt_unmined.tileID();
                }
                else
                {
                    tiles[x][y] = Tile.wall.tileID();
                }
            }
        }
        
        Chunk chunk = new Chunk(tiles);
        return chunk;
    }

}
