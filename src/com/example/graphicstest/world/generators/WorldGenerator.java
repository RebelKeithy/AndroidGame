package com.example.graphicstest.world.generators;

import com.example.graphicstest.util.Coord;
import com.example.graphicstest.world.Chunk;

public interface WorldGenerator
{
    public Chunk generateChunk(Coord chunkCoords, int depth);
}
