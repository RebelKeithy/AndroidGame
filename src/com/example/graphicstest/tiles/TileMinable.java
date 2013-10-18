package com.example.graphicstest.tiles;

import com.example.graphicstest.Player;
import com.example.graphicstest.world.World;

public class TileMinable extends Tile
{

    public TileMinable(int id)
    {
        super(id);
    }
    
    @Override
    public boolean isDestroyable(World world, int x, int y, int level)
    {
        return true;
    }

    @Override
    public void onDestroyed(World world, int x, int y, int level, Player players)
    {
        // TODO: Add loot dropping here;
    }
}
